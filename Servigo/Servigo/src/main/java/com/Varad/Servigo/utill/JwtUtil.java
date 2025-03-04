package com.Varad.Servigo.utill;
import java.security.Key;
import java.util.*;
import java.util.function.Function;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public static final String SECRET = "gH7z4X1aG6Kf9Dp9M2VdPn8QwR5lN4zF2GvTjZ3XkY5CpA7U9E";

     private String createToken(Map<String, Object> claims, String userName) {


         return Jwts.builder()
                 .setClaims(claims)
                 .setSubject(userName)
                 .setIssuedAt(new Date(System.currentTimeMillis()))
                 .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 30))
                 .signWith(getSignKey(), SignatureAlgorithm.HS256).compact();
     }

private Key getSignKey() {

         byte[] keyBytes = Decoders.BASE64.decode(SECRET);
         return Keys.hmacShaKeyFor(keyBytes);

}
public String generateToken(String userName) {
         Map<String, Object> claims = new HashMap<>();
         return createToken(claims, userName);
}

private Claims extractAllClaims(String token)
{
    return Jwts
            .parser()
            .setSigningKey(getSignKey())
            .parseClaimsJws(token)
            .getBody();
}

public <T> T extractClaim(String token, Function<Claims,T> claimsResolver){
         final Claims claims = extractAllClaims(token);
         return claimsResolver.apply(claims);
}

public Date extractExpiration(String token) {
         return extractClaim(token, Claims::getExpiration);
}

public String extractUsername(String token) {
         return extractClaim(token, Claims::getSubject);
}

private Boolean isTokenExpired(String token) {
         return extractExpiration(token).before(new Date());
}

public Boolean validateToken(String token, UserDetails userDetails) {
         final String username = extractUsername(token);
         return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
}
}
