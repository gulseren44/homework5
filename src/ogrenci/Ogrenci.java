package ogrenci;

public class Ogrenci {

    private  String ad;
    private  String bolum;
    private  double gano;
    private int girisyili;
    private  int bolumKod;
    private  String ogrenciNo;
    private  String girissırası;
    private int uzatmaYılı;
    private  int dersSayısı;



    public Ogrenci(String ad, String bolum, int girisyili, double gano , int bolumKod, String girissırası,int uzatmaYılı,int dersSayısı) {
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.girisyili = girisyili;
        this.bolumKod = bolumKod;
        this.ogrenciNo = ogrenciNoOlustur(girisyili,bolumKod,girissırası);
        this.girissırası = girissırası;
        this.uzatmaYılı = uzatmaYılı;
        this.dersSayısı = dersSayısı;
    }

    public Ogrenci(String ad, String bolum, String girissırası){
        this.ad = ad;
        this.bolum = bolum;
        this.gano = 0.0;
        this.girisyili = 0;
        this.bolumKod =0;
        this.ogrenciNo =ogrenciNoOlustur(girisyili,bolumKod,girissırası);
        this.girissırası = girissırası;
        this.uzatmaYılı=0;
        this.dersSayısı=0;


    }

    public void setDersSayısı(int dersSayısı) {this.dersSayısı = dersSayısı;
    }
    public int getDersSayısı() {return dersSayısı;
    }
    public int getUzatmaYılı() {return uzatmaYılı;
    }
    public void setUzatmaYılı(int uzatmaYılı) {this.uzatmaYılı = uzatmaYılı;
    }
    public String getOgrenciNo() {return ogrenciNo;
    }
    public void setOgrenciNo(String ogrenciNo) {this.ogrenciNo = ogrenciNo;
    }
    public String getGirissırası() {return girissırası;
    }
    public void setGirissırası(String girissırası) {this.girissırası = girissırası;
    }
    public void setAd(String ad) {this.ad = ad;
    }
    public void setBolum(String bolum) {this.bolum = bolum;
    }
    public void setGano(Double gano) {this.gano = gano;
    }
    public void setGirisyili(int girisyili) {this.girisyili = girisyili;
    }
    public void setBolumKod(int bolumKod) {this.bolumKod = bolumKod;
    }
    public String getAd() {return ad;
    }
    public String getBolum() {return bolum;
    }
    public Double getGano() {return gano;
    }
    public int getGirisyili() {return girisyili;
    }
    public long getBolumKod() {return bolumKod;
    }



    public void ganohesapla(double girisyili){
        if (gano<0 || gano>4)
            throw new IllegalArgumentException("Gano 0 ile 4 arasında olmalıdır!");

    }
    public String ogrenciNoOlustur(int girisyili,int bolumKod,String girissırası){
        return "" + girisyili + bolumKod + girissırası;

    }

    public double harcHesapla(int dersSayısı,double uzatmaYılı ){
        double harc = (dersSayısı*100)+(uzatmaYılı*80);
        return harc;

    }

    public double harcHesapla(int dersSayısı){
        double harcson = dersSayısı*100;
        return harcson;

    }

}
