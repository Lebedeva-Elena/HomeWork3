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

    public static void task1() {
        System.out.println("Задача 1");
        int ageFather = 29;
        int ageSon = 7;
        if (ageFather >= 18) {
            System.out.println("Если возраст человека равен " + ageFather + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека " + ageFather + " , то он не достиг совершеннолетия и нужно немного подождать");
        }
        if (ageSon >= 18) {
            System.out.println("Если возраст человека равен " + ageSon + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека - " + ageSon + " , то он не достиг совершеннолетия и нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int weatherНesterday = -6;
        if (weatherНesterday <= -5 && weatherНesterday <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        int weatherToday = 10;
        if (weatherToday <= -5 && weatherToday <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 107;
        if (speed <= 60) {
            System.out.println("Если скрость " + speed + " можно ездить спокойно");
        } else {
            System.out.println("Если скрость " + speed + " придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 18;
        if (age < 2) {
            System.out.println("Если возраст человека " + age + " год, то ему пора спать");
        } else {

        }
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека " + age + " , то ему нужно ходить в детский сад");
        } else {
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        } else {
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " , то его место в университете");
        } else {
        }
        if (age > 24) {
            System.out.println("Если человеку больше " + age + " , то ему пора ходить на работу");
        } else {
        }
        if (age >= 60) {
            System.out.println("Если человек старше " + age + " , то он может отдохнуть");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageChildren = 14;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " , то он не может кататься на аттракционах");
        } else {
        }
        if (ageChildren >= 5 && ageChildren < 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " , то он может кататься на аттракционах только в сопровождении взрослого. Если взрослого нет - кататься нельзя");
        } else {
        }
        if (ageChildren >= 14) {
            System.out.println("Если ребенок старше " + ageChildren + " , то он может кататься на аттракционах без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int carriage = 102;
        int sittingSeat = 60;
        int standingSeat = carriage - sittingSeat; //стоячих мест
        int occupiedSittingSeat = 53; //уже занято сидячих мест
        int occupiedStandSeat = 30; //уже занято стоячих мест
        if (sittingSeat > occupiedSittingSeat) {
            System.out.println("Осталось еще " + (sittingSeat - occupiedSittingSeat) + " сидячих мест");
        }
        if (sittingSeat == occupiedSittingSeat) {
            System.out.println("Сидячих мест нет");
        }
        if (standingSeat > occupiedStandSeat) {
            System.out.println("Осталось еще " + (standingSeat - occupiedStandSeat) + " стоячих мест");
        }
        if (standingSeat == occupiedStandSeat) {
            System.out.println("Стоячих мест нет");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 5;
        int two = 7;
        int three = 10;
        if (one < two) {
            if (one < three) {
                System.out.println("Значение числа " + one + " больше");
            } else {
            }

            if (two < three)
                if (two > one) {
                    System.out.println("Значение числа " + two + " больше");
                } else {
                }
            if (three > one) {
                if (three > two) {
                } else {
                }
                System.out.println("Значение " + three + " больше");
                {
                }
            }


        }
    }
}

