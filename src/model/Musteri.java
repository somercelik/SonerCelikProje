package model;
// Generated 14.May.2018 14:45:21 by Hibernate Tools 4.3.1



/**
 * Musteri generated by hbm2java
 */
public class Musteri  implements java.io.Serializable {


     private Integer musteriid;
     private String ad;
     private String soyad;
     private String adres;
     private String telno;

    public Musteri() {
    }

    public Musteri(String ad, String soyad, String adres, String telno) {
       this.ad = ad;
       this.soyad = soyad;
       this.adres = adres;
       this.telno = telno;
    }
   
    public Integer getMusteriid() {
        return this.musteriid;
    }
    
    public void setMusteriid(Integer musteriid) {
        this.musteriid = musteriid;
    }
    public String getAd() {
        return this.ad;
    }
    
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return this.soyad;
    }
    
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public String getAdres() {
        return this.adres;
    }
    
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public String getTelno() {
        return this.telno;
    }
    
    public void setTelno(String telno) {
        this.telno = telno;
    }




}


