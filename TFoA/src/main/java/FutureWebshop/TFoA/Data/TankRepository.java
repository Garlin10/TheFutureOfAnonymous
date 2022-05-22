package FutureWebshop.TFoA.Data;

import FutureWebshop.TFoA.Entities.Tank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TankRepository extends JpaRepository<Tank, UUID> {
    Tank findTankByName(String name);
}
