package mipn.pls.cinema.dao;

import mipn.pls.cinema.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategoriesRepository extends JpaRepository<Categorie,Long> {
}
