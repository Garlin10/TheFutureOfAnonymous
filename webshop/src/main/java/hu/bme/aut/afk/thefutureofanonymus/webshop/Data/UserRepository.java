package hu.bme.aut.afk.thefutureofanonymus.webshop.Data;

import hu.bme.aut.afk.thefutureofanonymus.webshop.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);
}
