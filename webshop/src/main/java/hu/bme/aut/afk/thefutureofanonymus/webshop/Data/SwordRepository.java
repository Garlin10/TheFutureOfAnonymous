package hu.bme.aut.afk.thefutureofanonymus.webshop.Data;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Entities.Sword;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SwordRepository extends JpaRepository<Sword, UUID> {
    Sword findSwordByType(String type);
}
