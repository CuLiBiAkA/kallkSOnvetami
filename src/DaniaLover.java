import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class DaniaLover {
    private static String razborMassiva="";
private static int roll1=1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chislo = 0;
        int chislo1 = 0;
        String vvod = null;
        String vvod1 = null;
        boolean y = true;
        String yes1 = "да";
        String no1 = "нет";
        String yes2 = "да";
        String no2 = "нет";
        int rool = 1;


        while (y) {
            System.out.println("Введите число:");
            chislo = scanner.nextInt();
            chislo1 = scanner.nextInt();
            System.out.println("Забался? да/нет");
            vvod = scanner.next();
            if (vvod.equals(yes1)) {
                System.out.println("Хуйню посмотрим? да/нет");
                vvod1 = scanner.next();
                if (vvod1.equals(yes2)) {
                    sum(chislo,chislo1,rool);
                    System.out.println(razborMassiva);
                 //   System.out.println(Arrays.toString(sum(chislo, chislo1, rool)));
                    y = false;
                }
                if (vvod1.equals(no2)) {
                    y = false;
                }
                if (!vvod1.equals(no2) && !vvod1.equals(yes2)) {
                    System.out.println("Продолжаем");
                    continue;
                }

            }
            if (vvod.equals(no1)) {
                sum(chislo, chislo1, rool);
                rool++;
                System.out.println("Продолжаем");
                continue;
            }
            if (!vvod.equals(no1) && !vvod.equals(yes1) && vvod != null) {
                System.out.println("Продолжаем");
                continue;
            }

        }
    }

    public static String[] sum(int chislo, int chislo1, int roll) {
        String[] massiv = new String[1];
        int summa = chislo + chislo1;
        massiv[0] = String.valueOf(summa);
        massivskaiaEblia(massiv);
        roll1=roll+1;
        return massiv;

    }

    public static void massivskaiaEblia(String[] massiv) {

        razborMassiva = razborMassiva+" это "+String.valueOf(roll1)+" результат  " + Arrays.toString(massiv);
        System.out.println("ветка");

    }
}