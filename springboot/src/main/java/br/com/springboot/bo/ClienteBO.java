package br.com.springboot.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springboot.dao.CRUD;
import br.com.springboot.dao.ClienteDAO;
import br.com.springboot.model.Cliente;

@Service
public class ClienteBO implements CRUD<Cliente,Long>{
	@Autowired
	private ClienteDAO dao;

	@Override
	public Cliente pesquisaPeloId(Long id) {
		// TODO Auto-generated method stub
		return dao.pesquisaPeloId(id);
	}

	@Override
	public List<Cliente> listaTodos() {
		// TODO Auto-generated method stub
		return dao.listaTodos();
	}

	@Override
	public void insere(Cliente cliente) {
		// TODO Auto-generated method stub
		dao.insere(cliente);
	}

	@Override
	public void atualiza(Cliente cliente) {
		// TODO Auto-generated method stub
		dao.atualiza(cliente);
	}

	@Override
	public void remove(Cliente cliente) {
		// TODO Auto-generated method stub
		dao.remove(cliente);
	}
	
	public void inativa(Cliente cliente) {
		cliente.setAtivo(false);
		dao.atualiza(cliente);
	}
	
	public void ativa(Cliente cliente) {
		cliente.setAtivo(true);
		dao.atualiza(cliente);
	}
	
}
