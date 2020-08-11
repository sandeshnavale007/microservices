////package com.management.education.common;
//
//import java.security.Key;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.crypto.spec.SecretKeySpec;
//import javax.xml.bind.DatatypeConverter;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import com.management.education.entity.EducationUser;
//
//import io.jsonwebtoken.JwtBuilder;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//@Component
//public final class TokenManager {
//
//    public static final String CMS_USER = "CMS_USER";
//
//    private static String secretKey="Ip0jPQ/4&|8K@|$usx(~Lx]e{mt+$8^yfu(/mx%7-Q4pN>+ga!_:cyf.?QZIP%2z";
//    
//
//    public static String issueToken(EducationUser commonCmsUserResponse, long ttlMillis) {
//
//        try {
//            // The JWT signature algorithm we will be using to sign the token
//            SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
//
//            long nowMillis = System.currentTimeMillis();
//            Date now = new Date(nowMillis);
//
//            // We will sign our JWT with our ApiKey secret
//            byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(secretKey);
//            Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
//
//            // Adding only the essential properties of User in JWT Token
//            Map<String, Object> userMap = new HashMap<>();
//            userMap.put("id", commonCmsUserResponse.getId());
//            userMap.put("email", commonCmsUserResponse.getEmail());
//            userMap.put("logInUserType", CMS_USER);
//
//            // Let's set the JWT Claims
//            JwtBuilder builder = Jwts.builder().claim("userMap", userMap)
//                    .setId(Integer.toString(commonCmsUserResponse.getId())).setIssuedAt(now)
//                    .signWith(signatureAlgorithm, signingKey);
//
//            // if it has been specified, let's add the expiration
//            if (ttlMillis > 0) {
//                long expMillis = nowMillis + ttlMillis;
//                Date exp = new Date(expMillis);
//                builder.setExpiration(exp);
//            }
//
//            // Builds the JWT and serializes it to a compact, URL-safe string
//            return builder.compact();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    public String getSecretKey() {
//        return secretKey;
//    }
//
////    @Value("${token.secretekey}")
//    public void setSecretKey(String secretKey) {
//        TokenManager.secretKey = secretKey;
//    }
//
//}
