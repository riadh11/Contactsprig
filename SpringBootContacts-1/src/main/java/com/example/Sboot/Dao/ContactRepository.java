package com.example.Sboot.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Sboot.Entities.Contact;
@Repository
public interface ContactRepository  extends JpaRepository<Contact, Long>{

	public Contact findById(Long  id);

	

}
