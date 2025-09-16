public class EnumExample {
     public static void main(String[] args) {
        Day today = Day.SATURDAY;
        System.out.println("Today is: " + today);

        // Using enum in a switch statement
        switch (today) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a weekday.");
        }
    }
}
