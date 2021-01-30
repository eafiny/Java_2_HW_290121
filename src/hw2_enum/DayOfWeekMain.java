package hw2_enum;

public class DayOfWeekMain {
    private static int workingHoursADay = 8;

    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    }

    public static String getWorkingHours(DayOfWeek p){
        if (p.ordinal() == 5 || p.ordinal() == 6){
            return("Сегодня выходной!");
        } else {
            return Integer.toString(DayOfWeek.SATURDAY.compareTo(p) * workingHoursADay);
        }
    }
}
