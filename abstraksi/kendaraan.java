package abstraksi;

abstract class kendaraan {
    String warna;

    public kendaraan(String warna) {
        this.warna = warna;
    }

    abstract void  bergerak();

    void info(){
        System.out.println("Warna kendaraan : "+ warna);
    }
}
