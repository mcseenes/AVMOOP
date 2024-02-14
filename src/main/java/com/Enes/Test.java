package com.Enes;


public class Test {
    public static void main(String[] args) {
        AVMManager avmManager=new AVMManager();
        MagazaController magazaController=new MagazaController();
        Magaza elektronikMagaza=new ElektronikMagaza(1,"TEKNOSA","ELEKTRONIK",1);
        Magaza giyimMagaza=new GiyimMagaza(2,"LCWAIKIKI","GIYIM",2);
        Magaza kitapKirtasiyeMagaza=new KitapKirtasiyeMagaza(3,"D&R","KIRTASIYE",2,5);
        Magaza yiyecekMagaza=new YiyecekMagaza(4,"MCDONALDS","YIYECEK",4);
        avmManager.magazaEkle(elektronikMagaza);
        avmManager.magazaEkle(giyimMagaza);
        magazaController.magazaEkle(1,"SAMSUNG","ELEKTRONIK",1);
        magazaController.magazaEkle(1,"TEKNOSA","ELEKTRONIK",2);
        magazaController.magazaEkle(1,"HP","ELEKTRONIK",3);
        magazaController.magazaEkle(1,"CASPER","ELEKTRONIK",4);
//        avmManager.magazaGuncelle("CASPER","VESTEL");
//        avmManager.magazaBilgisiniGetir("TEKNOSA");
//       avmManager.magazalariListele();
        avmManager.magazaIslemleriYap();


    }
}
