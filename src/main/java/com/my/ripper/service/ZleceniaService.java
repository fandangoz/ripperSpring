package com.my.ripper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.ripper.domain.TypSprzetu;
import com.my.ripper.domain.Zlecenie;
import com.my.ripper.repository.TypSprzetuRepository;
import com.my.ripper.repository.ZlecenieRepository;

@Service
public class ZleceniaService {
	
	 @Autowired
	  private ZlecenieRepository zlecenieRepository;
	 
	 @Autowired
	 private TypSprzetuRepository typSprzetuRepository;
	 
	  public Iterable<Zlecenie> findAll() {
		  return zlecenieRepository.findAll();
	  }
	 
	  public Zlecenie save(Zlecenie t) {
	    return zlecenieRepository.save(t);
	  }
	 
	  public void delete(Long id) {
		  zlecenieRepository.delete(id);
	  }
	 
	  public Zlecenie findOne(Long id) {
	    return zlecenieRepository.findOne(id);
	  }

}
