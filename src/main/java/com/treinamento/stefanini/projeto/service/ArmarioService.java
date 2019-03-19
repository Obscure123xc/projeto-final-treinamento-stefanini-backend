package com.treinamento.stefanini.projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamento.stefanini.projeto.exception.TreinaException;
import com.treinamento.stefanini.projeto.model.Armario;
import com.treinamento.stefanini.projeto.repository.ArmarioRepository;

@Service
public class ArmarioService {

	@Autowired
	private ArmarioRepository repository;

	public List<Armario> findAll() throws TreinaException {
		return (List<Armario>) repository.findAll();
	}

	public Optional<Armario> findById(Long id) throws TreinaException {
		Optional<Armario> armario = repository.findById(id);
		if (armario == null) {
			throw new TreinaException("Objeto n�o encontrado");
		}
		return armario;
	}

	public Armario salvar(Armario armario) throws TreinaException {
		if (armario.getNome().length() > 20) {
			throw new TreinaException("Numeros de caracteres maior que 20");
		}
		return repository.save(armario);

	}

	public Armario editar(Armario armario) throws TreinaException {
		if (repository.findById(armario.getId()) == null) {
			throw new TreinaException("Objeto Armario n�o existe");
		}
		if (armario.getNome().length() > 20) {
			throw new TreinaException("Numeros de caracteres maior que 20");
		}
		return repository.save(armario);
	}

	public String excluir(Long id) throws TreinaException {
		repository.deleteById(id);
		return "Exclu�do com sucesso!";
	}

}