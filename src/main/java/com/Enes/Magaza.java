package com.Enes;

public abstract class Magaza extends AVMManager implements ICommonBehavior{
    public int id;
    public String ad;
    public String tur;
    public int kat;
    public Magaza(){

    };

    public Magaza(int id, String ad, String tur, int kat) {
        this.id = id;
        this.ad = ad;
        this.tur = tur;
        this.kat = kat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getKat() {
        return kat;
    }

    public void setKat(int kat) {
        this.kat = kat;
    }

    public void veriAl()
    {

        System.out.println("VERI AL");
    }



}
