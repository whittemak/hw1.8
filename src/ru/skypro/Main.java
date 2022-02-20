package ru.skypro;

public class Main {
    public static void printResult(int yearNumber) {
        boolean LeapYear = ((yearNumber % 4 == 0) && (yearNumber % 100 != 0) || (yearNumber % 400 == 0));
        if (LeapYear) {
            System.out.println(yearNumber + " - високосный год");
        } else {
            System.out.println(yearNumber + " - не вискосный год");
        }
    }

    public static void installApp(int versionApp, int os) {
        if (versionApp > 2022 && versionApp == 0) {
            System.out.println("Установите Lite версию приложения для IOS");
        } else if (versionApp > 2022 && versionApp != 0) {
            System.out.println("Установите Lite версию приложения для Android");
        }

    }

    public static int printDeliveryDistance(int distance) {
        int daysNumber = 0;
        if (distance < 20) {
            daysNumber = daysNumber + 1;
        }
        if (distance >= 20 && distance < 60) {
            daysNumber = daysNumber + 2;
        }
        if (distance >= 60 && distance < 100) {
            daysNumber = daysNumber + 3;
        }
        return daysNumber;
    }

    public static void findAndPrintDubles(String text) {
        boolean isDublesHere = false;
        char[] letters = text.toCharArray();
        for (int i = 1; i < letters.length; i++) {
            if (letters[i] == letters[i - 1]) {
                System.out.println("Найден дубль символа " + letters[i]);
                isDublesHere = true;
                break;
            }
        }
        if (!isDublesHere) {
            System.out.println("Дублей нет");
        }
        public static void reverseArray(int[] arr){
            int leftIndex = 0;
            int rightIndex = arr.length - 1;
            while(leftIndex < rightIndex){
                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
                leftIndex ++;
                rightIndex --;
            }
        }

        public static void main (String[]args){
            int year = 2021;
            printResult(year);
            System.out.println();
            int currentYear = 2022;
            int Os = 0;
            installApp(currentYear, Os);
            System.out.println();
            System.out.println("Количество дней для доставки " + printDeliveryDistance(30));
            System.out.println();
            String text1 = "aabccddefgghiijjkk";
            findAndPrintDubles(text1);
            System.out.println();
            int[] array = {3, 2, 1, 6, 5};
            reverseArray(array);
        }
