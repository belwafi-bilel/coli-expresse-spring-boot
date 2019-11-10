package coli.express.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coli.express.entities.Profiles;
import coli.express.repository.ProfilesRepository;
@RestController
public class ProfilesRestService {
	@Autowired
	private ProfilesRepository profilesRepository;
	@RequestMapping(value="/Profiles/view",method=RequestMethod.GET)
	public List<Profiles>getProfiles()
	{
		return profilesRepository.findAll();
	}
	@RequestMapping(value="Profiles/add",method=RequestMethod.POST)
		public Profiles save(Profiles profiles)
			{return profilesRepository.save(profiles);}

	@RequestMapping(value="/Profiles/delete/{id}",method=RequestMethod.DELETE)
	public List<Profiles> delete(@PathVariable Long id)
	{
		profilesRepository.delete(id);
		return profilesRepository.findAll();
	}
	@RequestMapping(value="/Profiles/viewById/{id}",method=RequestMethod.GET)
	public Profiles  getProfiles(@PathVariable Long id)
	{
		return profilesRepository.findOne(id);
	}
	@RequestMapping(value="/Profiles/edit/{id}",method=RequestMethod.POST)
	public List<Profiles> save(@PathVariable Long id,  Profiles profiles)
	{
		profiles.setId(id);
		 profilesRepository.save(profiles);
		 return profilesRepository.findAll();
	}
}
