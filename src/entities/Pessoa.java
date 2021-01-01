package entities;

import entities.enums.*;
import entities.interfaces.Atividade;

import java.util.Date;

public abstract class Pessoa{
	
	//Atributos 
	private static Long lastId = 1L; 
	private Long idPessoa; 
	private String nome; 
	private Date dataNascimento; 
	private int idade; 
	private Double altura; 
	private Double peso; 
	private CorCabelo corCabelo;
	private boolean tingimento; 
	private Etnia etnia;
	private Sexo sexo; 
	private Orientacao orientacao;
	private Relacionar paraSeRelacionar; 
	private String corTingimento; 
	private String cidade; 
	private String uf;  
	private String hobbies;  
	private String nacionalidade;  
	private String religiaoOuFilosofia;  
	private String profissao;  
	private Boolean tatuagem; 
	
	//Construtor 
	public Pessoa() {
		
	}
	public Pessoa(String nome, Date dataNascimento, int idade, Double altura, Double peso,
			CorCabelo corCabelo, Etnia etnia, Sexo sexo, Orientacao orientacao,
			Relacionar paraSeRelacionar, boolean tingimento, String corTingimento, String cidade, String uf, String hobbies,
			String nacionalidade, String religiaoOuFilosofia, String profissao, Boolean tatuagem) {
		this.idPessoa = lastId++;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.corCabelo = corCabelo;
		this.tingimento = tingimento; 
		this.etnia = etnia;
		this.sexo = sexo;
		this.orientacao = orientacao;
		this.paraSeRelacionar = paraSeRelacionar;
		this.corTingimento = corTingimento;
		this.cidade = cidade;
		this.uf = uf;
		this.hobbies = hobbies;
		this.nacionalidade = nacionalidade;
		this.religiaoOuFilosofia = religiaoOuFilosofia;
		this.profissao = profissao;
		this.tatuagem = tatuagem;
	}
	//Getters and Setters 
	public Long getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public CorCabelo getCorCabelo() {
		return corCabelo;
	}
	public void setCorCabelo(CorCabelo corCabelo) {
		this.corCabelo = corCabelo;
	}
	public Boolean getTatuagem() {
		return tatuagem;
	}
	public void setTatuagem(Boolean tatuagem) {
		this.tatuagem = tatuagem;
	} 
	public Etnia getEtnia() {
		return etnia;
	}
	public void setEtnia(Etnia etnia) {
		this.etnia = etnia;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Orientacao getOrientacao() {
		return orientacao;
	}
	public void setOrientacao(Orientacao orientacao) {
		this.orientacao = orientacao;
	}
	public Relacionar getParaSeRelacionar() {
		return paraSeRelacionar;
	}
	public void setParaSeRelacionar(Relacionar paraSeRelacionar) {
		this.paraSeRelacionar = paraSeRelacionar;
	}
	public String getCorTingimento() {
		return corTingimento;
	}
	public void setCorTingimento(String corTingimento) {
		this.corTingimento = corTingimento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getReligiaoOuFilosofia() {
		return religiaoOuFilosofia;
	}
	public void setReligiaoOuFilosofia(String religiaoOuFilosofia) {
		this.religiaoOuFilosofia = religiaoOuFilosofia;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public boolean isTingimento() {
		return tingimento;
	}
	public void setTingimento(boolean tingimento) {
		this.tingimento = tingimento;
	}
	//Métodos 
	public abstract void addCrush(); 
	public abstract void removeCrush(); 
	public abstract void addFoto();
	public abstract void removerFoto();
		
	@Override
	public String toString() { 
		StringBuilder sb = new StringBuilder(); 
		sb.append("\nNome: " +this.nome);
		sb.append("\nIdade: " +this.idade); 
		sb.append("\nAltura: " +this.altura); 
		sb.append("\nPeso: " +this.peso);
		sb.append("\nSexo: " +this.sexo); 
		sb.append("\nOrientaçao: " +this.orientacao);
		sb.append("\nCom quem quer se relacionar: " +this.paraSeRelacionar);
		sb.append("\nCor Cabelo: " +this.corCabelo);
		sb.append("\nCabelo Tingido: " +this.tingimento);  
		sb.append("\nCor Tingimento: " +this.corTingimento);
		sb.append("\nCidade: " +this.cidade);
		sb.append("\nUF: " +this.uf);
		sb.append("\nHobbies: " +this.hobbies); 
		sb.append("\nNacionalidade: " +this.nacionalidade); 
		sb.append("\nReligiao Ou Filosofia: " +this.religiaoOuFilosofia);
		sb.append("\nProfissao: " +this.profissao); 
		sb.append("\nTem Tatuagem: " +this.tatuagem); 
		return sb.toString(); 
	}
}
