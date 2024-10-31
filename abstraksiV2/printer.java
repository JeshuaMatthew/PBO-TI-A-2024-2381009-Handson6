package abstraksiV2;

public class printer implements cetak{

    @Override
    public void print() {
        System.out.println("Mencetak Dokumen...");
    }

    @Override
    public void scan() {
        System.out.println("Memindai Dokumen...");
    }
}
