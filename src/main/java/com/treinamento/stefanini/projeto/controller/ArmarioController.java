package com.treinamento.stefanini.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.treinamento.stefanini.projeto.exception.TreinaException;
import com.treinamento.stefanini.projeto.model.Armario;
import com.treinamento.stefanini.projeto.service.ArmarioService;

@CrossOrigin
@Controller
@RequestMapping(value = "/armario")
public class ArmarioController {

	@Autowired
	private ArmarioService service;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Armario> findAll() throws TreinaException {
		return service.findAll();
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Optional<Armario> findById(@PathVariable Long id) throws TreinaException {
		return service.findById(id);
	}
	
}