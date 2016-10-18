package br.edu.unifeob.ads.controllers;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.edu.unifeob.ads.models.Avaliacao;

@Dependent
public class AvaliacaoDAO {
	
	private EntityManager entityManager;
	
	@Inject
	public AvaliacaoDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void salvar(Avaliacao avaliacao){
		entityManager.persist(avaliacao);
	}
	
	public List<Avaliacao> listar(){
		return entityManager.createQuery("from Avaliacao", Avaliacao.class).getResultList();
	}
	
	

}
