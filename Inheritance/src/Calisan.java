public class Calisan
{
    private String adSoyad;
    private String telefon;
    private String eposta;

    public Calisan(){};
    public Calisan(String adSoyad, String telefon, String eposta){
        this.adSoyad=adSoyad;
        this.eposta=eposta;
        this.telefon=telefon;
    }

    public void giris(){
        System.out.println(this.adSoyad+" adlı personel giris yaptı");
    }
    public void cikis(){
        System.out.println(this.adSoyad+" adlı personel çıkış yaptı");
    }
    public void  yemekhane(){
        System.out.println(this.adSoyad+" adlı personel yemekhane hakkını kullnadı");
    }

    public void  setadSoyad(String adSoyad){
        this.adSoyad=adSoyad;
    }
    public String getAdSoyad(){
        return this.adSoyad;
    }
    public void setTelefonNo(String telefon){
        this.telefon=telefon;
    }
    public String getTelefonNo(){
        return this.telefon;
    }
    public void setEposta(String eposta){
        this.eposta=eposta;
    }
    public String getEposta(){
        return this.eposta;
    }
    public void giris(String girisSaati){//Overloading parametre listesi farklı metotoların oluşturulması
        System.out.println(girisSaati+" saatinde okula giriş yapıldı");
    }
    public static String a="";
    public static String print(Calisan []all){

        for(Calisan c:all){
            a+=c.adSoyad+" ";


        }
        return a;
    }


}
