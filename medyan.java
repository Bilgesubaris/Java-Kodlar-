  import java.util.Random;
    public class medyan {
    public static void main (String[]args){
            Random random = new Random();
            int[] dizi = new int[8];
            for(int i=0 ;i< dizi.length ; i++ ) {
                dizi[i] = random.nextInt(8);
            }
java.util.Arrays.sort(dizi);
        System.out.println(java.util.Arrays.toString(dizi)) ;
        if (dizi[2] % 2 == 0) {
            System.out.println("Medyan: " + dizi [2]);
        }
else {
            System.out.println("Medyan: " + dizi [2]);
        }

    }


}
