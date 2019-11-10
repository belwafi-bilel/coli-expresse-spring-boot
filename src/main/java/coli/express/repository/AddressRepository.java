package coli.express.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import coli.express.entities.Address;

public interface AddressRepository  extends JpaRepository<Address, Long> {

}
