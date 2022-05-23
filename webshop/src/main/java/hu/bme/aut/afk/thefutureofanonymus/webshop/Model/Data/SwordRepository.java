package hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Data;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.Sword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SwordRepository extends JpaRepository<Sword, UUID> {
    Sword findSwordByType(String type);
}
