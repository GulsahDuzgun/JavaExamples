public class Main
{
    public static void main(String[] args) {


        int [] dizi1={1,3,34,54,56,-54,32,-343,232};
        int min=dizi1[0];
        int max=dizi1[0];

        for(int a:dizi1){
            if(min>a){
                min=a;
            }
            if(max<a)
            {
                max=a;
            }

        }
        System.out.println("En küçük eleman:"+min+"\n En büyük eleman ise:"+max);

    }
}
