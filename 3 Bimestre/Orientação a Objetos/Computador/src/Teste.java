
public class Teste {
	public static void main(String args[]) {
		Computador computador = new Computador("PC não tem marca", "Razor", "Intel", 4, "Kingston", 32);
		System.out.println(computador.getMarca());
		System.out.println(computador.getMemoriaRAM().getMarca());
		System.out.println(computador.getProcessador().getMarca());
	}
}
