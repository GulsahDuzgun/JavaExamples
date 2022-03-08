import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int deger = input.nextInt();

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        int sayi = 0;
     boolean isPass=true;

        for (int a : dizi) {
            if (a >= deger) {
                sayi = a;

                break;
            }
        }
            int index = Arrays.binarySearch(dizi, sayi);
            // System.out.println(index);
            index=index-1;
            System.out.println("Sayıdan küçük en yakın sayı " +dizi[index]+" Sayıdan buyuk en yakın sayı "+sayi);


    }
}



