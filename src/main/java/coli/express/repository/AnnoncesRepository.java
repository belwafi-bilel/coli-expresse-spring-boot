package coli.express.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import coli.express.entities.Annonces;

public interface AnnoncesRepository extends JpaRepository<Annonces, Long> {

}
