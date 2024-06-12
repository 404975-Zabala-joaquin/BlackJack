package ar.edu.utn.frc.tup.lciii.entities;

import ar.edu.utn.frc.tup.lciii.models.Round;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false)
    private Long id;

    @JoinColumn(name = "player_id")
    @ManyToOne
    private PlayerEntity player1;

    @JoinColumn(name = "playerApp_id")
    @ManyToOne
    private PlayerEntity player2;

    @OneToMany(mappedBy = "match")
    private List<RoundEntity> plays;

}
