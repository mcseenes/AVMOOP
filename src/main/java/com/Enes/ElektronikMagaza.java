package com.Enes;

public class ElektronikMagaza extends Magaza {
  public int  teknikServisSayisi;
  boolean urunMontajiVarMi;
public ElektronikMagaza(){

}

  public int getTeknikServisSayisi() {
    return teknikServisSayisi;
  }

  public void setTeknikServisSayisi(int teknikServisSayisi) {
    this.teknikServisSayisi = teknikServisSayisi;
  }

  public boolean isUrunMontajiVarMi() {
    return urunMontajiVarMi;
  }

  public void setUrunMontajiVarMi(boolean urunMontajiVarMi) {
    this.urunMontajiVarMi = urunMontajiVarMi;
  }

  public ElektronikMagaza(int id, String ad, String tur, int kat) {
    super(id, ad, tur, kat);
  }


  @Override
  public void mesaiSaati() {
    System.out.println(getClass().getSimpleName() +
            " 12:00 ile 21:00 arasi aciktir");
  }

  @Override
  public void urunSat() {
    System.out.println(getClass().getSimpleName()
            + " urunu satildi");
  }

  @Override
  public void urunAl() {
    System.out.println(getClass().getSimpleName()
            + " urunu alindi");
  }

  @Override
  public void stokTakip() {
    System.out.println(getClass().getSimpleName()
            + " nin stok takibi satildi");
  }
}