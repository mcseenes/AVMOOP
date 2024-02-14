package com.Enes;

public class KitapKirtasiyeMagaza extends Magaza implements ITakip{
  public KitapKirtasiyeMagaza(){

  }
  public KitapKirtasiyeMagaza(int id, String ad, String tur, int kat, int rafSayisi) {
    super(id, ad, tur, kat);
    this.rafSayisi = rafSayisi;
  }

  public int  rafSayisi;
    @Override
    public void mesaiSaati() {
      System.out.println(getClass().getSimpleName()+
              " 11:00 ile 21:00 arasi aciktir");
    }

    @Override
    public void urunSat() {
      System.out.println(getClass().getSimpleName()+" urunu satildi");
    }

    @Override
    public void urunAl() {
      System.out.println(getClass().getSimpleName()+" urunu alindi");
    }

    @Override
    public void stokTakip() {
      System.out.println(getClass().getSimpleName()+" nin stok takibi yapildi");
    }
}
