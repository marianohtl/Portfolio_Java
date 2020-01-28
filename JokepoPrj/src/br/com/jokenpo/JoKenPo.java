package br.com.jokenpo;

import java.util.Scanner;

/**
 * JoKenPo
 *
 * @author thalita
 */
public class JoKenPo {

    public static void main(String[] args) {
        //lógica do jogador
        int jogador;
        Scanner mao = new Scanner(System.in);
        System.out.println("_______________");
        System.out.println("____JoKenPo____");
        System.out.println("_______________");
        System.out.println("1 . Pedra");
        System.out.println("2 . Papel");
        System.out.println("3 . Tesoura");
        System.out.println("Digite a opção desejada: ");
        jogador = mao.nextInt();
        switch (jogador) {
            case 1:
                System.out.println("Jogador escolheu PEDRA");
                break;
            case 2:
                System.out.println("Jogador escolheu PAPEL");
                break;
            case 3:
                System.out.println("Jogador escolheu TESOURA");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        //lógica do computador
        int computador = (int) (Math.random() * 3 + 1);
        switch (computador) {
            case 1:
                System.out.println("Computador escolheu PEDRA");
                break;
            case 2:
                System.out.println("Computador escolheu PAPEL");
                break;
            case 3:
                System.out.println("Computador escolheu TESOURA");
                break;
            default:
                System.out.println("Opção inválida.");
                break;

        }

        if (jogador != computador) {
            if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
                System.out.println("Jogador venceu!");
            } else {
                System.out.println("Computador venceu!");     
            }
        } else {
            System.out.println("EMPATE");

        }
    }

}
