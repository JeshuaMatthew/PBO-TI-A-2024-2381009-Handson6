package pewarisan;

public class mobil extends kendaraan{
    private int jumlahPintu;
    private String jenisBahanBakar;

    public mobil(String merek, String model, int tahunProduksi, int jumlahPintu, String jenisBahanBakar) {
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void infoMobil(){
        super.infoKendaraan();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
        System.out.println("Jenis Bahan Bakar : " + jenisBahanBakar);
    }
}
