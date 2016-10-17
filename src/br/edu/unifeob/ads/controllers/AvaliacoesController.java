package br.edu.unifeob.ads.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unifeob.ads.models.Avaliacao;

@Controller
public class AvaliacoesController {

	private Result result;
	private AvaliacaoDAO avaliacaoDAO;

	public AvaliacoesController(){		
	}
	
	@Inject
	public AvaliacoesController(Result result, AvaliacaoDAO avaliacaoDAO) {		
		this.result = result;
		this.avaliacaoDAO = avaliacaoDAO;
	}
	
	@Path("avaliacoes/new")
	public void form(){
		
	}
	
	@Post
	public void create(Avaliacao avaliacao){
		avaliacaoDAO.salvar(avaliacao);
	}
	
	
	
}
