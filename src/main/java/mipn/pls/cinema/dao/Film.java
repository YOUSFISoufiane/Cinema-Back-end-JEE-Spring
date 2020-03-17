package mipn.pls.cinema.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Film {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private Double duree;
    private String photo;
    private String realisateur;
    private Date dateSortie;
    @OneToMany(mappedBy = "film")
    private Collection<ProjectionFilm> projectionFilms;
    @ManyToOne
    private Categories categorie;
}
