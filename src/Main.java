import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dogum;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz : ");
        dogum = input.nextInt();

        if (dogum > 0){
            if ((dogum % 12) == 0){
                System.out.println("Çin Zodyağı Burcunuz : Maymun");
            }
            else if(( dogum % 12) == 1){
                System.out.println("Çin Zodyağı Burcunuz : Horoz");
            }
            else if(( dogum % 12) == 2 ){
                System.out.println("Çin Zodyağı Burcunuz : Köpek");
            }
            else if(( dogum % 12) == 3 ){
                System.out.println("Çin Zodyağı Burcunuz : Domuz");
            }
            else if(( dogum % 12) == 4 ){
                System.out.println("Çin Zodyağı Burcunuz : Fare");
            }
            else if(( dogum % 12) == 5 ){
                System.out.println("Çin Zodyağı Burcunuz : Öküz");
            }
            else if(( dogum % 12) == 6 ){
                System.out.println("Çin Zodyağı Burcunuz : Kaplan");
            }
            else if(( dogum % 12) == 7 ){
                System.out.println("Çin Zodyağı Burcunuz : Tavşan");
            }
            else if(( dogum % 12) == 8 ){
                System.out.println("Çin Zodyağı Burcunuz : Ejderha");
            }
            else if(( dogum % 12) == 9 ){
                System.out.println("Çin Zodyağı Burcunuz : Yılan");
            }
            else if(( dogum % 12) == 10 ){
                System.out.println("Çin Zodyağı Burcunuz : At");
            }
            else if(( dogum % 12) == 11 ){
                System.out.println("Çin Zodyağı Burcunuz : Koyun");
            }

        }
        else {
            System.out.println("Lütfen Geçerli Bir Tarih Giriniz! ");
        }
    }
}