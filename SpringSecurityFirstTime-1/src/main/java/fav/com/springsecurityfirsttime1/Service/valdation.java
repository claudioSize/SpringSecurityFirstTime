package fav.com.springsecurityfirsttime1.Service;

import fav.com.springsecurityfirsttime1.Entitys.DTOClaim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class valdation {
    @Autowired
    Jwt jwt;

    public void tokens(String token){

        String tokens = token.replace("Bearer ", "");
        if (!jwt.isTokenValid(tokens)) {
            throw new ResponseStatusException(HttpStatus.CONFLICT,"Token invalido");
        }
    }

    public DTOClaim getClamins(String toke){
        String tokens = toke.replace("Bearer ", "");
        return jwt.getClaims(tokens);
    }


}
