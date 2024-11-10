import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Task 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека меньше " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }

        //Task 2
        int temperature = 3;
        if (temperature <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }


        //Task 3
        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }


        //Task 4
        int ageFromTask4 = 28;
        if (ageFromTask4 >= 2 && ageFromTask4 <= 6) {
            System.out.println("Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад");
        } else if (ageFromTask4 >= 7 && ageFromTask4 <= 17) {
            System.out.println("Если человеку от 7 до 17 лет, то ему нужно ходить в школу");
        } else if (ageFromTask4 >= 18 && ageFromTask4 <= 24) {
            System.out.println("Если человеку больше или равно 18 лет, но меньше или равно 24, то его место в университете");
        } else {
            System.out.println("Если человеку больше 24, то ему пора ходить на работу");
        }


        //Task 5
        int kidsAge = 9;
        if (kidsAge < 5) {
            System.out.println("Если возраст ребенка равен " + kidsAge + ", то ему нельзя кататься на аттракционе");
        } else if (kidsAge >= 5 && kidsAge < 14) {
            System.out.println("Если возраст ребенка равен " + kidsAge + ", то ему  можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + kidsAge + ", то можно кататься без сопровождения взрослого");
        }


        //Task 6
        int wagonCapacity = 102;
        if (wagonCapacity <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (wagonCapacity > 60 && wagonCapacity <= 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Вагон уже полностью забит");
        }

        //Task7

        int one = 7;
        int two = 10;
        int three = 2;
        if (one > two && one > three) {
            System.out.println("Первое число больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Второе число больше остальных");
        } else {
            System.out.println("Третье число больше остальных");
        }


    }
}