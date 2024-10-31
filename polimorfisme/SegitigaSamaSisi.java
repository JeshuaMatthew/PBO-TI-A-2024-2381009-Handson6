package polimorfisme;

public class SegitigaSamaSisi  extends BangunDatar{
    private double alas;
    private double tinggi;

    public SegitigaSamaSisi(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return alas * tinggi * 0.5;
    }

    @Override
    public double hitungKeliling() {
        return 3 * alas;
    }
}
