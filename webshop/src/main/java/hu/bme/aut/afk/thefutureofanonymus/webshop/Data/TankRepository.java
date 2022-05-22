package hu.bme.aut.afk.thefutureofanonymus.webshop.Data;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Entities.Tank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TankRepository extends JpaRepository<Tank, UUID> {
    Tank findTankByName(String name);
}
