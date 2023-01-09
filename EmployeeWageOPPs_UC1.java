import java.util.Random;
public class EmployeeWageOPPs_UC1 {
    static void EmployeeWage(){

    Random rand=new Random();
    int x= rand.nextInt(2);
    System.out.println(x);

    if (x == 1)
        System.out.println("Employee is present");
    else
        System.out.println("Employee is absent");
    }
    public static void main(String[] args) {
        EmployeeWage();
    }
}
