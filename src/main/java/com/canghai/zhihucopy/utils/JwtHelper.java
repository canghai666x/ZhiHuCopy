package com.canghai.zhihucopy.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JwtHelper {
    private static final SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
    private static final String secret="zhihucopy@!#$%";

    /**
     * @Description: 创建token
     * @Params: [id, name, ttlMillis]
     * @returns: java.lang.String jwt
     * @Author: CangHai
     * @Date: 2019/6/1
     */
    public static String createJWT(String id,String name,long ttlMillis){
        long nowMillis =System.currentTimeMillis();
        Date now = new Date(nowMillis);

        JwtBuilder builder = Jwts.builder().setId(id)
                .setSubject(name)
                .setIssuedAt(now)
                .signWith(signatureAlgorithm,secret);
        if (ttlMillis>0){
            long expMillis = nowMillis+ttlMillis;
            Date expDate = new Date(expMillis);
            builder.setExpiration(expDate);
        }
        return builder.compact();
    }

    public static Claims parseJWT(String jwt){
        try {
            Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(jwt).getBody();
            System.out.println("ID:"+claims.getId());
            System.out.println("Name:"+claims.getSubject());
            System.out.println("Expiration:"+claims.getExpiration());
            return claims;
        }catch (Exception e){
            return null;
        }
    }

}
