package pewarisan;

public class Main {
    public static void main(String[] args) {
        mobil mobilku = new mobil("toyota", "avanza", 2022, 4, "Bensin");
        motor motorku = new motor("Honda", "CBR250RR", 2023, 250,"Manual");

        mobilku.infoKendaraan();
        mobilku.infoMobil();

        motorku.infoKendaraan();
        motorku.infoMotor();
    }
}
