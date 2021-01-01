package entities;

import entities.interfaces.Atividade;

public class Match implements Atividade{
	
	private Pessoa interessado;
	private Pessoa interessante;
	private boolean aprovada; 
    //Constutor
    public Match(){
        
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
