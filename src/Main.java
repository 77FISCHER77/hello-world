public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать.");
        }


    }

    public static void task2 () {
        System.out.println("Задача 2");
        int degreesCelsius = 15;
        if (degreesCelsius > 5) {

            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed  = 70;
        if (speed > 60) {

            System.out.println(" Если скорость " + speed + " то  придется заплатить штраф ");
        } else {
            System.out.println(" можно ездить спокойно ");
        }


    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 7;
        if (age >= 2 && age <= 6) {

            System.out.println(" Если возраст человека равен " + age + " то ему нужно ходить в детский сад ");
        }  else if (age >= 7 && age <=18) {
            System.out.println(" Если возраст человека равен " + age + " то ему нужно ходить в школу ");
        }   else if (age >= 18 && age <= 24  ) {
            System.out.println(" Если возраст человека равен " + age + " то его место в университете ");
        }  else {
            System.out.println("Если возраст человека больше 24 лет то ему пора ходить на работу");
        }







    }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 13;
        if (age < 5) {
            System.out.println(" Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе ");
        } else if (age >= 5 && age <= 14) {
            System.out.println(" Если возраст ребенка равен " + age + " то он может кататься только в сопровождении взрослого ");

        } else if (age > 14) {
            System.out.println(" Если возраст ребенка равен " + age + " то он может кататься без сопровождения взрослого ");
        }



    }
    public static void task6 () {
        System.out.println("Задача 6");

        int place = 70;
        if (place <= 60) {
            System.out.println(" в вагоне есть сидячие места ");
        } else if (place > 60 && place <= 102) {
            System.out.println(" в вагоне есть стоячие места ");

        } else {
            System.out.println(" в вагоне мест нет ");


        }

    }

    public static void task7 () {
        System.out.println("Задача 7");
        int number = 1;
        int one = 1;
        int two = 2;
        int three = 3;
        if (number > one) {
            System.out.println(" число " + two + " больше одного ");
        } else if (number > two) {
            System.out.println(" число " + three + " больше двух");


    } else {
        System.out.println(" число " + one + " меньше 2 и 3 " + "Привет мир!" );
       }

    }






}