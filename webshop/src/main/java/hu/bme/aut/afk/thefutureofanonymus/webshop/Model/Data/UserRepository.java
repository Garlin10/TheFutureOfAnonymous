package hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Data;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);
}
