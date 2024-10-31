package abstraksi;

public class perahu extends  kendaraan{

    public perahu(String warna) {
        super(warna);
    }

    @Override
    void bergerak() {
        System.out.println("perahu bergerak di air");

    }
}
