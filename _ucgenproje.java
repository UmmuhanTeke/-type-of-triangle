package task2;

import java.util.Scanner;

public class _ucgenproje {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int kenar1;
        int kenar2;
        int kenar3;

        System.out.print("Birinci Kenar Giriniz=");
        kenar1=scanner.nextInt();
        System.out.print("İkinci Kenar Giriniz=");
        kenar2=scanner.nextInt();
        System.out.print("Üçüncü Kenar Giriniz=");
        kenar3=scanner.nextInt();

        if (kenar1==kenar2 && kenar1==kenar3)
            System.out.println("Eşkanar Üçgen");
        else if (kenar1==kenar2 ||  kenar1==kenar3 ||  kenar3==kenar2)
        System.out.println("İkizkenar Üçgen");

        else System.out.println("Çeşitkenar Üçgen");

        scanner.close();
    }

}
