import java.util.Scanner;

public class Alan {
    public static int h;
    public static  int kenar;


    static{
        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen  yükseklik değerini giriniz");
        h=input.nextInt();
        if(h<0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else
        {
            System.out.println("Paralel kenarın kenar uzunluğunu giriniz");
            kenar=input.nextInt();
            if(kenar<0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
            else
            {
                System.out.println("Paralel kenar alanı:"+(kenar*h));
            }
        }


}
}
