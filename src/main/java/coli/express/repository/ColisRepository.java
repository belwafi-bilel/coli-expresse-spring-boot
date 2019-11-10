package coli.express.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import coli.express.entities.Colis;

public interface ColisRepository extends JpaRepository<Colis, Long>{

}
