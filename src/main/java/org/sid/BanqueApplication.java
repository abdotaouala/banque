package org.sid;

import java.util.Date;

import org.sid.dao.ClientRepository;
import org.sid.dao.CompteRepository;
import org.sid.dao.OperationRepository;
import org.sid.entities.Client;
import org.sid.entities.Compte;
import org.sid.entities.CompteCourant;
import org.sid.entities.CompteEpargne;
import org.sid.entities.Operation;
import org.sid.entities.Retrait;
import org.sid.entities.Versement;
import org.sid.metier.IbanqueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BanqueApplication implements CommandLineRunner {
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	CompteRepository compteRepository;
	@Autowired
	OperationRepository operationRepository;
	@Autowired
	IbanqueMetier ibanqueMetier;
	public static void main(String[] args) {
		SpringApplication.run(BanqueApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		/*
		Client c1= clientRepository.save(new Client("Hassan", "hassan@gmail.com"));
		
		Client c2=clientRepository.save(new Client("Rachid","rachid@gmail.com"));
		
		Compte cp1=compteRepository.save(new CompteCourant("cp1", 70000, new Date(), c1, 520));
		Compte cp2=compteRepository.save(new CompteEpargne("cp2", 5000, new Date(), c2, 5.5));
		
		operationRepository.save(new Versement(new Date(), 152, cp1));
		operationRepository.save(new Versement(new Date(), 152, cp1));
		operationRepository.save(new Versement(new Date(), 152, cp1));
		operationRepository.save(new Retrait(new Date(), 152, cp1));

		operationRepository.save(new Versement(new Date(), 152, cp2));
		operationRepository.save(new Versement(new Date(), 152, cp2));
		operationRepository.save(new Versement(new Date(), 152, cp2));
		operationRepository.save(new Retrait(new Date(), 152, cp2));
	
	
		ibanqueMetier.verser("cp1", 111111111);*/
	}
}
