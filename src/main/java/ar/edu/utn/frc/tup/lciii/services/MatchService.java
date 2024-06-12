package ar.edu.utn.frc.tup.lciii.services;

import ar.edu.utn.frc.tup.lciii.dtos.MatchDto;
import ar.edu.utn.frc.tup.lciii.models.Match;
import org.springframework.stereotype.Service;

@Service
public interface MatchService {
    Match getMatchById(Long id);
    Match createMatch(MatchDto matchDto);
}
