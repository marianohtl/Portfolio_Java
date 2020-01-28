package br.com.thalita.cursojava;

import java.util.Scanner;

/**
 * Estrutura Switch Case e Funções
 *
 * @author Thalita
 */
public class MenuOpcoes {

    public static void main(String[] args) {
        int opcao;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sistemas");
        System.out.println("1 - Windows");
        System.out.println("2 - Linux");
        System.out.println("Digite a opção desejada: ");
        opcao = teclado.nextInt();
        //estrutura permite a escolha de uma opção (semelhante ao if/ese)
    
    switch(opcao){
        case 1: 
        windows();
        break;
        case 2:
        linux();
        break;
        default:
        System.out.println("Opção inválida!");
        break;
        }
    }
    public static void windows(){
        System.out.println("Carregando o S.O. Windows.");
    
    }
    public static void linux(){
        System.out.println("Carregando o S.O. Linux.");
    }
    
}
