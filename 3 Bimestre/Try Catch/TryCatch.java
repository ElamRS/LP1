import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static int quociente (int numerador, int denominador) throws ArithmeticException();
	return numerador/denominador;
}

public static void main (String args[]) {
	Scanner value = new Scanner (System.in);
	boolean loop = true;
	do {
		try {
			System.out.print("Entee com numerador;");
			int numerador = value.nextInt();
			System.out.print("Entre com o numerador: ");
			int denominador = value.nextInt();
			int result = quociente(numerador , numerador);
			System.out.printf("\nResultado: %d/%d = %d\n", numerador, denominador, result);
			loop = false;
		} catch (InputMismatchException input) {
			System.err.printf("\nException: %s\n", input);
			value.nextLine();
			System.out.println("Apenas valores inteiros!");
		}  catch (ArithmeticException e) {
			System.err.printf("\nException: %s\n", e);
			System.out.println("Divisão por Zero!");
		}
	} while(loop);
}
}
