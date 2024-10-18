package javalearning;

import java.time.LocalDate;
import java.time.Period;

public class LDateTime {

	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(1997, 2, 7);
        LocalDate endDate = LocalDate.of(2024, 8, 20);
        Period period = Period.between(startDate, endDate);
        System.out.println("Years: " + period.getYears() + ", Months: " + period.getMonths() + ", Days: " + period.getDays());

	}

}
