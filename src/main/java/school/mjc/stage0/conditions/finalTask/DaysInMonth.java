package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public static void printDays(int year, int month) {
        boolean inputDateCheck = year > 0 && month > 0 && month < 13;
        boolean leapYear = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
        if (inputDateCheck) {
            if (leapYear && month == 2) {
                System.out.println(29);
            } else if (!leapYear && month == 2) {
                System.out.println(28);
            } else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println(31);
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println(30);
                        break;
                }
            }
        } else {
            System.out.println("invalid date");
        }
    }

    public static void main(String[] args) {
        printDays(-2000, 13);

    }
}
