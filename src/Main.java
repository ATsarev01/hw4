public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            if (age < 18) {
                System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно подождать");
        }

    }

    }}