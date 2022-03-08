public class Main {
    public static void main(String[] args) {
        //Diziler new anahtar kelimesiyle oluşturulur bu yüzden belleğin Heap denilen bölümünde tutulurlar.
        //Diz adı dizinin başlangıç adresini tutar
        // int [] reverse (){} gibi dizi döndüren fonksiyon ismi de tanımlanabilir

        int [] list={12,21,32,4,3,23,23,3,5,4};
        double [] dizi2=new double [3];
        dizi2[0]=1.23;
        dizi2[1]=23.4;
        dizi2[2]=34.2;

        reverse(dizi2);
    }

    public static double [] reverse(double []a){
        double [] tersten=new double[a.length];
        for(int i=0,j=a.length-1;i<a.length;i++,j--){
            tersten[i]=a[j];
        }
        print(tersten);
        return  tersten;
    }

    public static void print(double []d1){
        for(int i=0;i<d1.length;i++){
            System.out.println(d1[i]);
        }

    }

}

