package entities;

import entities.enums.Orientacao;
import entities.enums.Relacionar;
import entities.enums.Sexo;
import entities.interfaces.Atividade;

public class Match implements Atividade{
	
	private Pessoa interessado;
	private Pessoa encontrada;
	private boolean aprovada; 
    //Constutor
    public Match(){
        
    }
    public void matchHeteros(Pessoa l1, Pessoa l2) {
    	int idadeL1 = l1.getIdade();
    	int idadeL2 = l2.getIdade();
    	Orientacao orientacaoL1 = l1.getOrientacao();
    	Orientacao orientacaoL2 = l2.getOrientacao(); 
    	Sexo s1 = l1.getSexo(); 
    	Sexo s2 = l2.getSexo(); 
    	Relacionar r1 = l1.getParaSeRelacionar(); 
    	Relacionar r2 = l1.getParaSeRelacionar(); 
    	if(orientacaoL1.equals(orientacaoL2) && s1 != s2
    			&& r1 != r2) {
    		System.out.println("Deu Match!!!");
    	}else {
    		System.out.println("Não deu match!!!");
    	}
    }
    
    public void matchHomos(Pessoa l1, Pessoa l2) {
    	int idadeL1 = l1.getIdade();
    	int idadeL2 = l2.getIdade();
    	Orientacao orientacaoL1 = l1.getOrientacao();
    	Orientacao orientacaoL2 = l2.getOrientacao(); 
    	Sexo s1 = l1.getSexo(); 
    	Sexo s2 = l2.getSexo(); 
    	Relacionar r1 = l1.getParaSeRelacionar(); 
    	Relacionar r2 = l1.getParaSeRelacionar(); 
    	if(orientacaoL1.equals(orientacaoL2) && s1 == s2
    			&& r1 == r2) {
    		System.out.println("Deu Match!!!");
    	}else {
    		System.out.println("Não deu match!!!");
    	}
    }
        
    
    @Override
	public void apresentarCrush() {
		StringBuilder sb = new StringBuilder(); 
		if(this.gostar(true)) {
			
		}
		
	}
	@Override
	public boolean gostar(boolean gostar) {
		return true;
	}

	@Override
	public boolean naoGostar(boolean naoGostar) {
		return true;
	}

	@Override
	public String mostrarInteresse(String msg) {
		return msg;
	}
	
	
    
	

}
