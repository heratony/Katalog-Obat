/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author viaan
 */
public class Obat {
    private static int id_obat;
    private static String nama;
    private static String merk;
    private static String komposisi;
    private static String bentuk;
    private static String exp;
    private static String gambar;
    
    //konstanta 
private static String OBAT_TABLET = "Tablet";
private static String OBAT_KAPSUL = "Kapsul";
private static String OBAT_KAPLET = "Kaplet";
private static String OBAT_PIL = "Pil";
private static String OBAT_PUYER = "Puyer";
private static String OBAT_SIRUP = "Sirup";

public Obat(int id_obat,String nama,String merk, String komposisi,String bentuk,String exp,String gambar){
    Obat.id_obat = id_obat;
    Obat.nama = nama;
    Obat.merk = merk;
    Obat.komposisi = komposisi;
    Obat.bentuk = bentuk;
    Obat.exp = exp;
    Obat.gambar = gambar;
}

    /**
     * @return the id_obat
     */
    public static int getId_obat() {
        return id_obat;
    }

    /**
     * @param aId_obat the id_cari to set
     */
    public static void setId_obat(int aId_obat) {
        id_obat = aId_obat;
    }

    /**
     * @return the nama
     */
    public static String getNama() {
        return nama;
    }

    /**
     * @param aNama the nama to set
     */
    public static void setNama(String aNama) {
        nama = aNama;
    }

    /**
     * @return the merk
     */
    public static String getMerk() {
        return merk;
    }

    /**
     * @param aMerk the merk to set
     */
    public static void setMerk(String aMerk) {
        merk = aMerk;
    }

    /**
     * @return the komposisi
     */
    public static String getKomposisi() {
        return komposisi;
    }

    /**
     * @param aKomposisi the komposisi to set
     */
    public static void setKomposisi(String aKomposisi) {
        komposisi = aKomposisi;
    }

    /**
     * @return the bentuk
     */
    public static String getBentuk() {
        return bentuk;
    }

    /**
     * @param aBentuk the bentuk to set
     */
    public static void setBentuk(String aBentuk) {
        bentuk = aBentuk;
    }

    /**
     * @return the exp
     */
    public static String getExp() {
        return exp;
    }

    /**
     * @param aExp the exp to set
     */
    public static void setExp(String aExp) {
        exp = aExp;
    }

    /**
     * @return the gambar
     */
    public static String getGambar() {
        return gambar;
    }

    /**
     * @param aGambar the gambar to set
     */
    public static void setGambar(String aGambar) {
        gambar = aGambar;
    }

    /**
     * @return the OBAT_TABLET
     */
    public static String getOBAT_TABLET() {
        return OBAT_TABLET;
    }

    /**
     * @param aOBAT_TABLET the OBAT_TABLET to set
     */
    public static void setOBAT_TABLET(String aOBAT_TABLET) {
        OBAT_TABLET = aOBAT_TABLET;
    }

    /**
     * @return the OBAT_KAPSUL
     */
    public static String getOBAT_KAPSUL() {
        return OBAT_KAPSUL;
    }

    /**
     * @param aOBAT_KAPSUL the OBAT_KAPSUL to set
     */
    public static void setOBAT_KAPSUL(String aOBAT_KAPSUL) {
        OBAT_KAPSUL = aOBAT_KAPSUL;
    }

    /**
     * @return the OBAT_KAPLET
     */
    public static String getOBAT_KAPLET() {
        return OBAT_KAPLET;
    }

    /**
     * @param aOBAT_KAPLET the OBAT_KAPLET to set
     */
    public static void setOBAT_KAPLET(String aOBAT_KAPLET) {
        OBAT_KAPLET = aOBAT_KAPLET;
    }

    /**
     * @return the OBAT_PIL
     */
    public static String getOBAT_PIL() {
        return OBAT_PIL;
    }

    /**
     * @param aOBAT_PIL the OBAT_PIL to set
     */
    public static void setOBAT_PIL(String aOBAT_PIL) {
        OBAT_PIL = aOBAT_PIL;
    }

    /**
     * @return the OBAT_PUYER
     */
    public static String getOBAT_PUYER() {
        return OBAT_PUYER;
    }

    /**
     * @param aOBAT_PUYER the OBAT_PUYER to set
     */
    public static void setOBAT_PUYER(String aOBAT_PUYER) {
        OBAT_PUYER = aOBAT_PUYER;
    }

    /**
     * @return the OBAT_SIRUP
     */
    public static String getOBAT_SIRUP() {
        return OBAT_SIRUP;
    }

    /**
     * @param aOBAT_SIRUP the OBAT_SIRUP to set
     */
    public static void setOBAT_SIRUP(String aOBAT_SIRUP) {
        OBAT_SIRUP = aOBAT_SIRUP;
    }



    
}


