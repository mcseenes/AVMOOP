package com.Enes;

public class MagazaService implements IMagazaService {
    private IMagazaRepository avmManager;
    public MagazaService(){
        avmManager= (IMagazaRepository) new AVMManager();

    }

    public void magazalariListele(Magaza magaza) {

        avmManager.magazaEkle(magaza);


    }
}
