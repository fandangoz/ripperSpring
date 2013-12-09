package com.my.ripper.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractSlownik extends AbstractPersistable<Long> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String opis;
	
	@Column(name ="opis", nullable = false, length=255)
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	

}
