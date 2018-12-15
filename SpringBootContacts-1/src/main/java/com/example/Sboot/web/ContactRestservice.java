package com.example.Sboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Sboot.Dao.ContactRepository;
import com.example.Sboot.Entities.Contact;
@RestController
public class ContactRestservice {
	@Autowired
  private ContactRepository contactRepository;
	@RequestMapping(value="/contacts" ,method= RequestMethod.GET)
	public List<Contact> getCOntacts(){
		return contactRepository.findAll();	}
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/contacts/{id}" ,method= RequestMethod.GET)
	public Contact getContact(@PathVariable Long id){
		return contactRepository.findById(id);	
		}
	@RequestMapping(value="contacts/{id}" , method=RequestMethod.POST)
	public Contact save(@RequestBody Contact c) {
		return contactRepository.save(c);
	}
	@RequestMapping(value="contacts/{id}", method = RequestMethod.DELETE)
	public boolean delete(@PathVariable Contact  id) {
		contactRepository.delete(id);
		return true;
	}
	
	@RequestMapping(value="contacts/{id}", method=RequestMethod.PUT)
	public Contact save(@PathVariable Long id, @RequestBody Contact c) {
		c.setId(id);
		return contactRepository.save(c);
	}
}
