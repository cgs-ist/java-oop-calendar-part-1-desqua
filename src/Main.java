import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Current year for the calendar
        Year currentYear = new Year(2023);

        // Create a Calendar object
        Calendar calendar = new Calendar(currentYear);

        // print current year
        System.out.println();
        System.out.println("Current year: " + calendar.getCurrentYear().getYear());
        System.out.println();

        // Example: Print the months and their corresponding number of days in the current year
        List<Month> months = calendar.getMonths();
        System.out.println("Months: ");
        System.out.println();
        for (int i = 0; i < months.size(); i++) {
            Month month = months.get(i);
            System.out.println(month.getName() + ", " + month.getNumberOfDays() + " Days");
        }
        System.out.println();

        // Example: Print all the days in the current year
        List<Day> days = calendar.getDays();
        System.out.println("Days: ");
        System.out.println();
        for (Day day : days) {
            System.out.println(day.getDayOfMonth() + " / " + day.getMonth().getName() + " / " + day.getYear().getYear());
        }

        System.out.println();
    }
}

