import java.lang.*;
public class Time1 {
	//atributos da classe time do tipo privada
	private int hour;
	private int minute;
	private int second;
	//metodos da classe time
	public void setTime(int h, int m, int s) {
		hour=((h>=0&&h<24)?h:0);
		minute=((m>=0&&m<60)?m:0);
		second=((s>=0&&s<60)?s:0);
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	//metodo para converter data
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	//metodos para converter
	public String toString () {
		return String.format("%d:%02d:%02d %s\n",
				((hour==0||hour==12) ? 12 : hour%12),
				minute,second,(hour<12?"AM":"PM"));
	}
}
