package br.com.felipe.demo_springboot.resources;

import br.com.felipe.demo_springboot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User usr = new User(1L, "Maria Silva", "mariasilva@email.com", "11997914551", "123456");
        return ResponseEntity.ok().body(usr);
    }

}
