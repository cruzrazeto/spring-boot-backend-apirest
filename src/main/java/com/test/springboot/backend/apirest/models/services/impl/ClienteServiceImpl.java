package com.test.springboot.backend.apirest.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springboot.backend.apirest.models.dao.IClienteDao;
import com.test.springboot.backend.apirest.models.entity.Cliente;
import com.test.springboot.backend.apirest.models.services.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteDao clienteDao;

	@Override
	public List<Cliente> findAll() {
		return (List<Cliente>)clienteDao.findAll();
	}

}
