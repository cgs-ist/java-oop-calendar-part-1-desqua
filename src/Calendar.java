import java.util.*;

public class Calendar {
    private List<Month> months = new ArrayList<Month>();
    private List<Day> days = new ArrayList<Day>();
    private Year currentYear;
    
    public Calendar(Year currentYear) {
        this.currentYear = currentYear;
        initialiseMonths();
        initialiseDays();
    }

    public void initialiseMonths() {
        this.months.add(new Month("January", 31));
        this.months.add(new Month("February", 28));
        this.months.add(new Month("March", 31));
        this.months.add(new Month("April", 30));
        this.months.add(new Month("May", 31));
        this.months.add(new Month("June", 30));
        this.months.add(new Month("July", 31));
        this.months.add(new Month("August", 31));
        this.months.add(new Month("September", 30));
        this.months.add(new Month("October", 31));
        this.months.add(new Month("November", 30));
        this.months.add(new Month("December", 31));
    }

    public void initialiseDays() {
        for (int i = 0; i < 12; i++) {
            for (int d = 1; d <= this.months.get(i).getNumberOfDays(); d++) {
                this.days.add(new Day(d, this.months.get(i), this.currentYear));
            }
        }
    }

    public List<Month> getMonths() {
        return this.months;
    }

    public List<Day> getDays() {
        return this.days;
    }

    public Year getCurrentYear() {
        return this.currentYear;
    }
}
