import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class Person2{
    String priz, im, bat, newpriz, newim, newbat;
    int vik, rozmir, newvik, newrozmir;
}
public class People2 {public static Person2[] setPeopleArr(int kil) {
    // Введення масиву країн
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
    System.setProperty("console.encoding", "utf-8");
    Person2[] people2 = new Person2[kil];
    System.out.println("Введіть інформацію про людину: ");
    for (int i = 0; i < people2.length; i++) {
        people2[i] = new Person2();
        System.out.print("Введіть прізвище " + (i + 1) + "-го" + " клієнта => ");
        people2[i].priz = sc.nextLine(); //прізвище
        System.out.print("Введіть його ім’я => ");
        people2[i].im = sc.nextLine();//ім'я
        System.out.print("Введіть його по батькові => ");
        people2[i].bat = sc.nextLine();//по батькові
        System.out.print("Введіть вік => ");
        people2[i].vik = sc.nextInt();//вік
        System.out.print("Введіть розмір одягу => ");
        people2[i].rozmir = sc.nextInt();//розмір
        sc.nextLine(); // очищення буфера
    }
    return people2;
}
    // __________________________________________________________________________________________________________________________
    public static void showArray(Person2[] cntr) {
        System.out.println( "Прізвище \t Ім’я \t По батькові \t Вік \t Розмір одягу");
        for (Person2 person2 : cntr) {
            System.out.println("" + person2.priz + "\t" + person2.im + "\t" + person2.bat + "\t" + person2.vik + "\t" + person2.rozmir);
        }
        System.out.println("________________________________________________________________________________________________");
    }
    // __________________________________________________________________________________________________________________________
    public static void showPeople(Person2 cntr) {
        //Інформація про одну людину
        System.out.println("" + cntr.priz + "\t" + cntr.im + "\t" + cntr.bat + "\t" + cntr.vik + "\t" + cntr.rozmir);
        System.out.println("________________________________________________________________________________________________");
    }
    // __________________________________________________________________________________________________________________________
    public static int maxRozmir(Person2[] mr) {
        //номер людини яка має набільший розмір одягу
        System.out.println("\nЛюдина, яка має найбільший розмір одягу: ");
        int maxroz = 0;
        double max = mr[maxroz].rozmir;
        for (int i = 0; i < mr.length; i++)
            if (mr[i].rozmir > max) {
                max = mr[i].rozmir;
                maxroz = i;
            }
        return maxroz;
    }
    // __________________________________________________________________________________________________________________________
    public static double avg(Person2[] avg) {
        //визначити середній розмір одягу для людей віком від 40 років;
        int counte = 0;
        double sum = 0;
        double srr = 0;
        for (Person2 person2 : avg)
            if (person2.vik > 40) {
                counte += 1;
                sum += person2.rozmir;//сума значень розміру
                srr = sum / counte;//середнє значення
            }
        return srr;
    }
    // __________________________________________________________________________________________________________________________
    public static void sortRoz(Person2[] sr) {
        //упорядкувати масиву за зростанням розміру одягу;
        for (int i = 0; i < sr.length - 1; i++)
            for (int j = 0; j < sr.length - 1 - i; j++)
                if (sr[j].rozmir > sr[j + 1].rozmir) {
                    Person2 sort = sr[j];
                    sr[j] = sr[j + 1];
                    sr[j + 1] = sort;
                }
    }
    // __________________________________________________________________________________________________________________________
    public static Person2 findPriz(Person2[] findd, String namee) {
        int nomm = -1;//людина з таким прізвищем відсутня
        for (int i = 0; i < findd.length; i++)
            if (namee.equals(findd[i].priz))
                nomm = i;
        if (nomm != -1) {
            return findd[nomm];
        } else return null;
    }
    // __________________________________________________________________________________________________________________________
    public static void option1(Person2 cntr) {//змінюю прізвище
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Введіть нове прізвище => ");
        cntr.newpriz = sc.nextLine();
        System.out.println("       Змінені дані\n" + "______________________________\n" + cntr.newpriz+ "\t" + cntr.im + "\t" + cntr.bat + "\t" + cntr.vik + "\t" + cntr.rozmir);
    }
    public static void option2(Person2 cntr) {//змінюю ім'я
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Введіть його ім’я => ");
        cntr.newim= sc.nextLine();
        System.out.println("       Змінені дані\n" + "______________________________\n" + cntr.priz+ "\t" + cntr.newim + "\t" + cntr.bat + "\t" + cntr.vik + "\t" + cntr.rozmir);
    }
    public static void option3(Person2 cntr) {//по батькові
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Введіть по батькові => ");
        cntr.newbat= sc.nextLine();
        System.out.println("       Змінені дані\n" + "______________________________\n" + cntr.priz+ "\t" + cntr.im + "\t" + cntr.newbat + "\t" + cntr.vik + "\t" + cntr.rozmir);
    }
    public static void option4(Person2 cntr) { //змінюю вік
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Введіть правильний вік людини  => ");
        cntr.newvik= sc.nextInt();
        System.out.println("       Змінені дані\n" + "______________________________\n" + cntr.priz+ "\t" + cntr.im + "\t" + cntr.bat + "\t" + cntr.newvik + "\t" + cntr.rozmir);
    }
    public static void option5(Person2 cntr) { //змінюю розмір одягу людини
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("Введіть правильний розмір одягу людини  => ");
        cntr.newrozmir= sc.nextInt();
        System.out.println("       Змінені дані\n" + "______________________________\n" + cntr.priz+ "\t" + cntr.im + "\t" + cntr.bat + "\t" + cntr.newvik + "\t" + cntr.newrozmir);
    }

