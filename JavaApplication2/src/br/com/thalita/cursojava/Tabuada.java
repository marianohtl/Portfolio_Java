package br.com.thalita.cursojava;

import java.util.Scanner;

/**
 * estrutura de repetição
 * @author Thalita
 */
public class Tabuada {
    public static void main(String[] args) {
        int valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da tabuada: ");
        valor = teclado.nextInt();
        for(int i = 0; i <= 10; i++){
            System.out.println(valor +"X"+ i+"=" + (valor*i)); 
        }
    }
}
