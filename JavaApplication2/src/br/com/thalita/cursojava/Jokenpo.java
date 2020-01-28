package br.com.thalita.cursojava;

import java.util.Scanner;

/**
 *
 * @author Thalita Mariano
 */
public class Jokenpo {

    public static void main(String[] args) {
        int jogada;
        int pc;
        System.out.println("----------------------------------");
        System.out.println("JOKENPO");
        System.out.println("----------------------------------");
        System.out.println("Escolha uma Jogada: ");
        System.out.println(" 1 - Pedra ");
        System.out.println(" 2 - Papel ");
        System.out.println(" 3 - Tesoura ");
        Scanner teclado = new Scanner(System.in);
        jogada = teclado.nextInt();
        pc = (int) (Math.random() * 3 + 1);

        if (pc == jogada) {
            System.out.println("EMPATE!");
            switch(pc){
                case 1:
                    System.out.println("Computador: Pedra" );
                    System.out.println("Jogador: Pedra");
                    break;
                case 2:
                    System.out.println("Computador: Papel");
                    System.out.println("Jogador: Papel");
                    break;
                case 3:
                    System.out.println("Computador: Tesoura");
                    System.out.println("Jogador: Tesoura");
                    break;
            }
        } else {
            switch (pc) {
                case 1:
                    if (jogada == 2) {
                        System.out.println("Você ganhou!");
                        System.out.println("Jogador: " + jogada + " - Papel");
                        System.out.println("Computador: " + pc + " - Pedra");
                    } else {
                        System.out.println("Computador ganhou!");
                        System.out.println("Jogador: " + jogada + " - Tesoura");
                        System.out.println("Computador: " + pc + " - Pedra");

                    }
                    break;
                case 2:
                    if (jogada == 1) {
                        System.out.println("Computador ganhou!");
                        System.out.println("Jogador: " + jogada + " - Pedra");
                        System.out.println("Computador: " + pc + " - Papel");
                    } else {
                        System.out.println("Você ganhou!");
                        System.out.println("Jogador: " + jogada + " - Tesoura");
                        System.out.println("Computador: " + pc + " - Papel");

                    }

                    break;
                case 3:
                    if (jogada == 1) {
                        System.out.println("Você ganhou!");
                        System.out.println("Jogador: " + jogada + " - Pedra");
                        System.out.println("Computador: " + pc + " - Tesoura");
                    } else {
                        System.out.println("Computador ganhou!");
                        System.out.println("Jogador: " + jogada + " - Papel");
                        System.out.println("Computador: " + pc + " - Tesoura");

                    }

                    break;
            }

        }

    }
}
