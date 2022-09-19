import java.nio.charset.StandardCharsets;
import java.util.Scanner;
class Person{
    String priz, im, bat, newim, newpriz, newbat;
    int vik, rozmir, newvik, newrozmir; // числові значення
}
public class People {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        System.setProperty("console.encoding", "utf-8");
        // Виведення інформації про клієнта
        System.out.println("Введіть кількість людей = ");
        int kil = sc.nextInt(); // кількість людей
        Person[] people = new Person[kil];
        System.out.println("Введіть інформацію про людину: ");
        for (int i = 0; i < people.length; i++) {
            sc.nextLine(); // очищення буфера
            people[i] = new Person();
            System.out.print("Введіть прізвище " + (i + 1) + "-го" + " клієнта => "); // Присвоєння значень полям
            people[i].priz = sc.nextLine(); //прізвище
            System.out.print("Введіть його ім’я => ");
            people[i].im = sc.nextLine();//ім'я
            System.out.print("Введіть його по батькові => ");
            people[i].bat = sc.nextLine();//по батькові
            System.out.print("Введіть вік => ");
            people[i].vik = sc.nextInt();//вік
            System.out.print("Введіть розмір одягу => ");
            people[i].rozmir = sc.nextInt();//розмір
        }
        // Виведення отриманої інформації
        System.out.println("\n               Характеристики людей:");
        System.out.println( "Прізвище \t Ім’я \t По батькові \t Вік \t Розмір одягу");
        for (Person value : people) {
            System.out.println("" + value.priz + "\t" + value.im + "\t" + value.bat + "\t\t" + value.vik + "\t\t" + value.rozmir);
        }
        System.out.println("________________________________________________________________________________________________");
// __________________________________________________________________________________________________________________________
        int maxroz = 0; // номер людини яка має набільший розмір одягу
        double max = people[maxroz].rozmir; // максмимальний розмір (початкове значення)
        for (int i = 0; i < people.length; i++)
            if (people[i].rozmir > max) {
                max = people[i].rozmir;
                maxroz = i;
            }
        System.out.println("\nЛюдина, яка має найбільший розмір одягу: ");
        System.out.println( "Прізвище \t Ім’я \t По батькові \t Вік \t Розмір одягу");
        System.out.println("" + people[maxroz].priz + "\t" + people[maxroz].im + "\t" + people[maxroz].bat + "\t\t" + people[maxroz].vik + "\t\t" + people[maxroz].rozmir);
        System.out.println("________________________________________________________________________________________________");
// __________________________________________________________________________________________________________________________
        //визначити середній розмір одягу для людей віком від 40 років;
        int counte = 0;
        double sum = 0;
        for (Person person : people)//умова
            if (person.vik > 40) {
                counte += 1;
                sum += person.rozmir;//сума значень
            }
        double srr = sum / counte;//середнє значення
        System.out.println("Середній розмір людей вік яких більше за 40 = " + srr);
        System.out.println("________________________________________________________________________________________________");
// __________________________________________________________________________________________________________________________
        //упорядкувати масиву за зростанням розміру одягу;
        for (int i = 0; i < people.length-1; i++)
            for (int j = 0; j < people.length-1-i; j++)
                if (people[j].rozmir>people[j+1].rozmir){
                    Person rab=people[j]; // rab – робоча змінна для перестановки
                    people[j]=people[j+1];
                    people[j+1]=rab;
                }
        System.out.println("\n                  Упорядкований масив за зростанням розміру одягу:");
        System.out.println( "Прізвище \t Ім’я \t По батькові \t Вік \t Розмір одягу");
        for (Person value : people) {
            System.out.println("" + value.priz + "\t" + value.im + "\t" + value.bat + "\t\t" + value.vik + "\t\t" + value.rozmir);
        }
        System.out.println("________________________________________________________________________________________________");
// __________________________________________________________________________________________________________________________
        sc.nextLine(); // очищення буфера
        System.out.println("\nВведіть прізвище потрібної Вам людини: ");
        String im = sc.nextLine();
        int nom = -1; //−1 – людина відсутня
        for (int i = 0; i < people.length; i++)
            if (im.equalsIgnoreCase(people[i].priz)) nom = i;
        if (nom != -1) {
            System.out.println("Така людина є ->\n"
                    + people[nom].priz + "\t" + people[nom].im + "\t" + people[nom].bat + "\t" + people[nom].vik + "\t" + people[nom].rozmir);
        } else System.out.println("Такої людини не існує в базі");
        System.out.println("________________________________________________________________________________________________");
// __________________________________________________________________________________________________________________________
        //виправлення одного з полів виведення повної інформації про людину після редагування.
        int choice;
        //Відображення графіки меню
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
        // Switch construct
        System.out.println("\nОберіть потрібний варінт");
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                for (Person person : people) {
                    sc.nextLine();// очищення буфера
                    System.out.print("Введіть нове прізвище => ");
                    person.newpriz = sc.nextLine();
                    System.out.println("Змінені дані\n"
                            + person.newpriz + "\t" + people[nom].im + "\t" + people[nom].bat + "\t" + people[nom].vik + "\t" + people[nom].rozmir);break;
                }
            }
            case 2 -> {
                for (Person person : people) {
                    sc.nextLine();// очищення буфера
                    System.out.print("Введіть нове ім’я => ");
                    person.newim = sc.nextLine();
                    System.out.println("Змінені дані\n"
                            + people[nom].priz + "\t" + person.newim + "\t" + people[nom].bat + "\t" + people[nom].vik + "\t" + people[nom].rozmir);break;
                }
            }
            case 3 -> {
                for (Person person : people) {
                    sc.nextLine();// очищення буфера
                    System.out.print("Введіть по батькові => ");
                    person.newbat = sc.nextLine();
                    System.out.println("Змінені дані\n"
                            + people[nom].priz + "\t" + people[nom].im + "\t" + person.newbat + "\t" + people[nom].vik + "\t" + people[nom].rozmir);break;
                }
            }
            case 4 -> {
                for (Person person : people) {
                    sc.nextLine();// очищення буфера
                    System.out.print("Введіть правильний вік людини  => ");
                    person.newvik = sc.nextInt();
                    System.out.println("Змінені дані\n"
                            + people[nom].priz + "\t" + people[nom].im + "\t" + people[nom].bat + "\t" + person.newvik + "\t" + people[nom].rozmir);break;
                }
            }
            case 5 -> {
                for (Person person : people) {
                    sc.nextLine();// очищення буфера
                    System.out.print("Введіть правильний розмір одягу людини  => ");
                    person.newrozmir = sc.nextInt();
                    System.out.println("Змінені дані\n"
                            + people[nom].priz + "\t" + people[nom].im + "\t" + people[nom].bat + "\t" + people[nom].vik + "\t" + person.newrozmir);
                    break;
                }
            }
            case 6 -> System.out.println("Вихід вибрано");
            default -> System.out.println("Невірний вибір");
        }
    }
}