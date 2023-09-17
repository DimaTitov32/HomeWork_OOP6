public class Main {
    public static void main(String[] args) {
        NumberContainer<Integer> intContainer = new NumberContainer<>(5);
        NumberContainer<Double> doubleContainer = new NumberContainer<>(3.14);

        System.out.println("Квадрат целого числа: " + intContainer.square());
        System.out.println("Квадрат вещественного числа: " + doubleContainer.square());
    }
//    Единая ответственность 
//    Классы открыты для расширения и закрыты для исправления
}