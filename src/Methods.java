public class Methods {

    public static void calculateViskosnyYear(int year){
        boolean isViskosnyYear;
        (isViskosnyYear) = year % 4==0 && year % 100!=0 || year % 400 ==0;
        if (isViskosnyYear) {
            System.out.println("Год " + year + " - это високосный год");
        }
        else {
            System.out.println("Год " + year + " - это обычный год");
        }

    }

    public static void defineOsVersion (int clientOS, int currentYear) {
        if (clientOS == 0) {
            if (currentYear == 2022)
                System.out.println("Установите стандартную версию приложения для iOS по ссылке");
            else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        else if (currentYear==2022) {
            System.out.println("Установите стандартную версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void calculateDeliveryTime (int deliveryDistance) {
        int deliveryCircle = 40;
        int deliveryDays = 1 + (deliveryDistance + 20)/deliveryCircle; // +1 день в начале формулы - это первый день если доставка происходит в радиусе 20 км

        System.out.println("Если дистанция до клиента составит " + deliveryDistance + " км, то время доставки карты составит " + deliveryDays + " дня");

    }

    public static void main(String[] args) {

        System.out.println("Задача 1");
        System.out.println("Калькулятор високосного года");

        int year = 2022;
        calculateViskosnyYear(year);

        System.out.println("Задача 2");
        System.out.println("Тип ОС и год выпуска");

        int clientOS = 1; //iOs = 0, android = 1
        int currentYear = 2022;  //2021 и ранее - облегченная версия, 2022 и позже - обычная
        defineOsVersion(clientOS, currentYear);

        System.out.println("Задача 3");
        System.out.println("Срок доставки банковскойй карты");

        int deliveryDistance = 95;
        calculateDeliveryTime(deliveryDistance);

    }
}