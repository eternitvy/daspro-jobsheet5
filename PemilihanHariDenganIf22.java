import java.util.Scanner;
public class PemilihanHariDenganIf22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayName;
        String dayType;

        System.out.print("Input day name: ");
        dayName = sc.nextInt();
        
        if (dayName >=1 && dayName <=5)
        {
            System.out.print(dayName + " is a " + (dayType = "weekday"));
        }
        else if  (dayName >=6 && dayName <=7)
        {
            System.out.print(dayName + " is a " + (dayType = "weekend"));
        }
        else{
            System.out.print("invalid number");
        }
    }
}