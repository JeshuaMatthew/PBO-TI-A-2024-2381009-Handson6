package abstraksi;

public class Main {
    public static void main(String[] args) {
        perahu perahuMerah = new perahu("Merah");
        mobil mobilMerah = new mobil("Merah");
        perahuMerah.bergerak();
        perahuMerah.info();

        mobilMerah.bergerak();
        mobilMerah.info();
    }
}
