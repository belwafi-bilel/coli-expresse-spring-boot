package coli.express.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coli.express.entities.Voitures;
import coli.express.repository.VoituresRepository;
@RestController
public class VoituresRestService {
	@Autowired
	private VoituresRepository voituresRepository;
	@RequestMapping(value="/Voitures/view",method=RequestMethod.GET)
	public List<Voitures>getVoitures()
	{
		return voituresRepository.findAll();
	}
	@RequestMapping(value="Voitures/add",method=RequestMethod.POST)
		public Voitures save(Voitures voitures)
			{return voituresRepository.save(voitures);}

	@RequestMapping(value="/Voitures/delete/{id}",method=RequestMethod.DELETE)
	public List<Voitures> delete(@PathVariable Long id)
	{
		voituresRepository.delete(id);
		return voituresRepository.findAll();
	}
	@RequestMapping(value="/Voitures/viewById/{id}",method=RequestMethod.GET)
	public Voitures  getVoitures(@PathVariable Long id)
	{
		return voituresRepository.findOne(id);
	}
	@RequestMapping(value="/Voitures/edit/{id}",method=RequestMethod.POST)
	public List<Voitures> save(@PathVariable Long id,  Voitures voitures)
	{
		voitures.setId(id);
		 voituresRepository.save(voitures);
		 return voituresRepository.findAll();
	}
}
