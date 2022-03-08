import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int []dizi1= new int[]{1,21,3,43,5,4,3,3};
        System.out.println(Arrays.toString(dizi1));

        int []dizi2={1,2,3,4,3,23,3};
        Arrays.fill(dizi2,3);// bütün dizi elemanlarına 3 değeri girilir
        System.out.println(Arrays.toString(dizi2));

        Arrays.fill(dizi2,2,5,23);//5. indeks dahil değildir
        System.out.println(Arrays.toString(dizi2));

        int []sirala=new int[]{2,-4,-43,34,3};
        Arrays.sort(sirala);
        Arrays.sort(dizi1,2,6);//6. indeks dahil değildir
        System.out.println(Arrays.toString(sirala));
        System.out.println(Arrays.toString(dizi1));
        System.out.println(Arrays.toString(dizi2));

        int index=Arrays.binarySearch(dizi2,23);
        System.out.println(index);

        int []copy=Arrays.copyOf(dizi1,5);
        System.out.println(Arrays.toString(copy));

        int [] range=Arrays.copyOfRange(copy,2,4);//Sadece 2 ve 3 indisli elemanları alır
        System.out.println(Arrays.toString(range));

        boolean sonuc=Arrays.equals(dizi1,dizi2);
        System.out.println(sonuc);

        int []f2={3,3,23,23,23,3,3};
        boolean equal=Arrays.equals(dizi2,f2);
        System.out.println(equal);

    }
}
