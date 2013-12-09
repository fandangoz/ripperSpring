package com.my.ripper.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "domain.pozycja_zlecenia")
public class PozycjaZlecenia extends AbstractSlownik {
	
	@Column(name="koszt", precision = 2, scale = 8)
	private BigDecimal koszt;
	
	public BigDecimal getKoszt() {
		return koszt;
	}

	public void setKoszt(BigDecimal koszt) {
		this.koszt = koszt;
	}
	

}
