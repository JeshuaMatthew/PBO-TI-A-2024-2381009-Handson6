package pewarisan;

public class motor extends kendaraan{
    private int kapasistasMesin;
    private String jenisTransmisi;

    public motor(String merek, String model, int tahunProduksi, int kapasistasMesin, String jenisTransmisi) {
        super(merek, model, tahunProduksi);
        this.kapasistasMesin = kapasistasMesin;
        this.jenisTransmisi = jenisTransmisi;
    }

    void infoMotor(){
        super.infoKendaraan();
        System.out.println("Kapasitas Mesin : " + kapasistasMesin);
        System.out.println("Jenis Transmisi : " + jenisTransmisi);

    }
}
