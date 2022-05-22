package FutureWebshop.TFoA.Data;

import FutureWebshop.TFoA.Entities.Sword;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SwordRepository extends JpaRepository<Sword, UUID> {
    Sword findSwordByType(String type);
}
