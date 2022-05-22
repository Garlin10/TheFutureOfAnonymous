package FutureWebshop.TFoA.Data;

import FutureWebshop.TFoA.Entities.Colour;
import FutureWebshop.TFoA.Entities.Pen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PenRepository extends JpaRepository<Pen, UUID> {
    Pen findPenByColour(Colour colour);
}
