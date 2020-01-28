import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class PDV {
	public static void main(String[] args) {
		double desconto, valor, valorTotal, troco, valorRecebido;
		DecimalFormat formatadorDecimal = new DecimalFormat("0.00");
		//import scanner java until
		Scanner leia = new Scanner(System.in); 
		// Date > trabalhar com Data
		Date data = new Date();
		//import Java Util
		// formatar a data
		DateFormat formatadorDate = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(formatadorDate.format(data));
		System.out.println("######################################");
		System.out.println("##################PDV#################");
		System.out.println("######################################");
		System.out.print("Digite o valor da compra: ");
		valor = leia.nextDouble();
		System.out.print("Digite a % de desconto: ");
		desconto = leia.nextDouble();
		desconto = (desconto/100)* valor;
		valorTotal = valor - desconto;
		System.out.print("Valor recebido: ");
		valorRecebido = leia.nextDouble();
		troco = valorRecebido - valorTotal;
		System.out.println("######################################");
		System.out.println("###############RELATÓRIO##############");
		System.out.println("######################################");
		System.out.println("Valor da compra: "+valor);
		System.out.println("Desconto: "+desconto);
		System.out.println("Valor a pagar: "+valorTotal);
		System.out.println("Troco: "+ troco);
		System.out.println("######################################");
	}

}
