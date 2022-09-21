
public class Menor3 {
	
	// Métodos estáticos
	
	// Método min3 que recebe três valores inteiros como argumentos e retorna o valor do menor número
	public static Integer min3(Integer a, Integer b, Integer c) {
		if (a<b && a<c) {
			return a;
		} else if (b<a && b<c) {
			return b;
		} else {
			return c;
		}
	}
	
	// Sobrecarga do método min3 que recebe três valores Double e retorna como argumento o valor do menor número	
	public static Double min3(Double a, Double b, Double c) {
		if (a<b && a<c) {
			return a;
		} else if (b<a && b<c) {
			return b;
		} else {
			return c;
		}
	}
}
