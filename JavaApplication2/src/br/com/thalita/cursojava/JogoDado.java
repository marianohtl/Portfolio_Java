package br.com.thalita.cursojava;

import java.util.Scanner;

public class JogoDado {

    public static void main(String[] args) {
        char opcao = 's'; //variável para dar opção ao jogador jogar novamente
        Scanner teclado = new Scanner(System.in);
        while (opcao == 's') {
            System.out.println("Lançamento do DADO ...");
            int dado = (int)(Math.random()*6 + 1);
            System.out.println("Face: "+dado);
            System.out.println("Deseja lançar o dado novamente? ");
            opcao = teclado.next().charAt(0);
        } 
    }
}
