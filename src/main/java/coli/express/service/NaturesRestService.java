package coli.express.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coli.express.entities.Natures;
import coli.express.repository.NaturesRepository;
@RestController
public class NaturesRestService {
	@Autowired
	private NaturesRepository naturesRepository;
	@RequestMapping(value="/Natures/view",method=RequestMethod.GET)
	public List<Natures>getNatures()
	{
		return naturesRepository.findAll();
	}
	@RequestMapping(value="Natures/add",method=RequestMethod.POST)
		public Natures save(Natures natures)
			{return naturesRepository.save(natures);}

	@RequestMapping(value="/Natures/delete/{id}",method=RequestMethod.DELETE)
	public List<Natures> delete(@PathVariable Long id)
	{
		naturesRepository.delete(id);
		return naturesRepository.findAll();
	}
	@RequestMapping(value="/Natures/viewById/{id}",method=RequestMethod.GET)
	public Natures  getNatures(@PathVariable Long id)
	{
		return naturesRepository.findOne(id);
	}
	@RequestMapping(value="/Natures/edit/{id}",method=RequestMethod.POST)
	public List<Natures> save(@PathVariable Long id,  Natures natures)
	{
		natures.setId(id);
		 naturesRepository.save(natures);
		 return naturesRepository.findAll();
	}
}
