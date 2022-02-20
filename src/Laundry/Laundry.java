package Laundry;

public class Laundry {

    public static void main(String[] args) {
        JenisLaundry laundry = new JenisLaundry();
        Laporan laporan = new Laporan();
        Client client = new Client();
        Petugas petugas = new Petugas();
        Transaksi transaksi = new Transaksi();
        
        laporan.laporan(petugas);
        laporan.laporan(laundry);
        laporan.laporan(client);
        
        transaksi.prosesTransaksi(client, transaksi, laundry);
        laporan.laporan(client);
        laporan.laporan(transaksi, laundry);
    }

}
