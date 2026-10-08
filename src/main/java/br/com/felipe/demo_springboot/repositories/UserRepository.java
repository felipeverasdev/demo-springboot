package br.com.felipe.demo_springboot.repositories;

import br.com.felipe.demo_springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
