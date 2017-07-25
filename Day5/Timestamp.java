import java.lang.annotation.*;

enum Day{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATIRDAY, SUNDAY
	}
enum Month{
	JAN, FEB, MAR, APR, MAY, JUNE, JULY, AUG, SEP, OCT, NOV, DEC
	}
enum Year{
	Y2015, Y2016, Y2017, Y2018, Y2019, Y2020
	}

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
@interface Timestamp {
	Day day();
	Month month();
	Year year();
}