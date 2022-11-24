import java.util.Scanner;
public class lab1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nowday=25, nowmonth=11, nowyear=2022, n=1;
        System.out.println("Введите данные даты Вашего рождения ");
        System.out.print("День рождения: ");
        int day = in.nextInt();
        while (day>31) {
            System.out.println("Некорректно введены значения. Попробуйте ещё раз. ");
            System.out.print("День рождения: ");
            day = in.nextInt();
        }
        System.out.print("Месяц рождения: ");
        int month = in.nextInt();
        while (month>12) {
            System.out.println("Некорректно введены значения. Попробуйте ещё раз. ");
            System.out.print("Месяц рождения: ");
            month = in.nextInt();
        }
        while (n==1){
            if ((month==2) && (day>28)) {
                System.out.println("Ошибка");
                break;}
            if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)){
                System.out.println("Ошибка");
                break;}
            System.out.print("Год рождения: ");
            int year = in.nextInt();
            if (nowyear - year < 0){
                System.out.println("Человек ещё не родился");
                break;}
            else
                year = nowyear - year;
            if (nowmonth - month > 0)
                month = nowmonth - month;
            else {
                if (year == 0){
                    System.out.println("Человек ещё не родился");
                    break;}
                else {
                    year -= 1;
                    month = nowmonth - month + 12;
                }
            }
            if (nowday - day > 0)
                day = nowday - day;
            else {
                if (year == 0 && month == 0){
                    System.out.println("Человек ещё не родился");
                    break;}
                if (year >= 0 && month > 0) {
                    day = nowday + 30 - day;
                    month -= 1;
                }
            }
            System.out.println("На 25 ноября 2022 Вам:");
            System.out.println(year + " лет " + month + " месяцев " + day + " дней ");
            n+=1;
        }
        in.close();
    }
}
