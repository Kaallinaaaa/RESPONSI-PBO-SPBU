public abstract class Dispenser {
    public static final double KAPASITAS_MAKS = 1000;

    private final String idDispenser;
    private String namaBBM;
    private double hargaPerLiter;
    private double stokLiter;
    private double totalPenjualan;

    public Dispenser(String idDispenser, String namaBBM, double hargaPerLiter) {
        this(idDispenser, namaBBM, hargaPerLiter, KAPASITAS_MAKS);
    }

    public Dispenser(String idDispenser, String namaBBM, double hargaPerLiter, double stokLiter) {
        this.idDispenser = idDispenser;
        this.namaBBM = namaBBM;
        this.hargaPerLiter = hargaPerLiter;
        this.stokLiter = stokLiter;
        this.totalPenjualan = 0;
    }

    public double hitungHarga(double liter) {
        return liter * hargaPerLiter;
    }

    public void tampilkanInfo() {
        System.out.println("[" + idDispenser + "] " + namaBBM
                + " | Rp" + hargaPerLiter + "/L | Stok: " + stokLiter + " L");
    }

    public abstract boolean isiBahanBakar(double liter);

    public String getIdDispenser() { return idDispenser; }
    public String getNamaBBM() { return namaBBM; }
    public void setNamaBBM(String namaBBM) { this.namaBBM = namaBBM; }
    public double getHargaPerLiter() { return hargaPerLiter; }
    public void setHargaPerLiter(double hargaPerLiter) { this.hargaPerLiter = hargaPerLiter; }
    public double getStokLiter() { return stokLiter; }
    public void setStokLiter(double stokLiter) { this.stokLiter = stokLiter; }
    public double getTotalPenjualan() { return totalPenjualan; }
    public void setTotalPenjualan(double totalPenjualan) { this.totalPenjualan = totalPenjualan; }
}