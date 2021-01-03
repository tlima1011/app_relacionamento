package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Homem;
import entities.Match;
import entities.Mulher;
import entities.Pessoa;
import entities.enums.CorCabelo;
import entities.enums.Etnia;
import entities.enums.Orientacao;
import entities.enums.Relacionar;
import entities.enums.Sexo;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		Pessoa [] mulherHetero = new Mulher[6]; 
		Pessoa [] homemHetero = new Homem[6]; 
				
		mulherHetero[0] = new Mulher("Silvana Joelma", sdf.parse("25/05/2001"), 19, 1.60, 80.5,
				CorCabelo.PRETO, Etnia.INDIGENA, Sexo.MULHER, Orientacao.HETEROSSEXUAL, 
				Relacionar.HOMEM, false, "Não","Belzonte", "MG", "Sair Viajar, divertir e beber ate cair",
				"Brasileiro","Catolica nao praticante","Recepcionista",true);
		
		mulherHetero[1] = new Mulher("Maria Jocasta", sdf.parse("25/05/1965"), 19, 1.60, 55.0,
				CorCabelo.LOIRO, Etnia.CAUCASIANO, Sexo.MULHER, Orientacao.HETEROSSEXUAL, 
				Relacionar.HOMEM, false, "Não","São Paulo", "SP", "Sair para o clube de bingo",
				"Brasileiro","Catolica Praticante","Dona de Casa",false);
		
		mulherHetero[2] = new Mulher("Rosario José", sdf.parse("25/05/1980"), 40, 1.75, 65.0,
				CorCabelo.TINGIDO, Etnia.ASIATICO, Sexo.MULHER, Orientacao.HETEROSSEXUAL, 
				Relacionar.HOMEM, false, "Vermelho","Rio de Janeiro", "RJ", "Nada de especial",
				"Brasileiro","Ateia e Atoa","Dona de Bar e Boteco",false);
		
		
		homemHetero [0] = new Homem("Joao da Silva", sdf.parse("30/10/1985"), 35, 2.0, 
				65.0, CorCabelo.GRISALHO,
				Etnia.ASIATICO, Sexo.HOMEM, Orientacao.HETEROSSEXUAL, 
				Relacionar.MULHER, false,
				"Sem tingimento", "Belzonte", "MG", "Sair Viajar, divertir e beber ate cair", 
				"Brasileiro", "Umbanda", "Auxiliar de Almoxarifado", false);
		
		homemHetero [1] = new Homem("Mario", sdf.parse("30/10/2000"), 20, 1.65, 
				70.0, CorCabelo.LOIRO,
				Etnia.HISPANICO, Sexo.HOMEM, Orientacao.HETEROSSEXUAL, 
				Relacionar.MULHER, true,
				"Sem tingimento", "Rio de Janeiro", "RJ", "Nada de Especial", 
				"Brasileiro", "Mulçumano de Mano", "Gerente de Logística", false);
		
		homemHetero [2] = new Homem("Francisco", sdf.parse("30/10/1945"), 75, 1.45, 
				55.0, CorCabelo.BRANCO,
				Etnia.CAUCASIANO, Sexo.HOMEM, Orientacao.HETEROSSEXUAL, 
				Relacionar.MULHER, true,
				"Sem tingimento", "São Paulo", "SP", "Nada de Especial", 
				"Brasileiro", "Dono de Empresa", "Presidente", true);
		/*for (Pessoa homens : homemHetero) {
			System.out.println(homens);
		}
		
		for(Pessoa mulheres: mulherHetero) {
			System.out.println(mulheres);
		}*/
		Match encontroHetero = new Match();
		encontroHetero.matchHeteros(homemHetero[0], mulherHetero[0]); 
		
		Match encontroHomo = new Match(); 
		encontroHomo.matchHomos(mulherHetero[1],  mulherHetero[2]);
		
		
		sc.close();
	}
}
