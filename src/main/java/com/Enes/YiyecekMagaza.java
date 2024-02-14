package com.Enes;

public class YiyecekMagaza extends Magaza implements ITakip {
    public String menu;
    public int masasayisi;

    public YiyecekMagaza() {

    }

    public YiyecekMagaza(int id, String ad, String tur, int kat) {

        super(id, ad, tur, kat);
    }

    @Override
    public void mesaiSaati() {
        System.out.println(getClass().getSimpleName() +
                " 10:00 ile 22:00 arasi aciktir");
    }

    @Override
    public void urunSat() {
        System.out.println(getClass().getSimpleName() + " urunu satildi");
    }

    @Override
    public void urunAl() {
        System.out.println(getClass().getSimpleName() + " urunu alindi");
    }

    @Override
    public void stokTakip() {
        System.out.println(getClass().getSimpleName() + " nin stok takibi satildi");
    }
}
