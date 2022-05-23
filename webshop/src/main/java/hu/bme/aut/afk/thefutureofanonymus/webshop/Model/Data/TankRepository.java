package hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Data;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.Tank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TankRepository extends JpaRepository<Tank, UUID> {
    Tank findTankByName(String name);
}
