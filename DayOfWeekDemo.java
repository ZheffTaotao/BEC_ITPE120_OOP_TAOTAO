public class DayOfWeekDemo {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day today = Day.FRIDAY; // Set the current day

        switch (today) {
            case MONDAY:
                System.out.println("It's the start of the workweek.");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("It's a typical workday.");
                break;
            case FRIDAY:
                System.out.println("It's almost the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend. Time to relax!");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}
