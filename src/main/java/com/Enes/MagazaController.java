package com.Enes;

public class MagazaController  {
    private MagazaService service;

    public MagazaController() {

        service = new MagazaService();
    };

    public void magazaEkle(int id, String ad, String tur, int kat) {
        Magaza magaza = new Magaza(id, ad, tur, kat) {
            @Override
            public void mesaiSaati() {
            }

            @Override
            public void urunSat() {

            }

            @Override
            public void urunAl() {

            }
            @Override
            public void stokTakip() {

            }
        };
        service.magazalariListele(magaza);
    }


}
