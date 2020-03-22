package mipn.pls.cinema.dao;

import mipn.pls.cinema.entities.Projection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface ProjectionFilmRepository extends JpaRepository<Projection,Long> {
}
