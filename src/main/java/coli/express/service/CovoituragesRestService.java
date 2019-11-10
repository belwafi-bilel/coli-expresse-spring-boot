package coli.express.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coli.express.entities.Covoiturages;
import coli.express.repository.CovoituragesRepository;
@RestController
public class CovoituragesRestService {
	@Autowired
	private CovoituragesRepository covoituragesRepository;
	@RequestMapping(value="/Covoiturages/view",method=RequestMethod.GET)
	public List<Covoiturages>getCovoiturages()
	{
		return covoituragesRepository.findAll();
	}
	@RequestMapping(value="Covoiturages/add",method=RequestMethod.POST)
		public Covoiturages save(Covoiturages covoiturages)
			{return covoituragesRepository.save(covoiturages);}

	@RequestMapping(value="/Covoiturages/delete/{id}",method=RequestMethod.DELETE)
	public List<Covoiturages> delete(@PathVariable Long id)
	{
		covoituragesRepository.delete(id);
		return covoituragesRepository.findAll();
	}
	@RequestMapping(value="/Covoiturages/viewById/{id}",method=RequestMethod.GET)
	public Covoiturages  getCovoiturages(@PathVariable Long id)
	{
		return covoituragesRepository.findOne(id);
	}
	@RequestMapping(value="/Covoiturages/edit/{id}",method=RequestMethod.POST)
	public List<Covoiturages> save(@PathVariable Long id,  Covoiturages covoiturages)
	{
		covoiturages.setId(id);
		 covoituragesRepository.save(covoiturages);
		 return covoituragesRepository.findAll();
	}
}
