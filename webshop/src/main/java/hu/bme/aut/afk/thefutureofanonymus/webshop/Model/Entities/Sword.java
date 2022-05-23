package hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class Sword extends Product{

    @Id
    @GeneratedValue
    public UUID id;
    public String type;
    public Integer lenght;

}
