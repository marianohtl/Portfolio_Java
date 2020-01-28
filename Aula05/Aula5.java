/**
* 	Classe Scaner
*
*/

import java.util.Scanner; //importa a classe Scanner

public class Aula5{
	public static void main(String[] args){
		String nome;//variável criada, sem valor atribuido
		int idade;
		Scanner teclado = new Scanner(System.in);//cria o objeto teclado para ser usado para a entrada de dados junto com a classe scaner
		System.out.println("Digite o seu nome: ");
		nome = teclado.nextLine(); // captura o que foi digitado e armazena na variável nome
		System.out.println("Digite a sua idade: ");
		idade = teclado.nextInt();
		System.out.println("Seu nome é "+ nome+ " e você tem "+idade+" anos."); 
		
	}
}