package com.my.ripper.controllers;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.my.ripper.service.ZleceniaService;


@Controller
public class ZleceniaController {
	private static final Logger logger = LoggerFactory.getLogger(ZleceniaController.class);

	@Autowired
	private ZleceniaService zleceniaService;
	
	
	@RequestMapping(value = "/zlecenia", method = RequestMethod.GET)
	  public String list(Model model) {
		
		logger.info("Lista zlecen");
	    model.addAttribute("zlecenia",zleceniaService.findAll());
	    return "zlecenia/list";
	  }
}
