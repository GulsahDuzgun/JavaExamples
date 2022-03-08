public class Main {
    public static void main(String[] args) {

        int []dizi={1,2,3,4,5};
        double toplam=0.0;

        for(int i=0;i<dizi.length;i++)
        {
            toplam+=dizi[i];
        }

        System.out.println("Ortalama: "+toplam/dizi.length);
    }
}
