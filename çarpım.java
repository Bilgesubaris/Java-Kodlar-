import java.util.Scanner;
public class çarpım {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        int sayi1,sayi2,sonuc=0 ;
        System.out.print("Birinci sayıyı giriniz : ");
         sayi1 = scan.nextInt();


        System.out.print("İkinci sayıyı giriniz : ");
        sayi2= scan.nextInt();


        for(int i=0 ; i<sayi2 ; i++){
            sonuc += sayi1 ;
            }
            System.out.println("Çarpım:  " + sonuc );

}
    }
