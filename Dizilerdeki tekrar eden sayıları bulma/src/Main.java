public class Main {

    static boolean isFind(int a,int []list){

        for(int eleman:list){
            if(eleman==a){
                return false;
            }


        }
        return true;
    }

    public static void main(String[] args) {

        int [] dizi={3,24,4,5,5,6,4,8,6,9,0,1,2};
        int [] tekrarEden=new int [dizi.length];

        for(int i=0;i< dizi.length;i++){
            for(int j=0;j< dizi.length;j++){

                if(j!=i && dizi[i]==dizi[j]){
                    {
                        if(isFind(dizi[j],tekrarEden)) {
                            tekrarEden[j] = dizi[j];
                        }
                    }
                }
            }

        }
        for(int a:tekrarEden) {
            if(a!=0)
            System.out.println(a);
        }

    }
}
