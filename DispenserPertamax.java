public class DispenserPertamax extends Dispenser implements Struk, Servis {
    private int jumlahTransaksi;

    public DispenserPertamax(String id, double stok) {
        super(id, "Pertamax", 12500, stok);
        this.jumlahTransaksi = 0;
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
            jumlahTransaksi++;
            return true;
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("   Transaksi: " + jumlahTransaksi);
    }

    @Override
    public String cetakStruk(double liter) {
        return "STRUK " + getNamaBBM() + " - " + liter + " L = Rp" + hitungHarga(liter);
    }

    @Override
    public void servis() {
        System.out.println("Dispenser " + getIdDispenser() + " sedang diservis...");
    }
}