public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }




    public static void task1() {
        System.out.println("Задача 1");

        int clentOS = 1;
        String os = clentOS == 0 ? " iOS " : " Android ";

        System.out.println(" Установите версию приложения для " + os + " по ссылке ");
    }
}

public static void task2() {
    System.out.println("Задача 2");

    int clientDeviceYear = 2007;
    String msg = clientDeviceYear <= 2015 ? " облегчёную версию " : " ";
    String os = clentOS == 0 ? " iOS " : " Android ";

    if (clentOS == 0 || clentOS == 1) {

        System.out.println(" Установите" + msg + " версию приложения для " + os + " по ссылке ");

    } else {
        System.out.println("SAAS");
    }
}
