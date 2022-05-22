package hu.bme.aut.afk.thefutureofanonymus.webshop.Service;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.SwordDTO;
import org.springframework.stereotype.Service;

@Service
public interface SwordService {
    void createSword(SwordDTO swordDTO);
}
