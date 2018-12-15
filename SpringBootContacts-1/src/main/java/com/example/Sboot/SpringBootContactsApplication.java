package com.example.Sboot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.Sboot.Dao.ContactRepository;
import com.example.Sboot.Entities.Contact;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootContactsApplication implements CommandLineRunner {
  
	@Autowired
	private ContactRepository contactRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootContactsApplication.class, args);
	}

	@Override
	public  void run(String... args) throws Exception {
		DateFormat df = new SimpleDateFormat ("dd/MM/YYYY");
	  contactRepository.save(new Contact("Riadh","Elkamel",df.parse("15/11/1982"),"riadhelkamel1@hotmail.fr",58802332,"img.jpg"));	
	  contactRepository.save(new Contact("Bechir","Elkamel",df.parse("10/10/2018"),"Bechirkamel1@hotmail.fr",26482911,"img1.jpg"));
	  contactRepository.save(new Contact("Ahmed","Elkamel",df.parse("15/11/1982"),"Amhmekml@hotmail.fr",96040647,"img2.jpg"));
	  contactRepository.save(new Contact("Mohamed","Elkamel",df.parse("15/11/1982"),"Amhmekml@hotmail.fr",96040647,"img2.jpg"));

	  contactRepository.findAll().forEach(c ->{
		  System.out.println(c.getNom());
	  });
	  
	}
}
