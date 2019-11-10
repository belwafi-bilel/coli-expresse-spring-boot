package coli.express.service;

import java.io.Console;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Holder;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import coli.express.entities.Address;
import coli.express.entities.Annonces;
import coli.express.repository.AddressRepository;
import coli.express.repository.AnnoncesRepository;

@RestController
public class AnnoncesRestService  {
	@Autowired
	private AnnoncesRepository annoncesRepository;
	private AddressRepository addressRepository;
	@RequestMapping(value="/Annonces/view",method=RequestMethod.GET)
	public List<Annonces>getAnnonces()
	{
		return annoncesRepository.findAll();
	}
	@RequestMapping(value="Annonces/add",method=RequestMethod.POST)
		public Long save(@RequestBody Annonces  annonces)
			{
		
//		 System.out.println(annonces.toString());
////		
////		Address address_depart=new Address(
////				annonces.getAddress_depart().getStreet_number(),
////				annonces.getAddress_depart().getRoute(),
////				annonces.getAddress_depart().getLocality(),
////				annonces.getAddress_depart().getAdministrative_area_level(),
////				annonces.getAddress_depart().getPostal_code(),
////				annonces.getAddress_depart().getCountry());
////		System.out.println(address_depart.toString());
////	addressRepository.save(Address new Address (annonces.getAddress_depart()));
//		
////		Address address_arrivee=new Address(
////				annonces.getAddress_arrivee().getStreet_number(),
////				annonces.getAddress_arrivee().getRoute(),
////				annonces.getAddress_arrivee().getLocality(),
////				annonces.getAddress_arrivee().getAdministrative_area_level(),
////				annonces.getAddress_arrivee().getPostal_code(),
////				annonces.getAddress_arrivee().getCountry());
////		addressRepository.save(address_arrivee);
////		annoncesRepository.save(new Annonces(
////				annonces.getDescription(),
////				address_depart,
////				address_arrivee,
////				annonces.getHeurs_depart(),
////				annonces.getHeurs_arrivee(),
////				annonces.getTypeAnnoncer(),
////				annonces.getNatures()
////				));
////		 System.out.println(annonces.getAddress_arrivee().toString());
////addressRepository.save(new Address(Data.getDescription(),address_depart,address_arriver,Data.getHeurs_depart(),Data.getAddress_arrivee(),Data.getTypeAnnoncer(),Data.getNatures());
////      // System.out.println(annonces.getDescription());
		annoncesRepository.save(annonces);
		return annonces.getId();
		
			}

	@RequestMapping(value="/Annonces/delete/{id}",method=RequestMethod.DELETE)
	public List<Annonces> delete(@PathVariable Long id)
	{
		annoncesRepository.delete(id);
		return annoncesRepository.findAll();
	}
	@RequestMapping(value="/Annonces/viewById/{id}",method=RequestMethod.GET)
	public Annonces  getAnnonces(@PathVariable Long id)
	{
		return annoncesRepository.findOne(id);
	}
	@RequestMapping(value="/Annonces/edit/{id}",method=RequestMethod.POST)
	public List<Annonces> save(@PathVariable Long id,  Annonces Annonces)
	{
		Annonces.setId(id);
		annoncesRepository.save(Annonces);
		 return annoncesRepository.findAll();
	}
	
	
}
