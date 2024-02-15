
package com.Enes;
import utility.Database;

import java.util.ArrayList;
import java.util.Scanner;

public  class AVMManager extends Database implements IMagazaRepository {
  public   boolean islem;

    @Override
    public void magazaEkle(Magaza magaza) {
        Database.magazaListesi.add(magaza);
        Magaza elektronikMagaza = new ElektronikMagaza();
        Database.magazaListesi.add(elektronikMagaza);
        Magaza kitapKirtasiyeMagaza = new KitapKirtasiyeMagaza();
        Database.magazaListesi.add(kitapKirtasiyeMagaza);
        Magaza yiyecekMagaza = new YiyecekMagaza();
        Database.magazaListesi.add(yiyecekMagaza);
        Magaza giyimMagaza = new GiyimMagaza();
        Database.magazaListesi.add(giyimMagaza);
    }

    public void magazalariListele() {
        for (int i = 0; i < Database.magazaListesi.size(); i++) {
            if (Database.magazaListesi.get(i).getAd() != null) {
                System.out.println("MAGAZA LISTESİ:" + Database.magazaListesi.get(i).getAd());

            }
        }

    }

    @Override
    public void magazaGuncelle(String mAd,String mAdGuncel) {

        for (int i = 0; i < Database.magazaListesi.size(); i++) {
            {
                if (Database.magazaListesi.get(i).getAd()!=null)
                {
                if (Database.magazaListesi.get(i).getAd().equalsIgnoreCase(mAd)) {
                    Database.magazaListesi.get(i).setAd(mAdGuncel);
                    System.out.println("MAGAZA KATI:" + Database.magazaListesi.get(i).getKat());
                    System.out.println("MAGAZA ISMI:" + Database.magazaListesi.get(i).getAd());
                }

                }
            }
        }
    }

    @Override
    public void magazaBilgisiniGetir(String mAd) {
        for (int i = 0; i < Database.magazaListesi.size(); i++) {
            if (Database.magazaListesi.get(i).getAd() != null) {
                if (Database.magazaListesi.get(i).getAd().equalsIgnoreCase(mAd)) {
                    System.out.println("MAGAZA AD:"+Database.magazaListesi.get(i).getAd());
                    System.out.println("MAGAZA ID:"+Database.magazaListesi.get(i).getId());
                    System.out.println("MAGAZA TUR:"+Database.magazaListesi.get(i).getTur());
                    System.out.println("MAGAZA KAT:"+Database.magazaListesi.get(i).getKat());
                    break;
                }
            }

        }
    }

    @Override
    public void magazaIslemleriYap() {
        ElektronikMagaza elektronikMagaza=new ElektronikMagaza();
        GiyimMagaza giyimMagaza=new GiyimMagaza();
        KitapKirtasiyeMagaza kitapKirtasiyeMagaza=new KitapKirtasiyeMagaza();
        YiyecekMagaza yiyecekMagaza=new YiyecekMagaza();
    do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                MAGAZA TURUNU SECINIZ
                1-ELEKTRONIK
                2-GIYIM
                3-YIYECEK
                4-KITAP KIRTASIYE
                0-CIKIS
                """);
        int secim= scanner.nextInt();
        switch (secim)
        {
            case 0:
                System.out.println("PROGRAM SONLANDIRILDI");break;
            case 1:
                System.out.println("""
                        YAPMAK ISTEDIGINIZ İSLEMI SECINIZ
                        1-MESAI SAATI
                        2-URUN SAT
                        3-URUN AL
                        4-STOK TAKIP
                        0-CIKIS
                        """);
            {
                int secim2= scanner.nextInt();
                switch (secim2){
                    case 1:elektronikMagaza.mesaiSaati();tercih();break;
                    case 2:elektronikMagaza.urunSat();tercih();break;
                    case 3:elektronikMagaza.urunAl();tercih();break;
                    case 4:elektronikMagaza.stokTakip();tercih();break;
                    case 0:
                        System.out.println("PROGRAM SONLANDIRILDI");break;
                    default:
                        System.err.println("LUTFEN DOGRU DEGER GIRINIZ");break;
                 }
                break;
            }
            case 2: System.out.println("""
                        YAPMAK ISTEDIGINIZ İSLEMI SECINIZ
                        1-MESAI SAATI
                        2-URUN SAT
                        3-URUN AL
                        4-STOK TAKIP
                        0-CIKIS
                        """);
            {
                int secim2 = scanner.nextInt();
                switch (secim2) {
                    case 1: giyimMagaza.mesaiSaati();tercih();break;
                    case 2: giyimMagaza.urunSat();tercih();break;
                    case 3: giyimMagaza.urunAl();tercih();break;
                    case 4: giyimMagaza.stokTakip();tercih();break;
                    case 0:
                        System.out.println("PROGRAM SONLANDIRILDI");break;

                    default:
                        System.err.println("LUTFEN DOGRU DEGER GIRINIZ");break;
                }
                break;
            }
            case 3:System.out.println("""
                        YAPMAK ISTEDIGINIZ İSLEMI SECINIZ
                        1-MESAI SAATI
                        2-URUN SAT
                        3-URUN AL
                        4-STOK TAKIP
                        0-CIKIS
                        """);
            {
                int secim2 = scanner.nextInt();
                switch (secim2) {

                    case 1: yiyecekMagaza.mesaiSaati();tercih();break;
                    case 2: yiyecekMagaza.urunSat();tercih();break;
                    case 3: yiyecekMagaza.urunAl();tercih();break;
                    case 4: yiyecekMagaza.stokTakip();tercih();break;
                    case 0:System.out.println("PROGRAM SONLANDIRILDI");break;
                    default:
                        System.err.println("LUTFEN DOGRU DEGER GIRINIZ");break;

                }
               break;

            }
            case 4:System.out.println("""
                        YAPMAK ISTEDIGINIZ İSLEMI SECINIZ
                        1-MESAI SAATI
                        2-URUN SAT
                        3-URUN AL
                        4-STOK TAKIP
                        0-CIKIS
                        """);
            {
                int secim2 = scanner.nextInt();
                switch (secim2) {

                    case 1: kitapKirtasiyeMagaza.mesaiSaati();tercih();break;
                    case 2: kitapKirtasiyeMagaza.urunSat();tercih();break;
                    case 3: kitapKirtasiyeMagaza.urunAl();tercih();break;
                    case 4: kitapKirtasiyeMagaza.stokTakip();tercih();break;
                    case 0:
                        System.out.println("PROGRAM SONLANDIRILDI");break;
                    default:
                        System.err.println("LUTFEN DOGRU DEGER GIRINIZ");
                        break;

                }
                break;
            }
            default:
                System.err.println("LUTFEN DOGRU DEGER GIRINIZ");break;
        }
    }while (islem);

    }
    public  void tercih(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("BASKA ISLEM YAPMAK ISTER MISINIZ:Y/N");
        String karar=scanner.nextLine();
        if (karar.toUpperCase().equalsIgnoreCase("Y")) {
            islem = true;
        }
        else if (karar.toUpperCase().equalsIgnoreCase("N"))
        {
            islem=false;
            System.out.println("IYI GUNLER");
        }
        else
            System.out.println("LUTFEN Y VEYA N YE BASINIZ");


    }
}




