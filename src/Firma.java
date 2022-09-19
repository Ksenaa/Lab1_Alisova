import java.util.Scanner;
 class Sotrudnik {
    String fam, im, otch, doljnost;
    int oklad;
}
public class Firma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"utf-8");
        System.setProperty("console.encoding","utf-8");
        System.out.println("Введіть кількість співробітників => ");
        int kol = sc.nextInt();
        sc.nextLine();
        Sotrudnik []sotr= new Sotrudnik[kol];
        System.out.println("Введіть інформацію про кожного співробітника");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i]=new Sotrudnik(); // отримано посилання на i-тий елемент
            System.out.print("Введіть прізвище "+(i+1)+"-го"+" співробітника => "); // Присвоєння значень полям
            sotr[i].fam= sc.nextLine();
            System.out.print("Введіть його ім’я => ");
            sotr[i].im=sc.nextLine();
            System.out.print("Введіть його по батькові => ");
            sotr[i].otch=sc.nextLine();
            System.out.print("Введіть його посаду => ");
            sotr[i].doljnost=sc.nextLine();
            System.out.print("Введіть його оклад => ");
            sotr[i].oklad=sc.nextInt();
            sc.nextLine(); //очищення буфера
        } // Виведення інформації про співробітників
        System.out.println( "\n Співробітники фірми: \n Прізвище \t Ім’я \t По батькові \t Посада \t Оклад");
        for (Sotrudnik s: sotr) {
            System.out.print(s.fam+ "\t" + s.im + "\t" + s.otch + "\t" +s.doljnost + "\t\t" +s.oklad+ "\n" );
        }
    }
}
