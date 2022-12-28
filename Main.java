import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

 Scanner scan = new Scanner(System.in);
        System.out.print("POWS: ");
        int sayi = scan.nextInt();
        int sayac = 1;

        for(int i=1; i<= sayi ; i++){
            for ( int j =1 ; j<=i; j++){

        System.out.println(sayac + " " );
     sayac++ ;
            }
            System.out.println( );


    }
}

}