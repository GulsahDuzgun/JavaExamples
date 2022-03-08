import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String [][] yildiz=new String[6][4];

        for(int i=0;i<yildiz.length;i++){
            for(int j=0;j<yildiz[i].length;j++){
                if (i==0||i==3) {
                    yildiz[i][j]=" * ";
                }

                else if(j==0){
                    yildiz[i][j]=" * ";
                }
                else if(i<=3&& j==3){
                    yildiz[i][j]=" * ";
                }
                else
                    yildiz[i][j]="   ";

            }
        }

        for(String[]a :yildiz){
            for(String str:a){

                System.out.print(str);


            }
            System.out.println();
        }
    }
}
