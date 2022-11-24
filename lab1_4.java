import java.util.Scanner;
public class lab1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите желаемое количество точек N: ");
        int N= in.nextInt();
        while (N<=0){
            System.out.println("Некорректно введены значения. Попробуйте ещё раз");
            System.out.print("Введите желаемое количество точек N: ");
            N= in.nextInt();
        }
        System.out.print("Введите желаемый радиус окружности R: ");
        float R= in.nextFloat();
        while (R<=0){
            System.out.println("Некорректно введены значения. Попробуйте ещё раз");
            System.out.print("Введите желаемый радиус окружности R: ");
            R= in.nextFloat();
        }
        int k =1;
        System.out.println("Введите координаты точек: ");
        int count=0;
        while (N>0){
            System.out.print("X "+k+" точки: ");
            float X= in.nextFloat();
            System.out.print("Y "+k+" точки: ");
            float Y= in.nextFloat();
            if (X*X+Y*Y<=R*R)
                count+=1;
            k+=1;
            N-=1;
        }
        System.out.println(count + " точек попали в окружность");
    }
}

