import javax.swing.text.html.StyleSheet;

public class Asistan extends Akademisyen{
    private String ofisSaati;
    public Asistan(String adSoyad,String telefon ,String eposta,String bolum,String unvan,String ofisSaati)
    {
        super(adSoyad,telefon,eposta,bolum,unvan);
        this.ofisSaati=ofisSaati;
    }
    public void quizYap(){
        System.out.println(this.getAdSoyad()+" adlı eleman quiz yaptı");
    }
    public String getOfisSaati(){
        return this.ofisSaati;
    }
    public void  setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    @Override
    public void giris(){
        System.out.println("Asistanlar arka kapıdan giriş yapar");
    }
}
