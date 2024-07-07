import java.util.Scanner;

public class manavkasaprogrami {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,toplam;
        toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo ? : ");
        armut = input.nextDouble();
        toplam += armut * 2.14;
        System.out.println("Elma kaç kilo ? : ");
        elma = input.nextDouble();
        toplam += elma * 3.67;
        System.out.println("Domates kaç kilo ? : ");
        domates = input.nextDouble();
        toplam += domates * 1.11;
        System.out.println("Muz kaç kilo ? : ");
        muz = input.nextDouble();
        toplam += muz * 0.95;
        System.out.println("Patlıcan kaç kilo ? : ");
        patlican = input.nextDouble();
        toplam += patlican * 5.00;

        System.out.println("Toplam tutar "+toplam+" Tl'dir");

    }
}
