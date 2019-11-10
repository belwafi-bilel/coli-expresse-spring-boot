package coli.express.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coli.express.entities.TypeAnnonces;
import coli.express.repository.TypeAnnoncesRepository;
@RestController
public class TypeAnnoncesRestService {
	@Autowired
	private TypeAnnoncesRepository typeAnnoncesRepository;
	@RequestMapping(value="/TypeAnnonces/view",method=RequestMethod.GET)
	public List<TypeAnnonces>getTypeAnnonces()
	{
		return typeAnnoncesRepository.findAll();
	}
	@RequestMapping(value="TypeAnnonces/add",method=RequestMethod.POST)
		public TypeAnnonces save(TypeAnnonces typeAnnonces)
			{return typeAnnoncesRepository.save(typeAnnonces);}

	@RequestMapping(value="/TypeAnnonces/delete/{id}",method=RequestMethod.DELETE)
	public List<TypeAnnonces> delete(@PathVariable Long id)
	{
		typeAnnoncesRepository.delete(id);
		return typeAnnoncesRepository.findAll();
	}
	@RequestMapping(value="/TypeAnnonces/viewById/{id}",method=RequestMethod.GET)
	public TypeAnnonces  getTypeAnnonces(@PathVariable Long id)
	{
		return typeAnnoncesRepository.findOne(id);
	}
	@RequestMapping(value="/TypeAnnonces/edit/{id}",method=RequestMethod.POST)
	public List<TypeAnnonces> save(@PathVariable Long id,  TypeAnnonces typeAnnonces)
	{
		typeAnnonces.setId(id);
		 typeAnnoncesRepository.save(typeAnnonces);
		 return typeAnnoncesRepository.findAll();
	}
}
