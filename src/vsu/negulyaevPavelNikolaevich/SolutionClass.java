package vsu.negulyaevPavelNikolaevich;

public class SolutionClass {
    public static void solution(double x, double e, int n, Storage storage){
    storage.sumE = 0;
    storage.sumN = 0;
    storage.sumE10 = 0;
    int numerator = 1; // числитель
    int denominator = 2; // знаменатель
    int elementIndex = 0;
    double currentElement = 0;


        while(true){
        if(elementIndex == 0) {
            // 1й элемент всегда 1
            currentElement = 1;
        } else {
            // определяем следующее слагаемое на основе прошлого
            currentElement = currentElement * (-x) * numerator / denominator;
            numerator += 2;
            denominator += 2;
        }
        if(elementIndex < n) {
            storage.sumN += currentElement;
        }
        if(Math.abs(currentElement) > e) {
            storage.sumE += currentElement;
        }
        if (Math.abs(currentElement) > e/10) {
            storage.sumE10 += currentElement;
        }
        if (elementIndex >= n && Math.abs(currentElement) < e/10) {
            break;
        }
        elementIndex++;
        }
    }
}
