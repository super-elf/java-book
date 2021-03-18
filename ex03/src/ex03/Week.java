package ex03;

public class Week {
	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		Day weekDay = Day.THURSDAY;
		switch (weekDay) {
			case SATURDAY:
			case SUNDAY:
				System.out.println("©P¥½");
					break;
				default:
				System.out.println("¤u§@¤é");
					break;
		}	
	}
}