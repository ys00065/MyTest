package helloworld;

import java.text.DecimalFormat;

public class ClockDisplay {

	private NumberInfo hours;
	private NumberInfo minutes;
	private static int number = 1;

	public ClockDisplay() {
		super();

		hours = new NumberInfo(12);
		minutes = new NumberInfo(60);

	}

	public void timeTick() {
		minutes.increment();
		if (minutes.getValue() == 0) {
			hours.increment();
		}
	}

	@Override
	public String toString() {
		DecimalFormat myFormatter = new DecimalFormat("00");
		if (hours.getValue() % 12 == 0 && minutes.getValue() % 60 == 0) {
			number++;
		}

		if (number % 2 == 0) {
			return (myFormatter.format(hours.getValue()) + ":"
					+ myFormatter.format(minutes.getValue()) + "pm");
		} else {
			return (myFormatter.format(hours.getValue()) + ":"
					+ myFormatter.format(minutes.getValue()) + "am");
		}
	}

}
