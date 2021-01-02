package entities;

import java.util.ArrayList;
import java.util.Date;

import entities.enums.CorCabelo;
import entities.enums.Etnia;
import entities.enums.Orientacao;
import entities.enums.Relacionar;
import entities.enums.Sexo;
import entities.interfaces.Atividade;

public class Mulher extends Pessoa{
	
	private Homem homem; 
	
	ArrayList<Homem> homens = new ArrayList<Homem>();
	
	public Mulher() {	
		
	}
	
	public Mulher(String nome, Date dataNascimento, int idade, Double altura, Double peso, 
			CorCabelo corCabelo,
			Etnia etnia, Sexo sexo, Orientacao orientacao, Relacionar paraSeRelacionar, 
			boolean tingimento,
			String corTingimento, String cidade, String uf, String hobbies, 
			String nacionalidade,
			String religiaoOuFilosofia, String profissao, Boolean tatuagem) {
		super(nome, dataNascimento, idade, altura, peso, corCabelo, etnia, sexo, orientacao, 
				paraSeRelacionar,
				tingimento, corTingimento, cidade, uf, hobbies, nacionalidade, 
				religiaoOuFilosofia, profissao,
				tatuagem);
	}	
	public void addHomem(Homem homem) {
		homens.add(homem);
	}
	public void removeCrush(Homem homem) {
		homens.remove(homem);
	}

	@Override
	public void addFoto() {
		
	}

	@Override
	public void removerFoto() {
		
	}

	@Override
	public void addCrush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCrush() {
		// TODO Auto-generated method stub
		
	}
}
