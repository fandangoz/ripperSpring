package com.my.ripper.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "domain.zlecenie")
public class Zlecenie extends AbstractPersistable<Long> {
	private static final long serialVersionUID = 1L;
	private String opis;
	
	@ManyToOne
	@JoinColumn(name = "typ_sprzetu_id")
	private TypSprzetu typSprzetu;

	@OneToMany(cascade =  CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name ="zlecenie_id", nullable = false)
	private Set<PozycjaZlecenia> pozycjeZlecenia;
	
	@ManyToOne
	@JoinColumn(name = "status_zlecenia_id")
	private StatusZlecennia statusZlecenia;

	public String getOpis() {
		return opis;
	}

	public Set<PozycjaZlecenia> getPozycjeZlecenia() {
		return pozycjeZlecenia;
	}



	public void setPozycjeZlecenia(Set<PozycjaZlecenia> pozycjeZlecenia) {
		this.pozycjeZlecenia = pozycjeZlecenia;
	}



	public void setOpis(String opis) {
		this.opis = opis;
	}

	public StatusZlecennia getStatusZlecenia() {
		return statusZlecenia;
	}

	public void setStatusZlecenia(StatusZlecennia statusZlecenia) {
		this.statusZlecenia = statusZlecenia;
	}

	public TypSprzetu getTypSprzetu() {
		return typSprzetu;
	}

	public void setTypSprzetu(TypSprzetu typSprzetu) {
		this.typSprzetu = typSprzetu;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
