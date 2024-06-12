package ar.edu.utn.frc.tup.lciii.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Round {
   private List<Card> cardsPlayer ;
   private List<Card> cardsApp ;
   private Player winner;
}
