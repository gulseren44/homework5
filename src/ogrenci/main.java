package ogrenci;

public class main {

    public static void main(String[] args) {
        Ogrenci[] ogrencis = new Ogrenci[]
                {new Ogrenci(null,null,1973,0.0,104,"001",0,4),
                        new Ogrenci("Gökhan","Bilgisayar Mühendisliği",1985,0.0,104,"001",0,4),
                        new Ogrenci("Ayşe", "Makine Mühendisliği",1985,0.0,104,"001",1,4),
                        new Ogrenci("Elif","Elektrik-Elektronik Mühendisliği",2020,1.98,104,"001",2,8)};


        System.out.println("Öğrenci Bilgileri: ");
        for (int i = 0; i < ogrencis.length ; i++) {
            System.out.println("OGR-" + " " + (i+1) +"  " + ogrencis[i].getAd()+" " + ogrencis[i].getBolum() + " " + ogrencis[i].getOgrenciNo() + " " + ogrencis[i].getGano());
        }

        for (int i = 2; i < ogrencis.length ; i++) {
            System.out.println((i+1) +". öğrencinin öedeyeceği harç: " + ogrencis[i].harcHesapla(ogrencis[i].getDersSayısı(),ogrencis[i].getUzatmaYılı()));

        }
        for (int i = 0; i < ogrencis.length; i++) {

            try{
                ogrencis[i].ganohesapla(ogrencis[i].getGano());
            }
            catch (IllegalArgumentException e) {
                System.out.println("HATA!!! " + (i+1) + ". Öğrenci" + e.getMessage());
            }
        }

    }

}


