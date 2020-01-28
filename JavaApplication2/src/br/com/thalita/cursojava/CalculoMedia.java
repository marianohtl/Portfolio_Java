/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thalita.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Calculo da Média
 *
 * @author Litah
 */
public class CalculoMedia {

    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador= new DecimalFormat("#0.0"); //a linha abaixo cria um objeto para formatação do resultado
        System.out.println("Digite a primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = teclado.nextDouble();
        media=(nota1+nota2)/2;
        System.out.println("A média das notas é: " + formatador.format(media));
        if(media>=6){
            System.out.println("Aprovado!");
        }else if((media >= 2) && (media <= 6)){
            System.out.println("Recuperação!");

        }else{
            System.out.println("Reprovado!");

        }
    }
}
