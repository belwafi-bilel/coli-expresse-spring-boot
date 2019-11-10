package coli.express.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import coli.express.entities.Address;

import coli.express.repository.AddressRepository;

@RestController
public class AddressRestService {
@Autowired
private AddressRepository addressRepository;
@RequestMapping(value="/Address/view",method=RequestMethod.GET)
public List<Address>getAddress()
{
	return addressRepository.findAll();
}
@RequestMapping(value="Address/add",method=RequestMethod.POST)
	public Address save(Address address)
		{return addressRepository.save(address);}

@RequestMapping(value="/Address/delete/{id}",method=RequestMethod.DELETE)
public List<Address> delete(@PathVariable Long id)
{
	addressRepository.delete(id);
	return addressRepository.findAll();
}
@RequestMapping(value="/Address/viewById/{id}",method=RequestMethod.GET)
public Address  getAddress(@PathVariable Long id)
{
	return addressRepository.findOne(id);
}
@RequestMapping(value="/Address/edit/{id}",method=RequestMethod.POST)
public List<Address> save(@PathVariable Long id,  Address address)
{
	address.setId(id);
	 addressRepository.save(address);
	 return addressRepository.findAll();
}
}
