package coli.express.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import coli.express.entities.Passages;

public interface PassagesRepository extends JpaRepository<Passages, Long> {

}
