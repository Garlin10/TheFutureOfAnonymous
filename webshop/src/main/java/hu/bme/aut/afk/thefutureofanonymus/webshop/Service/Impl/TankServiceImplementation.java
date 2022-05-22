package hu.bme.aut.afk.thefutureofanonymus.webshop.Service.Impl;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.TankDTO;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Data.TankRepository;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.Tank;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Service.TankService;

public class TankServiceImplementation implements TankService {

    private TankRepository tankRepository;

    @Override
    public void createTank(TankDTO tankDTO) {
        Tank newTank = Tank.builder().
                name(tankDTO.name)
                .gunCaliber(tankDTO.gunCaliber)
                .build();
        tankRepository.save(newTank);
    }
}
