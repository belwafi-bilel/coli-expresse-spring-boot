package coli.express.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coli.express.entities.Passages;
import coli.express.repository.PassagesRepository;
@RestController
public class PassagesRestService {
	@Autowired
	private PassagesRepository passagesRepository;
	@RequestMapping(value="/Passages/view",method=RequestMethod.GET)
	public List<Passages>getPassages()
	{
		return passagesRepository.findAll();
	}
	@RequestMapping(value="Passages/add",method=RequestMethod.POST)
		public Passages save(Passages passages)
			{return passagesRepository.save(passages);}

	@RequestMapping(value="/Passages/delete/{id}",method=RequestMethod.DELETE)
	public List<Passages> delete(@PathVariable Long id)
	{
		passagesRepository.delete(id);
		return passagesRepository.findAll();
	}
	@RequestMapping(value="/Passages/viewById/{id}",method=RequestMethod.GET)
	public Passages  getPassages(@PathVariable Long id)
	{
		return passagesRepository.findOne(id);
	}
	@RequestMapping(value="/Passages/edit/{id}",method=RequestMethod.POST)
	public List<Passages> save(@PathVariable Long id,  Passages passages)
	{
		passages.setId(id);
		 passagesRepository.save(passages);
		 return passagesRepository.findAll();
	}
}
