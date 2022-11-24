import java.util.Scanner;
public class lab1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=1;
        System.out.println("Введите дату, чтобы узнать время года");
        System.out.print("Дата: ");
        int day = in.nextInt();
        while (day>31) {
            System.out.println("Некорректно введены значения. Попробуйте ещё раз. ");
            System.out.print("Дата: ");
            day = in.nextInt();
        }
        System.out.print("Месяц: ");
        int month = in.nextInt();
        while (month>12) {
            System.out.println("Некорректно введены значения. Попробуйте ещё раз. ");
            System.out.print("Месяц: ");
            month = in.nextInt();
        }

        if (((month==2) && (day>28)) || ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)) )
            System.out.println("Ошибка");
        else{
            System.out.print("Время года: ");
            if (month==12 || month==1 || month==2)
                System.out.println("Зима");
            if (month==3 || month==4 || month==5)
                System.out.println("Весна");
            if (month==6 || month==7 || month==8)
                System.out.println("Лето");
            if (month==9 || month==10 || month==11)
                System.out.println("Осень");
        }
    }
}