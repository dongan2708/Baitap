package Lab4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (0 < day && day <= 31) {
            this.day = day;
        } else
            System.out.println("Invalid value");
        if (0 < month && month <= 12) {
            this.month = month;
        } else
            System.out.println("Invalid value");
        if (1900 < year && year < 9999) {
            this.year = year;
        } else
            System.out.println("Invalid value");
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return String.format("%02d/%02d/%04d",day,month,year);
    }

}
