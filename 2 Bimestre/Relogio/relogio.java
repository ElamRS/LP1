public class relogio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Time1 tempo = new Time1();
        System.out.println(tempo.toUniversalString());
        tempo.setTime(13,  27,  6);
        System.out.println(tempo.toUniversalString());
        System.out.println(tempo.toString());
	
        Time2 tempo1 = new Time2();
        System.out.println("Classe 2 construida!");
        System.out.printf("%10s\n ", tempo.toUniversalString());
        System.out.printf("%12s\n ", tempo.toString());
        //
        int h;
        tempo.setTime(21, 2, 2);
        h = tempo.getHour();
        // m = tempo.minute;
        Time2 tempo2 = new Time2(h);
        System.out.printf("Hora atribuida ao construtor: %s\n ", tempo2.getHour());
        
        tempo1.setTime(tempo.getHour(), tempo.getMinute(), tempo.getSecond());
        System.out.println("Classe com parametro construida!");
        System.out.printf("%10s\n ", tempo.toUniversalString());
        System.out.printf("%12s\n ", tempo.toString());
	}

}
