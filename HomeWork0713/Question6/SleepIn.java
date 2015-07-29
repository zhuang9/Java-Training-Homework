package Question6;

import java.util.Date;

public class SleepIn {

	public static void main(String[] args) {
		SleepIn si = new SleepIn();
		si.sleepin();
	}

	public static boolean sleepIn(boolean weekday) {

		Date date = new Date();
		String[] Weekday = date.toString().split(" ");

		if (Weekday[0] == "Sat" || Weekday[0] == "Sun") {
			return weekday = false;
		} else {
			return weekday = true;
		}
	}

	public static void sleepin() {
		if (sleepIn(true))
			System.out.println("You can not sleep in today.");
		else
			System.out.println("You can sleep in today.");
	}
}