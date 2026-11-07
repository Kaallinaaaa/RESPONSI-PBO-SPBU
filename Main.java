public class Main {
    public static void main(String[] args) {
        System.out.println("Konstanta KAPASITAS_MAKS: " + Dispenser.KAPASITAS_MAKS + " L");
        System.out.println();

        Dispenser[] daftar = {
                new DispenserPertamax("D-01", 500),
                new DispenserPertalite("D-02", 300),
                new DispenserSolar("D-03", 150)
        };

        System.out.println("Informasi dispenser:");
        for (Dispenser d : daftar) {
            d.tampilkanInfo();
        }

        System.out.println();
        System.out.println("Pengisian bahan bakar 70 L:");
        for (Dispenser d : daftar) {
            System.out.println("- " + d.getNamaBBM() + ": " + d.isiBahanBakar(70));
        }

        System.out.println();
        Struk struk = new DispenserPertamax("D-04", 200);
        System.out.println(struk.cetakStruk(10));

        Servis servis = new DispenserPertamax("D-05", 100);
        servis.servis();
    }
}
