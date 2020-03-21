package mipn.pls.cinema.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Place {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero;
    private Double longitude,altitude,latitude;
    @ManyToOne
    private Salle salle;
    @OneToMany(mappedBy = "place")
    private Collection<Ticket> tickets;

}