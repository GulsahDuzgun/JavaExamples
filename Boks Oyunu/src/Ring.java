public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1,Fighter f2,int maxWeight,int minWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }

    void match(Fighter f1,Fighter f2){
        if((this.f1.weight<=this.maxWeight && f1.weight>=this.minWeight)&&(this.f2.weight<=this.maxWeight && f2.weight>=this.minWeight ))
        {
            System.out.println("Karşılaşma yapılabilir");
        }
        else {
            System.out.println("Karşılaştırma yapılamaz");
        }
    }
        void hit(Fighter f1,Fighter f2){
        boolean deger=chanche(f1,f2);

        if(deger) {
            System.out.println("Başlayacak olan yarışmacı " + f1.name + " olarak seçildi");
            start(f1,f2);
        }
        else {
            System.out.println("Başlayacak olan yarışmacı " + f2.name + " olarak seçildi");
            start(f2,f1);
        }

        }
        boolean save(Fighter f1){
        double sayi=Math.random()*100;


        if(f1.dodge>sayi)
            return false;
        else
            return  true;

        }
        void start( Fighter f1,Fighter f2){
            System.out.println("Oyuncu Canları\n"+f1.name +": "+f1.health+"\n"+f2.name+":"+f2.health);
            System.out.println("======Round Başlıyor======");

            while(f1.health>0 && f2.health>0) {

                if(save(f2)) {
                    f2.health -= f1.damage;
                    System.out.println(f1.name + " vurdu=> " + f2.health);
                }else
                    System.out.println("Yarışmacı savurdu");

                if(save(f1)) {
                    f1.health -= f2.damage;
                    System.out.println(f2.name + " vurdu=> " + f1.health);
                }
                else
                    System.out.println("Yarışmacı savurdu");
               if (f2.health <=f1.damage) {
                    System.out.println(f1.name + "  adlı yarışmacı kazandı");
                    break;
                }
                else if (f1.health <= f2.damage) {
                    System.out.println(f2.name + " aadlı yarışmacı kazandı");
                    break;
                }

                }
            }






   boolean chanche(Fighter f1, Fighter f2){

        f1.luck=(Math.random()*100);
        f2.luck=(Math.random()*100);

        if(f1.luck==f2.luck)
        {
            System.out.println("Sanş oranı eşit");
            return  chanche(f1,f2);
        }
        else if(f1.luck>f2.luck) {
                    return true;}
        else
            return false;



    }


    }



