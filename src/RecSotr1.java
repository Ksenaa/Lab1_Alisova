import java.util.Scanner;
class Sotrudnikk{
    String fam,im,otch, doljnost ;
    int kolDet;
    Rebenok []reb=null;
}
class Rebenok{
    String imaR;
    int vozrastR;
}
public class RecSotr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"utf-8");
        System.setProperty("console.encoding","utf-8");
        System.out.println("Введіть кількість співробітників => ");
        int kol=sc.nextInt();
        sc.nextLine(); // очистка буфера
        Sotrudnikk []sotr=new Sotrudnikk[kol];
        System.out.println("Введіть інформацію про кожного співробітника: ");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i] = new Sotrudnikk();
            System.out.print("Введіть Прізвище " + (i + 1) + " співробітника => ");
            sotr[i].fam = sc.nextLine();
            System.out.print("Введіть Ім’я => ");
            sotr[i].im = sc.nextLine();
            System.out.print("Введіть По батькові => ");
            sotr[i].otch = sc.nextLine();
            System.out.print("Введіть Посаду => ");
            sotr[i].doljnost = sc.nextLine();
            System.out.print("Введіть Кількість дітей => ");
            sotr[i].kolDet = sc.nextInt();
            sc.nextLine(); // очистка буфера
            if (sotr[i].kolDet != 0) {
                sotr[i].reb = new Rebenok[sotr[i].kolDet];
                System.out.println("Діти => ");
                for (int j = 0; j < sotr[i].reb.length; j++) {
                    sotr[i].reb[j] = new Rebenok();
                    System.out.print("Введіть м’я " + (i + 1) + " дитини => ");
                    sotr[i].reb[j].imaR = sc.nextLine();
                    System.out.print("Введіть її вік => ");
                    sotr[i].reb[j].vozrastR = sc.nextInt();
                    sc.nextLine(); // очистка буфера
                }
            }
        }
        System.out.println("\nСпівробітники фірми \n Прізвище \t Ім’я \t По батькові \t Посада");
        for (Sotrudnikk s : sotr) {
            System.out.print(s.fam + "\t" + s.im + "\t" + s.otch + "\t " + s.doljnost);
            System.out.println("\n Діти: ");
            for (Rebenok r : s.reb)
                System.out.println("\t\t\t" + r.imaR + "\t\t" + r.vozrastR);
            System.out.println(" ");
        }
    }
}
