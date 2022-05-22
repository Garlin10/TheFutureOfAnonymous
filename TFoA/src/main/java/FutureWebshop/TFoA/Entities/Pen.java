package FutureWebshop.TFoA.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.awt.*;
import java.util.UUID;


@Entity
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class Pen {

    @Id
    @GeneratedValue
    public UUID id;
    public Colour colour;
}
