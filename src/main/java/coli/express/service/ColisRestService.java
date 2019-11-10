package coli.express.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coli.express.entities.Colis;
import coli.express.repository.ColisRepository;


@RestController
public class ColisRestService {
	@Autowired
	private ColisRepository colisRepository;
	@RequestMapping(value="/Colis/view",method=RequestMethod.GET)
	public List<Colis>getColis()
	{
		return colisRepository.findAll();
	}
	@RequestMapping(value="Colis/add",method=RequestMethod.POST)
		public Colis save(Colis colis)
			{return colisRepository.save(colis);}

	@RequestMapping(value="/Colis/delete/{id}",method=RequestMethod.DELETE)
	public List<Colis> delete(@PathVariable Long id)
	{
		colisRepository.delete(id);
		return colisRepository.findAll();
	}
	@RequestMapping(value="/Colis/viewById/{id}",method=RequestMethod.GET)
	public Colis  getColis(@PathVariable Long id)
	{
		return colisRepository.findOne(id);
	}
	@RequestMapping(value="/Colis/edit/{id}",method=RequestMethod.POST)
	public List<Colis> save(@PathVariable Long id,  Colis colis)
	{
		colis.setId(id);
		 colisRepository.save(colis);
		 return colisRepository.findAll();
	}
}
