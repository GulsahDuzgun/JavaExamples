public class LabAsistan extends Asistan{
    public LabAsistan(String adSoyad,String telefon ,String eposta,String bolum,String unvan ,String ofisSaati){
        super(adSoyad,telefon,eposta,bolum,unvan,ofisSaati);
    }
    public void lablaraGir(){
        System.out.println(getAdSoyad()+" adlı "+ getBolum()+" "+getClass() +" da derse laba girdi");

    }
    public void derslereGir(){
        System.out.println(getAdSoyad()+ " adlı asistan derse girdi");
    }

    @Override
    public void giris(){
        System .out.println("Lab asistanları C kapısında giriş yaptı");
    }
}
