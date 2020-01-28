/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thalita.cursojava;

import java.util.Scanner;

/**
 * Aula 07 - Estrutura de Decisão
 *
 * @author litah
 */
public class Fluxo {

    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos.");
        if(idade >= 18){
            System.out.println("Maior de idade!");
        }else{
            System.out.println("Menor de idade!");
        }
        }
    }

