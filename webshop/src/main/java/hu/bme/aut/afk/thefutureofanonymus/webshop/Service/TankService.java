package hu.bme.aut.afk.thefutureofanonymus.webshop.Service;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.TankDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface TankService {
    void createTank(TankDTO tankDTO);

}
