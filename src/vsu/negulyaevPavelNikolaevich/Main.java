package vsu.negulyaevPavelNikolaevich;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void out(String s) {
        System.out.print(s);
    }

    public static void outln(String s) {
        System.out.println(s);
    }



    public static void main(String[] args) {
        Storage storage = new Storage();
        Scanner scanner = new Scanner(System.in);

        out("Функция вида 1/sqrt(1+x)\n----------------------------------\nВведите x от -1 до 1: ");
        double x = scanner.nextDouble();   // 0 < x < 1
        out("Введите E: ");
        double e = scanner.nextDouble();   // чем меньше E, тем больше точность
        out("Введите количество слагаемых N, которые надо суммировать: ");
        int n = scanner.nextInt();         // количество слагаемых

        SolutionClass.solution(x, e, n, storage);
        outln("----------------------------------");
        outln("Сумма N слагаемых прогрессии = " + storage.sumN);
        outln("Сумма слагаемых, которые больше E = " + storage.sumE);
        outln("Сумма слагаемых, которые больше чем E/10 = " + storage.sumE10);
        outln("Значение функции с помощью метода math = " + (1/Math.pow(1+x, 0.5)));
    }
}
