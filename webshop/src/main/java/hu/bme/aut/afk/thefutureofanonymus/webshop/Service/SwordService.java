package hu.bme.aut.afk.thefutureofanonymus.webshop.Service;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.SwordDTO;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.Sword;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SwordService {
    void createSword(SwordDTO swordDTO);
    List<Sword> getSwords();
}
