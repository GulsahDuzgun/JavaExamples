public class Main {
    public static void main(String[] args) {

      /*  //String []cars=new String[]{"Audi","BMV","Toyota"};
        String []cars={"Audi","BMV","Toyota"};

        for(String str :cars){
            System.out.println(str);
        }*/

        int [][] matris={{1,2,3},{3,4,3}};
        for(int []a:matris)
        {
            for(int b:a)
                System.out.print(b+" ");

            System.out.println();
        }

    }

}
