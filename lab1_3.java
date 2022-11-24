import java.util.Scanner;
public class lab1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое число: ");
        float x = in.nextFloat();
        while ((x*10)%10!=0){
            System.out.println("Вы ввели не целое число. Попробуйте ещё раз.");
            System.out.print("Введите любое целое число: ");
            x = in.nextFloat();
        }
        int x1=(int)x;
        System.out.print("Введите целое число от -15 до 15: ");
        int n = in.nextInt();
        while (n>=15 || n<=-15 || (n*10)%10!=0){
            System.out.println("Значение не попадает в диапазон. Попробуйте ещё раз.");
            System.out.print("Введите целое число от -15 до 15: ");
            n = in.nextInt();
        }
        int nNew = n;
        if (n<0) {
            n = (-1) * n;
            x = 1 / x;
        }
        float xNew = 1;
        while (n>0){
            xNew=xNew*x;
            n-=1;
        }
        System.out.println("При возведении числа " + x1 + " в степень " + nNew + " получается: " + xNew);
    }
}

