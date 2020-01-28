
package br.com.thalita.cursojava;

/*
 * 
 * @author Thalita
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        String[][] agenda = {{"Thalita Mariano","95155-4122","8.litah.8@gmail.com"},{"Cida Mariano","96230-3669","cidammariano@outlook.com"},{"Raul Mariano","91111-1111","raulzito@gmail.com"}};                   
        System.out.println(agenda[0][1]);
        
        for (int i = 0; i < agenda.length; i++) {
                    System.out.println("_________________________________");

            for (int j = 0; j < agenda.length; j++) {
                System.out.println(agenda[i][j]);
            }
        }
    }
 }

