package br.com.jokenpo;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
	public static void main(String[] args) {
	int jogador, computador; 
	DecimalFormat formatador = new DecimalFormat("0.00");
	Scanner leia = new Scanner(System.in); //import scanner java until
	Random gerador = new Random();
	System.out.println("=====================");
	System.out.println("=      JOKENPÔ      =");
	System.out.println("=====================");
	System.out.println("1 - PEDRA");
	System.out.println("2 - PAPEL");
	System.out.println("3 - TESOURA");
	System.out.println("=====================");
	System.out.print("Digite a sua jogada: ");
	jogador = leia.nextInt();	
	computador = gerador.nextInt(3) + 1;
	
	while (jogador <= 0 || jogador >=4  ) {
		System.out.println("Opção Inválida!");
		System.out.print("Digite a sua jogada: ");
		jogador = leia.nextInt();
	} 
	System.out.println("======================================================");
	switch(jogador){
	case 1:
		System.out.println("Jogador escolheu Pedra.");
		break;
	case 2:
		System.out.println("Jogador escolheu Papel.");
		break;
	case 3:
		System.out.println("Jogador escolheu Tesoura.");
		break;
	}
	
	switch(computador){
	case 1:
		System.out.println("Computador escolheu Pedra.");
		break;
	case 2:
		System.out.println("Computador escolheu Papel.");
		break;
	case 3:
		System.out.println("Computador escolheu Tesoura.");
		break;
	}
	System.out.println("======================================================");
	System.out.println("RESULTADO:");
	if (jogador == computador) {		System.out.println("Empate!");
	} else {
		if ((jogador == 3 && computador == 2) || (jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)) {
			System.out.println("Você venceu! =)");
		} else {
			System.out.println("Computador venceu!");
		}

	}
	
	}
}
