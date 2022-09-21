
public class Calculadora {
	
	// Métodos estáticos
	
	// A) Método multiplicar
	public static Integer multiplicar(Integer a, Integer b) {
		return a*b;
	}
	// B) Sobrecarga do método multiplicar que retorna Double ao invés de Integer
	public static Double multiplicar(Double a, Double b) {
		return a*b;
	}
	// C) Método elevar ao cubo
	public static Integer cubo(Integer a) {
		return a*a*a;
	}
	// D) Método que recebe um argumento do tipo Integer e retorna se ele é par ou ímpar
	public static String parimpar(Integer a) {
		if (a%2==0 && a!=0) {
			return "Par";
		} else if (a%2==1){
			return "Ímpar";
		} else {
			return "Zero";
		}
	}
}
