package contohkelaspertama;

public class Main {
    public static void main(String[] args) {
        mobil mobilAvanza = new mobil("pink", "toyota",180);
        mobilAvanza.tampilkanInfo();
        mobilAvanza.berhenti();
        mobilAvanza.berjalan();
    }
}
