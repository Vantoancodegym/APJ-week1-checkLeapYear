import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input year: ");
        int year = scanner.nextInt();
        if ((year%400==0)||(year%4==0&&year%100!=0)){
            System.out.println(year + " is leap year");
        }else {
            System.out.println(year+" is not leap year");
        }
    }
}
