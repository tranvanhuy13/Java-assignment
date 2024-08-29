import java.util.Scanner;

public class avarage_weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days' temperatures: ");
        int days = scanner.nextInt();
        double []temps = new double[days];
        int sum =0;
        for (int i=0;i<days;i++){
            System.out.print("Day "+(i+1) +"'s temperature: ");
            temps[i] = scanner.nextInt();
            sum+=temps[i];
        }
        double aver = (double)sum/days;
        int cnt = 0;
        for (int i=0;i<days;i++){
            if(temps[i]>aver) cnt++;
        }
        System.out.println("Avarage temps: "+aver);
        System.out.println(cnt+" days above average");

    }
}
