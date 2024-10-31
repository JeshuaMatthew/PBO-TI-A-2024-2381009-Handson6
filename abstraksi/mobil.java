package abstraksi;

public class mobil extends kendaraan{

    public mobil(String warna) {
        super(warna);
    }


    @Override
    void bergerak() {
        System.out.println("mobil bergerak di jalan");
    }
}
