public class Day {
    private int dayOfMonth;
    private Month month;
    private Year year;

    public Day(int dayOfMonth, Month month, Year year) {
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.year = year;
    }

    public int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public Month getMonth() {
        return this.month;
    }

    public Year getYear() {
        return this.year;
    }
}
