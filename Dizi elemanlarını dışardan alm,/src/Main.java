import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[][] dizi1 = new double[3][4];

        randomSayiAtama(dizi1);
        yazdir(dizi1);

      /*  Scanner input =new Scanner(System.in);
        System.out.println("[3][4] int tipindeki dizi elemanlarınızı giriniz");
        for(int i=0;i<dizi1.length;i++){
            for(int j=0;j<dizi1[i].length;j++)
            {
                dizi1[i][j]=input.nextInt();
            }
        }
        yazdir(dizi1);



    }

    static void yazdir (int a[][]){
        for (int m=0;m<a.length;m++){
            for(int k=0;k<a[m].length;k++){
                System.out.print(a[m][k]);
            }
            System.out.println("");
        }
    */
    }

     static void randomSayiAtama(double [][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=Math.random()*10;

            }
        }
     }
     static  void yazdir(double [][]b){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.println("");
        }
     }

}
