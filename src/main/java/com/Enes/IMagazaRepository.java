package com.Enes;

public interface IMagazaRepository {
    void magazaEkle(Magaza magaza );
    void magazalariListele();
    void magazaGuncelle(String mAd,String mAdGuncel);
    void magazaBilgisiniGetir (String mAd);
  void   magazaIslemleriYap ();
}
