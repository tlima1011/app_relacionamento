package entities.interfaces;

public interface Atividade {
	
	public abstract void apresentarCrush();
	public abstract boolean gostar(boolean gostar);
	public abstract boolean naoGostar(boolean naoGostar);
	public abstract String mostrarInteresse(String msg); 
}
