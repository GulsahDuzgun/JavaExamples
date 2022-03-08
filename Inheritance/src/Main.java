public class Main {
    public static void main(String[] args) {
        Calisan c1=new Calisan("Ahmet Uslu"," 0504504","selter@gmail.com");
        Memur m1=new Memur("Esma","34567","info@gmail.com","Yazılım","8,6");
        LabAsistan l1= new LabAsistan("Azer Çetin ","2345678","azercalikten12@gmail.com","İnsaat","Öğretim görevlisi","9");

        //l1.lablaraGir();
        //m1.calis();
        //c1.cikis();
        //l1.quizYap();

        //Bir  sınıf başka sınıftan extend edilmişşe kendi içerisinde override edilmiş bir metot varsa o zaman sınıf kendine en yakın metodu kullanır
        Calisan m=new Memur("Tuğba Yurt","234567","tugbayurt23@gmail.com","Yazılım","2");//Calisan sınıfından referans alan ama Memur gibi davranan bir nesne yaratılmış
        //Bu sınıflar new operatörü ile yaratıldıkları sınıfın kendi metotlarını kullanamazlar  en fazla bu sınıfların override ettiği metotları özelleştiirilmiş şekilde kullanılabilirler

        Calisan a=new Akademisyen("Mehmet Kurt","1234567","mehmet34@gamil.com","Enerji","Doc");
        Calisan lA=new LabAsistan("Nazlı Bam","1234567","geri@gmail.com","Mekatronik","Yardımcı doc","21:23");
        Calisan as=new Asistan("Kamil Koç","34567","kamilis@gmail.com","Makina","Araştırma Görevlisi","12;34");

        Calisan []list={m,a,lA,as};
        System.out.println(Calisan.print(list));//Butun alt sınıflar aslında birer Calisan old için Calisan sınıfındaki


    }
}
