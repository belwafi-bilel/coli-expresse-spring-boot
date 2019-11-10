package coli.express.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coli.express.entities.Bagages;
import coli.express.repository.BagagesRepository;
@RestController
public class BagagesRestService {
	@Autowired
	private BagagesRepository bagagesRepository;
	@RequestMapping(value="/Bagages/view",method=RequestMethod.GET)
	public List<Bagages>getBagages()
	{
		return bagagesRepository.findAll();
	}
	@RequestMapping(value="Bagages/add",method=RequestMethod.POST)
		public Bagages save(Bagages Bagages)
			{return bagagesRepository.save(Bagages);}

	@RequestMapping(value="/Bagages/delete/{id}",method=RequestMethod.DELETE)
	public List<Bagages> delete(@PathVariable Long id)
	{
		bagagesRepository.delete(id);
		return bagagesRepository.findAll();
	}
	@RequestMapping(value="/Bagages/viewById/{id}",method=RequestMethod.GET)
	public Bagages  getBagages(@PathVariable Long id)
	{
		return bagagesRepository.findOne(id);
	}
	@RequestMapping(value="/Bagages/edit/{id}",method=RequestMethod.POST)
	public List<Bagages> save(@PathVariable Long id,  Bagages bagages)
	{
		bagages.setId(id);
		 bagagesRepository.save(bagages);
		 return bagagesRepository.findAll();
	}
}
