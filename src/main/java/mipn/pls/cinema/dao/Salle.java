package mipn.pls.cinema.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data  @AllArgsConstructor  @NoArgsConstructor  @ToString
public class Salle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double nombrePlaces;
    @OneToMany(mappedBy = "ville")
    private Collection<Cinema> cinemas;
    @OneToMany(mappedBy = "salle")
    private Collection<Place> places;
    @ManyToOne
    private Cinema cinema;
    @OneToMany(mappedBy = "salle")
    private Collection<ProjectionFilm> projectionFilms;
}
