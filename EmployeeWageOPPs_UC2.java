import java.util.Random;

public class EmployeeWageOPPs_UC2 {
    static void EmpWage() {

        int isPresent = 1;
        int FullDayHour = 8;
        int WagePerHour = 20;
        int DailyWage;
        Random rand = new Random();
        int x = rand.nextInt(2);
        System.out.println(x);

        if (x == isPresent) {
            System.out.println("Employee is present");
            DailyWage = WagePerHour * FullDayHour;
            System.out.println("Employee Daily Wage " + DailyWage);
        } else {
            System.out.println("Employee is absent");
        }
    }
        public static void main (String[]args){
            EmpWage();
        }
    }
