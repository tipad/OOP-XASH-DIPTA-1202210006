package MODUL2_DIPTA;

public class Sampan extends transportasiAir{
    int layar;

    Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    public void informasi(){
        System.out.println("Transportasi air jenis Sampan dengan kursi"+ jumlahKursi +"ditetapkan dengan biaya"+ biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air dengan Jenis Sampan sedang berlayar menggunakan" + layar +"layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air dengan Jenis Sampan sedang berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
    }