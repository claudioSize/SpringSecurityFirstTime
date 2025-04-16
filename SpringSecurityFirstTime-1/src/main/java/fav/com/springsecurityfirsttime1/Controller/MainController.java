package fav.com.springsecurityfirsttime1.Controller;


import fav.com.springsecurityfirsttime1.Entitys.DTOClaim;
import fav.com.springsecurityfirsttime1.Entitys.DTOUser;
import fav.com.springsecurityfirsttime1.Service.valdation;
import fav.com.springsecurityfirsttime1.Service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class MainController {
    @Autowired
    ServiceUser newUser;
    @Autowired
    valdation validation;
    
    @GetMapping("/hola/")
    public String getHola(){
        return "hola";
    }
    @PostMapping("/login/")
    public ResponseEntity<String> loginUsers(@RequestBody DTOUser user){

        return ResponseEntity.ok(newUser.loginUser(user));
    }
    @GetMapping("/token/")
    public ResponseEntity<String> funko(@RequestHeader("Authorization") String token){
        validation.tokens(token);
        return ResponseEntity.ok("holaaaaa");
    }
    @GetMapping("/holaanimo/")
    public ResponseEntity<DTOClaim> hola(@RequestHeader("Authorization") String toke){

        return ResponseEntity.ok(validation.getClamins(toke));
    }
    @PostMapping("/register/")
    public ResponseEntity<HttpStatus> createUser(@RequestBody DTOUser user){
        newUser.createUser(user);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
}
