public class Main {
public static void main(String[] args) {
        Fighter f1=new Fighter("Ali",20,140,95,34);
        Fighter f2=new Fighter("Mustafa",30,100,90,20);

        Ring saha =new Ring(f1,f2,100,85);
        saha.match(f1,f2);

        saha.hit(f1,f2);

    }


}
