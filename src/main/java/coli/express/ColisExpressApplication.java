package coli.express;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import coli.express.entities.Address;
import coli.express.entities.Annonces;
import coli.express.entities.Natures;
import coli.express.entities.TypeAnnonces;
import coli.express.repository.AddressRepository;
import coli.express.repository.AnnoncesRepository;
import coli.express.repository.NaturesRepository;
import coli.express.repository.TypeAnnoncesRepository;

@SpringBootApplication
public class ColisExpressApplication implements CommandLineRunner{
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private TypeAnnoncesRepository typeAnnoncesRepository;
	@Autowired
   private AnnoncesRepository annoncesRepository;
	@Autowired
	private NaturesRepository naturesRepository;
	DateFormat mediumDateFormatEN = DateFormat.getDateTimeInstance(
			DateFormat.MEDIUM,DateFormat.MEDIUM, new Locale("EN","en"));
	public static void main(String[] args) {
		SpringApplication.run(ColisExpressApplication.class, args);
	
	}

//	@Autowired
	@Override
	public void run(String... arg0) throws Exception {
//		Address address=new Address("11", "ave Sarah", "Quebec", "quebec", "G1S3Y8", "Canada");
//		addressRepository.save(address);
//		Address address2=new Address("12", "ave Sarah", "Quebec", "quebec", "G1S3Y8", "Canada");
//		TypeAnnonces typeAnnonces=new TypeAnnonces("Coivotirage");
//		typeAnnoncesRepository.save(typeAnnonces);
//		Natures natures=new Natures("Offres");
//		naturesRepository.save(natures);
//		addressRepository.save(address2);
//		System.out.println(address.getId());
//		System.out.println(address2.getId());
//		annoncesRepository.save(new Annonces("description annonces",address,address2, new Date(),new Date(),typeAnnonces, natures));	
//		
		
	}
	
}
