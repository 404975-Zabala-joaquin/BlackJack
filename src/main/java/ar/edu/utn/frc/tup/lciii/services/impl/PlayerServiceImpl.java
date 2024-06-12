package ar.edu.utn.frc.tup.lciii.services.impl;

import ar.edu.utn.frc.tup.lciii.entities.PlayerEntity;
import ar.edu.utn.frc.tup.lciii.models.Player;
import ar.edu.utn.frc.tup.lciii.repositories.PLayerJpaRepository;
import ar.edu.utn.frc.tup.lciii.services.PlayerService;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PLayerJpaRepository pLayerJpaRepository;

    @Qualifier("modelMaper")
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public Player getById(Long id) {
        PlayerEntity playerEntity = pLayerJpaRepository.getReferenceById(id);

        if(Objects.isNull(playerEntity.getName())){

            throw new EntityNotFoundException();
        }
        return modelMapper.map(playerEntity , Player.class);
    }

  /*  @Override
    public List<Player> getPlayers() {
        List<PlayerEntity> playerEntities = pLayerJpaRepository.findAll();

        if(Objects.isNull(playerEntities)){
            throw new EntityNotFoundException();
        }else {
            List<Player> players = modelMapper.map(playerEntities , List.class);
        }
    }*/
}
