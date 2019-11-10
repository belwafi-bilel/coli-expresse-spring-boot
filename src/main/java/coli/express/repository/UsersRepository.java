package coli.express.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import coli.express.entities.Users;

public interface UsersRepository extends JpaRepository<Users,Long> {

}
