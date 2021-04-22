
public class SwitchExample {

	public static void main(String[] args) {
		
		int day = 10;
		String dayName;
		int b = 0;
		
		switch (day) {
		case 1:
			dayName = "Today is Monday";
			b = day;
			break;
		case 2:
			dayName = "Today is Tuesday";
			b = day;
			break;
		case 3:
			dayName = "Today is Wednesday";
			b = day;
			break;
		case 4:
			dayName = "Today is Thursday";
			b = day;
			break;
		case 5:
			dayName = "Today is Friday";
			b = day;
			break;
		case 6:
			dayName = "Today is Saturday";
			b = day;
			break;
		case 7:
			dayName = "Today is Sunday";
			b = day;
			break;
		default:
			dayName = "Invalid day";
			break;
		}
		System.out.println(b +":"+dayName);
		
	}
}
