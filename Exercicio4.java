import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double valorhora, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorhora = sc.nextDouble();
		
		salario = valorhora * horas;
		
		System.out.println ("NUMBER = " + numero);
		System.out.printf ("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
