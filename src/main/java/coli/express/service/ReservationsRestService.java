package coli.express.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coli.express.entities.Reservations;
import coli.express.repository.ReservationsRepository;
@RestController
public class ReservationsRestService {
	@Autowired
	private ReservationsRepository reservationsRepository;
	@RequestMapping(value="/Reservations/view",method=RequestMethod.GET)
	public List<Reservations>getReservations()
	{
		return reservationsRepository.findAll();
	}
	@RequestMapping(value="Reservations/add",method=RequestMethod.POST)
		public Reservations save(Reservations reservations)
			{return reservationsRepository.save(reservations);}

	@RequestMapping(value="/Reservations/delete/{id}",method=RequestMethod.DELETE)
	public List<Reservations> delete(@PathVariable Long id)
	{
		reservationsRepository.delete(id);
		return reservationsRepository.findAll();
	}
	@RequestMapping(value="/Reservations/viewById/{id}",method=RequestMethod.GET)
	public Reservations  getReservations(@PathVariable Long id)
	{
		return reservationsRepository.findOne(id);
	}
	@RequestMapping(value="/Reservations/edit/{id}",method=RequestMethod.POST)
	public List<Reservations> save(@PathVariable Long id,  Reservations reservations)
	{
		reservations.setId(id);
		 reservationsRepository.save(reservations);
		 return reservationsRepository.findAll();
	}
}
