package br.edu.unifeob.ads.controllers;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
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
	
	@Get
	@Path("avaliacoes")
	public void lista(){
		List<Avaliacao> avaliacoes = avaliacaoDAO.listar();
		result.use(Results.json()).indented().from(avaliacoes, "avaliacoes").serialize();
	}
	
	
	
}
