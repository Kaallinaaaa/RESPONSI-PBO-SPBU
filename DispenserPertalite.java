public class DispenserPertalite extends Dispenser implements Struk {
    public static final double BATAS_PER_TRANSAKSI = 60;

    private int jumlahTransaksi;

    public DispenserPertalite(String id, double stok) {
        super(id, "Pertalite", 10000, stok);
        this.jumlahTransaksi = 0;
    }

    @Override
    public boolean isiBahanBakar(double liter) {
        if (liter <= 0) {
            System.out.println("Jumlah liter tidak valid.");
            return false;
        } else if (liter > BATAS_PER_TRANSAKSI) {
            System.out.println("Pertalite dibatasi maksimal " + BATAS_PER_TRANSAKSI + " L per transaksi.");
            return false;
        } else if (liter > getStokLiter()) {
            System.out.println("Stok tidak cukup! Sisa: " + getStokLiter() + " L");
            return false;
        } else {
            setStokLiter(getStokLiter() - liter);
            setTotalPenjualan(getTotalPenjualan() + hitungHarga(liter));
            jumlahTransaksi++;
            return true;
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("   Transaksi: " + jumlahTransaksi
                + " | Batas/transaksi: " + BATAS_PER_TRANSAKSI + " L");
    }

    @Override
    public String cetakStruk(double liter) {
        return "STRUK " + getNamaBBM() + " (subsidi) - " + liter + " L = Rp" + hitungHarga(liter);
    }
}