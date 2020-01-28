import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		double peso, altura, imc;
		System.out.println("Cálculo IMC");
		Scanner leia = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Digite o seu peso: ");
		peso = leia.nextDouble();
		System.out.println("Digite a sua altura: ");
		altura = leia.nextDouble();
		imc = peso / (altura*altura);
		System.out.println("Média:"+ formatador.format(imc));
		// para criar um intervalo usamos o operador and (&&)
		if (imc<18.5) {
			System.out.println("ABAIXO DO PESO");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("PESO NORMAL");
		} else if(imc > 25 && imc <= 30) {
			System.out.println("ACIMA DO PESO");
		} else {
			System.out.println("OBESO");
		}
		//leia.close();
	}

}
