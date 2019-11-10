package coli.express.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import coli.express.entities.Profiles;

public interface ProfilesRepository extends JpaRepository<Profiles,Long> {

}
