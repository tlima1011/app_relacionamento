package entities;

import java.util.ArrayList;
import java.util.Date;

import entities.enums.CorCabelo;
import entities.enums.Etnia;
import entities.enums.Orientacao;
import entities.enums.Relacionar;
import entities.enums.Sexo;
import entities.interfaces.Atividade;

public class Homem extends Pessoa{
	
	private Mulher mulher;	
	
	ArrayList<Mulher> mulheres = new ArrayList<>();
	
	public Homem() {
		
	}
		
	public Homem(String nome, Date dataNascimento, int idade, Double altura, Double peso, CorCabelo corCabelo,
			Etnia etnia, Sexo sexo, Orientacao orientacao, Relacionar paraSeRelacionar, boolean tingimento,
			String corTingimento, String cidade, String uf, String hobbies, String nacionalidade,
			String religiaoOuFilosofia, String profissao, Boolean tatuagem) {
		super(nome, dataNascimento, idade, altura, peso, corCabelo, etnia, sexo, orientacao, paraSeRelacionar,
				tingimento, corTingimento, cidade, uf, hobbies, nacionalidade, religiaoOuFilosofia, profissao,
				tatuagem);
	}

	@Override
	public void addCrush() {
		
	}

	@Override
	public void removeCrush() {
				
	}

	@Override
	public void addFoto() {
		
	}

	@Override
	public void removerFoto() {
		
	}

}
