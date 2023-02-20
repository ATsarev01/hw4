public class Main {
    public static void main(String[] args) {
        task1();


    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            int age2 = 17;
            if (age2 < 18) {
                System.out.println("Если возраст человека равен " + age2 + ", то он не достиг совершеннолетия, нужно подождать");
        }

                System.out.println("Задача 2");
            int temperature = 4;
            if (temperature < 5) {
                System.out.println("На улице " + temperature + " градуса," + " нужно надеть шапку");
                int temperature2 = 7;
                if (temperature2 > 5) {
                    System.out.println("На улице " + temperature2 + " градусов," + " можно идти без шапки");
                }
                System.out.println("Задача 3");
                int speed = 50;

                if (speed >= 60) {

                    System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
                } else {

                    System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
                }
            }
            System.out.println("Задача 4");
            int age3 = 30;
            if (age3 >= 2 && age3 < 6) {
                System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
            } if (age3 >= 7 && age3 < 18) {
                System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
            } if (age3 > 18 && age3 < 24) {
                        System.out.println("Если возраст человека равен " + age3 + ", то ему место в университете");
                    } if (age3 >24) {
                            System.out.println("Если возраст человека равен " + age3 + ", то ему пора ходить на работу");
            }

            System.out.println("Задача 5");
            int age4 = 20;
            if (age4 < 5) {
                System.out.println("Если возраст ребенка равен " + age4 + ", то ему нельзя кататься на аттракционе");
            }
            if (age4 > 5 && age4 < 14) {
                System.out.println("Если возраст ребенка равен " + age4 + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            } else {
                System.out.println("Если возраст ребенка равен " + age4 + ", то он может кататься без сопровождения взрослого");
            }
            System.out.println("Задача 6");

            int passangers = 145;
            if (passangers >= 60 && passangers <= 102) {
                System.out.println("Если в вагоне " + passangers + " пассажиров, то есть только стоячие места" );
            } if (passangers < 60) {
                System.out.println("Если в вагоне " + passangers + " пассажиров, то есть сидячие места" );
            } if (passangers > 102) {
                System.out.println("Если в вагоне " + passangers + " пассажиров, то вагон полностью забит" );
            }
            System.out.println("Задача 7");
            int one = 40;
            int two = 20;
            int three = 30;
            if (one > two && one > three) {
                System.out.println("Первое число большее");
            }else {
                System.out.println("Первое число меньшее");
            }
            if (two > one && two > three) {
                System.out.println("Второе число большее");
            }else {
                System.out.println("Второе число меньшее");
            }
            if (three > one && three > two) {
                System.out.println("Третье число большее");
            }else {
                System.out.println("Третье число меньшее");
            }




    }

    }}