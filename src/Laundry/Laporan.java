package Laundry;

public class Laporan {

    public void laporan(JenisLaundry jenisLaundry) {
        int x = jenisLaundry.getJmlLaundry();

        System.out.println();
        System.out.println("========= Tabel Jenis Laundry =========");
        System.out.println();
        System.out.println("ID \tNama Jenis Laundry \tDurasi(hr) \tHarga/kg");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + jenisLaundry.getJenisLaundry(i) + "\t\t"
                    + jenisLaundry.getDurasi(i) + "hr" + "\t" + jenisLaundry.getHarga(i) + "/kg");
        }
    }

    public void laporan(Client client) {
        int x = client.getJmlClient();

        System.out.println();
        System.out.println("========= Tabel Client =========");
        System.out.println();
        System.out.println("ID \tNama \tAlamat \t\tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + client.getNama(i) + "\t"
                    + client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t"
                    + client.getSaldo(i));
        }
    }
    
    public void laporan(Petugas petugas) {
        int x = petugas.getJmlPetugas();
       String jabatan = null;
        System.out.println();
        System.out.println("========= Tabel Petugas =========");
        System.out.println();
        System.out.println("ID \tNama \tAlamat \t\tTelepon \tJabatan");
        for (int i = 0; i < x; i++) {
             if(petugas.getJabatan(i) == 0){
                 jabatan = "manager";
             }else if(petugas.getJabatan(i) == 1){
                 jabatan = "asisten";
             }else if(petugas.getJabatan(i) == 2){
                 jabatan = "karyawan";
             }
            System.out.println(i + ".\t" + petugas.getNama(i) + "\t"
                    + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i) + "\t"
                    + jabatan);
        }
    }

    public void laporan(Transaksi transaksi, JenisLaundry jenisLaundry) {
        int x = transaksi.getJmlTransaksi();

        System.out.println();
        System.out.println("========= Histori Transaksi Laundry =========");
        System.out.println();
        System.out.println("Nama Jenis Laundry\tJumlah(kg) \tHarga/kg \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i) * jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i));
            total += jumlah;

            System.out.println(jenisLaundry.getJenisLaundry(transaksi.getIdJenisLaundry(i)) + "\t\t"
                    + transaksi.getBanyaknya(i) + "kg" + "\t" + "\t" + jenisLaundry.getHarga(transaksi.getIdJenisLaundry(i)) + "/kg" + "\t\t" 
                    + jumlah);
        }
        System.out.println("Total Omset =" + total);
    }
}
