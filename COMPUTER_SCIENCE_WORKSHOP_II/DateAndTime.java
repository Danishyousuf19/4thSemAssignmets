import java.time.*;

public class DateAndTime {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println("current date : " + d);
		System.out.println("current year : " + d.getYear());
		System.out.println("current month : " + d.getMonthValue());
		System.out.println("current day : " + d.getDayOfMonth());
		System.out.println();
		LocalDate e = LocalDate.of(2022, 8, 3);
		System.out.println("current date : " + e);
		System.out.println("current year : " + e.getYear());
		System.out.println("current month : " + e.getMonthValue());
		System.out.println("current day : " + e.getDayOfMonth());
		System.out.println();
		LocalTime t = LocalTime.now();
		System.out.println("current time : " + t);
		System.out.println("current Hour : " + t.getHour());
		System.out.println("current Minutes : " + t.getMinute());
		System.out.println("current Seconds : " + t.getSecond());
		System.out.println("current Nanoseconds : " + t.getNano());
		System.out.println();
		LocalTime u = LocalTime.of(8, 21, 03);
		System.out.println("current time : " + u);
		System.out.println("current Hour : " + u.getHour());
		System.out.println("current Minutes : " + u.getMinute());
		System.out.println("current Seconds : " + u.getSecond());
		System.out.println();
		LocalDateTime g = LocalDateTime.now();
		System.out.println("current time : " + g);
		System.out.println("current year : " + g.getYear());
		System.out.println("current month : " + g.getMonthValue());
		System.out.println("current day : " + g.getDayOfMonth());
		System.out.println("current Hour : " + g.getHour());
		System.out.println("current Minutes : " + g.getMinute());
		System.out.println("current Seconds : " + g.getSecond());
		System.out.println();
		LocalDateTime h = LocalDateTime.of(1960, 8, 3, 8, 31, 30);
		System.out.println("current time : " + h);
		System.out.println("current year : " + h.getYear());
		System.out.println("current month : " + h.getMonthValue());
		System.out.println("current day : " + h.getDayOfMonth());
		System.out.println("Adding Months : " + h.plusMonths(3));
		System.out.println("Adding Days : " + h.plusDays(3));
		System.out.println("current Hour : " + h.getHour());
		System.out.println("current Minutes : " + h.getMinute());
		System.out.println("current Seconds : " + h.getSecond());
		System.out.println();
		Period p = Period.between(e, d);
		System.out.println("Current year : " + p.getYears());
		System.out.println("Current month : " + p.getMonths());
		System.out.println("Current day : " + p.getDays());
		System.out.println();
	}

}
