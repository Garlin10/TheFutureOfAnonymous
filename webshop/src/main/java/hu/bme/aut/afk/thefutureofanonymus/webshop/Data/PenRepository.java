package hu.bme.aut.afk.thefutureofanonymus.webshop.Data;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Entities.Colour;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Entities.Pen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PenRepository extends JpaRepository<Pen, UUID> {
    Pen findPenByColour(Colour colour);
}
