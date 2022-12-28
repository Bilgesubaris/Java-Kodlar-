import java.util.Scanner;
public class ortalama1 {
  public static void main (String args []){

      int [] dizi = {67,23,44,12,6,89,112,94};
      int toplam=0;
      for( int number: dizi){
          toplam= toplam+ number;
          System.out.println(number);
      }
      System.out.println( "Toplam : " + toplam );
     double ortalama = toplam / 8 ;
      System.out.println("Ortalama : " + ortalama);

      for(int i = 0 ; i<dizi.length ; i++) {
          if (dizi[i]> ortalama){
          System.out.println(dizi[i]);
              }
          else{

      }
      }



      }

      }






