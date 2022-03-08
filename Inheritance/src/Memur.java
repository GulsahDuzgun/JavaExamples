public class Memur extends Calisan{
    private String departman;
    private String mesai;

    public Memur(String adSoyad,String telefon ,String eposta,String departman,String mesai){
        super(adSoyad,telefon,eposta) ;
        this.departman=departman;
        this.mesai=mesai;
    }
    public void calis(){
        System.out.println(getAdSoyad()+ " adlı eleman çalişmaya başladı");
    }

    public void setDepartman(String departman){
        this.departman=departman;
    }
    public  String getDepartman(){
        return  this.departman;
    }
    public void setMesai(String mesai){
        this.mesai=mesai;
    }
    public String getMesai(){
        return this.mesai;
    }

    @Override
    public void giris(){//override işlemi ile fonksiyon ezilmiş
        System.out.println("M kapısından giriş yapıldı");
    }




}
