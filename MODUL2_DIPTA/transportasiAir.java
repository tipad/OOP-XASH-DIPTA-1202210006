package MODUL2_DIPTA;

public class transportasiAir {
    int jumlahKursi;
    int biaya;

    transportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya; 
    }
    public void informasi(){
        System.out.println("Transportasi Air Jenis yang tidak diketahui dengan kursi berjumlah"+ jumlahKursi + "ditetapkan dengan biaya sebesar Rp."+biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi Air dengan Jenis yang tidak diketahui sedang berlayar");
    }

    public void berlabuh(){
        System.out.println("Transportasi Air dengan Jenis yang tidak diketahui berlabuh di pantai");
    }
}
