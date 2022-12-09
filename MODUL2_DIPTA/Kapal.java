package MODUL2_DIPTA;

public class Kapal{
    String mesin;

    Kapal(int jumlahKursi, int biaya, int layar, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }
    public void informasi(){
        System.out.println("Transportasi air jenis Kapal dengan kursi"+ jumlahKursi +"ditetapkan dengan biaya"+ biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air dengan Jenis Kapal sedang berlayar menggunakan mesin" + mesin +"dengan kecepatan tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air dengan Jenis Kapal sedang berlayar menggunakan" + mesin +"dengan kecepatan stabil"+ kecepatan+ "knot");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan Jenis Kapal sedang berlabuh di pantai");
    }
   
}
