import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Worker {
    private String surname;
    private long salary;
    private int year;

    public Worker() {
    }

    public Worker(String surname, long salary, int year) {
        this.surname = surname;
        this.salary = salary;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "surname='" + surname + '\'' +
                ", salary=" + salary +
                ", year=" + year +
                '}';
    }

    public int getExperience() {
        LocalDateTime now = LocalDateTime.now();

        int nowYear = now.getYear();
        return nowYear - this.year;
    }

    public long daysFromStartWork() {
        Calendar dateOfStart = Calendar.getInstance();
        dateOfStart.set(this.year, Calendar.JANUARY, 1);

        Calendar now = Calendar.getInstance();

        return TimeUnit.MILLISECONDS.toDays(Math.abs(now.getTimeInMillis() - dateOfStart.getTimeInMillis()));
    }
}
