package hu.bme.aut.afk.thefutureofanonymus.webshop.Service;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.TankDTO;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.Tank;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TankService {
    void createTank(TankDTO tankDTO);
    List<Tank> getTanks();
}