    public static int Menu() {
        System.out.println("|    Оберіть які дані потрібно виправити     |");
        System.out.println("==============================================");
        System.out.println("|                  Варіанти:                 |");
        System.out.println("|1. Прізвище                                 |");
        System.out.println("|2. Ім'я                                     |");
        System.out.println("|3. По батькові                              |");
        System.out.println("|4. Вік                                      |");
        System.out.println("|5. Розмір                                   |");
        System.out.println("|6. Вихід                                    |");
        System.out.println("==============================================");
        System.out.println("\nОберіть потрібний варінт");
        int selection;
        Scanner input = new Scanner(System.in);
        selection = input.nextInt();
        return selection;
    }
    // __________________________________________________________________________________________________________________________
    public static void main(String[] args) { // головний класс з методами
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.setProperty("console.encoding", "utf-8");
        System.out.println("Введіть кількість людей = ");
        int kil = sc.nextInt(); // кількість людей
        Person2[] people2 = setPeopleArr(kil); // Введення інформації про людей
        System.out.println("\n               Характеристики людей:");
        //виведення отриманої інформації
        showArray(people2);
        //найбільший розмір одягу
        int maxroz = maxRozmir(people2);
        showPeople(people2[maxroz]);
        //визначити середній розмір одягу для людей віком від 40 років;
        System.out.println("\nСередній розмір людей вік яких більше за 40 = " + avg(people2));
        //упорядкувати масиву за зростанням розміру одягу;
        sortRoz(people2);
        System.out.println("\n                  Відсортований список за зростанням розміру одягу:");
        showArray(people2);
        //пошук
        System.out.println("\nВведіть прізвище потрібної Вам людини: ");
        sc.nextLine();
        String sprizz = sc.nextLine();
        Person2 sfindd = findPriz(people2, sprizz);
        if (sfindd != null) {
            showPeople(sfindd);
        } else {
            System.out.println("Такої людини не існує в базі");
        }
        int choice;
        //Меню вибору
        choice = Menu();
        switch (choice) {
            case 1 -> {
                assert sfindd != null;
                option1(sfindd);
            }
            case 2 -> {
                assert sfindd != null;
                option2(sfindd);
            }
            case 3 -> {
                assert sfindd != null;
                option3(sfindd);
            }
            case 4 -> {
                assert sfindd != null;
                option4(sfindd);
            }
            case 5 -> {
                assert sfindd != null;
                option5(sfindd);
            }
            case 6 -> System.out.println("Вихід вибрано");
            default -> System.out.println("Невірний вибір");
        }
    }
}
