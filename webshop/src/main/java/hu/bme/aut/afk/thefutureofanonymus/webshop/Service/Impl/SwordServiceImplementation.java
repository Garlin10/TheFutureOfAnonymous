package hu.bme.aut.afk.thefutureofanonymus.webshop.Service.Impl;

import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.DTO.SwordDTO;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Data.SwordRepository;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Model.Entities.Sword;
import hu.bme.aut.afk.thefutureofanonymus.webshop.Service.SwordService;

import java.util.List;

public class SwordServiceImplementation implements SwordService {

    private SwordRepository swordRepository;

    @Override
    public void createSword(SwordDTO swordDTO) {
        Sword newSword = Sword.builder()
                .type(swordDTO.type)
                .lenght(swordDTO.lenght)
                .build();
        swordRepository.save(newSword);
    }

    @Override
    public List<Sword> getSwords() {
        return swordRepository.findAll().stream().toList();
    }
}
