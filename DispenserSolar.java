public class DispenserSolar extends Dispenser implements Struk {
    public static final double BATAS_STOK_MENIPIS = 100;

    private boolean stokMenipis;

    public DispenserSolar(String id, double stok) {
        super(id, "Solar", 6800, stok);
        this.stokMenipis = stok < BATAS_STOK_MENIPIS;
    }

    @Override
    public boolean isiBahanBakar(double liter) {
        if (liter <= 0) {
            System.out.println("Jumlah liter tidak valid.");
            return false;
        } else if (liter > getStokLiter()) {
            System.out.println("Stok tidak cukup! Sisa: " + getStokLiter() + " L");
            return false;
        } else {
            setStokLiter(getStokLiter() - liter);
            setTotalPenjualan(getTotalPenjualan() + hitungHarga(liter));
            if (getStokLiter() < BATAS_STOK_MENIPIS) {
                stokMenipis = true;
                System.out.println("PERINGATAN: stok Solar menipis!");
            }
            return true;
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("   Status stok: " + (stokMenipis ? "MENIPIS" : "AMAN"));
    }

    @Override
    public String cetakStruk(double liter) {
        return "STRUK " + getNamaBBM() + " - " + liter + " L = Rp" + hitungHarga(liter);
    }
}