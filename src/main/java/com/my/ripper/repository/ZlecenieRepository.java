package com.my.ripper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.ripper.domain.Zlecenie;


public interface ZlecenieRepository extends JpaRepository<Zlecenie, Long> {

}
