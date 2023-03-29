package posttest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static ArrayList <Pulsa> dataPulsa = new ArrayList <>();
    private static ArrayList <Kuota> dataKuota = new ArrayList <>();
    private static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        boolean lanjutkan = true;
        
        while (lanjutkan) {
            System.out.println(" VOUCHER KUOTA ADITYA CELL");
            System.out.println("==========================");
            System.out.println("|  MASUKAN ANGKA PILIHAN |");
            System.out.println("==========================");
            System.out.println("| 1. Tambah Voucher      |");
            System.out.println("| 2. Tampilkan Voucher   |");
            System.out.println("| 3. Hapus Voucher       |");
            System.out.println("| 4. Perbarui Voucher    |");
            System.out.println("| 5. Keluar              |");
            System.out.println("==========================");

            System.out.print("\nPilih menu (1-5)    : ");
            String pilihan = input.readLine();

            switch (pilihan) {
                case "1":
                    System.out.println("\n----- Menu Tambah Voucher -----");
                    System.out.println("1. Tambah Voucher Pulsa ");
                    System.out.println("2. Tambah Voucher Kuota ");
                    System.out.print("Pilih menu  : ");
                    int pilihTambah = Integer.parseInt(input.readLine());
                    switch (pilihTambah) {
                        case 1 :
                            tambahPulsa();
                            break;
                        case 2 :
                            tambahKuota();
                            break;
                    }
                    break;
                case "2":
                    System.out.println("\n----- Menu Tampilkan Data -----");
                    System.out.println("1. Tampilkan Data Pulsa ");
                    System.out.println("2. Tampilkan data Kuota ");
                    System.out.print("Pilih menu    : ");
                    int pilihTampil = Integer.parseInt(input.readLine());
                    switch (pilihTampil) {
                        case 1:
                            tampilkanPulsa();
                            break;
                        case 2:
                            tampilkanKuota();
                            break;
                    }        
                    break;
                case "3":
                    System.out.println("\n----- Menu Hapus Data -----");
                    System.out.println("1. Hapus Data Pulsa ");
                    System.out.println("2. Hapus data Kuota ");
                    System.out.print("Pilih Menu    : ");
                    int pilihHapus = Integer.parseInt(input.readLine());
                    switch (pilihHapus) {
                        case 1:
                            hapusPulsa();
                            break;
                        case 2:
                            hapusKuota();
                            break;
                    }        
                    break;
                case "4":
                    System.out.println("\n----- Menu Perbarui Data -----");
                    System.out.println("1. Perbarui Data Pulsa ");
                    System.out.println("2. Perbarui data Kuota ");
                    System.out.print("Pilih menu    : ");
                    int pilihUbah = Integer.parseInt(input.readLine());
                    switch (pilihUbah) {
                        case 1:
                            ubahPulsa();
                            break;
                        case 2:
                            ubahKuota();
                            break;
                    }        
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.err.println("Pilihan tidak tersedia \nSilahkan Input angka 1-5 ");
            }
            System.out.print("Apakah Anda Ingin Melanjutkan (y/n)? : ");
            pilihan = input.readLine();
            lanjutkan = pilihan.equalsIgnoreCase("y");
        }
    }

    
    
    
    
    //---------- TAMBAH DATA ----------
    private static void tambahPulsa() throws IOException {
        System.out.print("Nama Provider Pulsa  : ");
        String provider = input.readLine();
        
        System.out.print("Nomor Telpon         : ");
        int notujuan = Integer.parseInt(input.readLine());
        
        System.out.print("Voucher              : ");
        String voucher = input.readLine();
        
        System.out.print("Paket                 : ");
        String paket = input.readLine();
        
        System.out.print("Masa                  : ");
        String masa = input.readLine();

        System.out.print("Kode                  : ");
        int kode = Integer.parseInt(input.readLine());
        
        System.out.print("Harga             : Rp. ");
        int harga = Integer.parseInt(input.readLine());
        
        Pulsa isi = new Pulsa (provider, notujuan, voucher, paket, masa, kode, harga);
        dataPulsa.add(isi);

        System.out.println("\n Data berhasil ditambahkan.");
    }
    
    
    
    private static void tambahKuota() throws IOException {
        System.out.print("Nama provider           : ");
        String provider = input.readLine();
        
        System.out.print("Nama Wilayah         : ");
        String wilayah = input.readLine();
                                            
        System.out.print("Voucher              : ");
        String voucher = input.readLine();
        
        System.out.print("Paket                 : ");
        String paket = input.readLine();
        
        System.out.print("Masa                  : ");
        String masa = input.readLine();

        System.out.print("Kode                  : ");
        int kode = Integer.parseInt(input.readLine());
       
        System.out.print("Harga             : Rp. ");
        int harga = Integer.parseInt(input.readLine());
        
        Kuota Voucher = new Kuota( provider, wilayah, voucher, paket, masa, kode, harga);
        dataKuota.add(Voucher);

        System.out.println("\n Data berhasil ditambahkan.");
    }

    
    
    
    
    //---------- MENAMPILKAN DATA ----------
    private static void tampilkanPulsa() {
        System.out.println("\n========== DATA VOUCHER PULSA ===========");

        if (dataPulsa.size() == 0) {
            System.out.println("Data Pulsa Kosong");
        } else {
            for (int i = 0; i < dataPulsa.size(); i += 1) {
                System.out.println("Nomor              " + (i + 1));
                System.out.println("Nama Provider     : " + dataPulsa.get(i).getProvider());
                System.out.println("Voucher             : " + dataPulsa.get(i).getVoucher());
                System.out.println("Paket             : " + dataPulsa.get(i).getPaket());
                System.out.println("Masa            : " + dataPulsa.get(i).getMasa());
                System.out.println("Kode            : " + dataPulsa.get(i).getKode());
                System.out.println("Harga            : Rp. " + dataPulsa.get(i).getHarga());
                System.out.println("Wilayah    : " + dataKuota.get(i).getWilayah());
                System.out.println("========================================================");
            }
        }
    }

    
    
    private static void tampilkanKuota() {
        System.out.println("\n--------- DATA VOUCHER KUOTA ----------");

        if (dataKuota.size() == 0) {
            System.out.println("Data Kuota Kosong");
        } else {
            for (int i = 0; i < dataKuota.size(); i += 1) {
                System.out.println("Nomor              " + (i + 1));
                System.out.println("Nama Provider     : " + dataKuota.get(i).getProvider());
                System.out.println("Wilayah         : " + dataKuota.get(i).getWilayah());
                System.out.println("Voucher             : " + dataKuota.get(i).getVoucher());
                System.out.println("Paket             : " + dataKuota.get(i).getPaket());
                System.out.println("Masa            : " + dataKuota.get(i).getMasa());
                System.out.println("Kode            : " + dataKuota.get(i).getKode());
                System.out.println("Harga            : Rp.  " + dataKuota.get(i).getHarga());
                System.out.println("========================================================");
            }
        }
    }
    
    
    
    
    

    //---------- UPDATE DATA -----------
    
    private static void ubahPulsa() throws IOException {
        tampilkanPulsa();

        if (dataPulsa.size() == 0) {
            return;
        }

        System.out.print("\nPilih nomor data yang akan diubah: ");
        int nomor = Integer.parseInt(input.readLine());

        if (nomor < 1 || nomor > dataPulsa.size()) {
            System.out.println("Nomor data tidak valid.");
            return;
        }

        Pulsa isi = dataPulsa.get(nomor-1);
        
        System.out.print("Nama Provider (" + isi.getProvider() + ") :");
        String provider = input.readLine();
        
        System.out.print("Nomor Tujuan (" + isi.getNotujuan() + ")   :");
        int notujuan = Integer.parseInt(input.readLine());
        
        System.out.print("Voucher (" + isi.getVoucher() + ")         : ");
        String voucher = input.readLine();
        
        System.out.print("Paket (" + isi.getPaket() + ")         : ");
        String paket = input.readLine();
        
        System.out.print("Kode (" + isi.getKode() + ")       : ");
        int kode = Integer.parseInt(input.readLine());
        
        System.out.print("Masa (" + isi.getMasa() + ")       : ");
        String masa = input.readLine();
        
        System.out.print("Harga (" + isi.getHarga() + ")       : Rp. ");
        int harga = Integer.parseInt(input.readLine());
        
        isi.setProvider(provider);
        isi.setNotujuan(notujuan);
        isi.setVoucher(voucher);
        isi.setpaket(paket);
        isi.setKode(kode);
        isi.setMasa(masa);
        isi.setHarga(harga);

        System.out.println("\nData voucher berhasil diubah.");
    }
    
    
    
    private static void ubahKuota() throws IOException {
        tampilkanKuota();

        if (dataKuota.size() == 0) {
            return;
        }

        System.out.print("\nPilih nomor data yang akan diubah: ");
        int nomor = Integer.parseInt(input.readLine());

        if (nomor < 1 || nomor > dataKuota.size()) {
            System.out.println("Nomor data tidak valid.");
            return;
        }

        Kuota voucher = dataKuota.get(nomor-1);
        
        System.out.print("Nama Provider (" + voucher.getProvider() + ")    :");
        String provider = input.readLine();
        
        System.out.print("Wilayah (" + voucher.getWilayah() + ")   :");
        String wilayah = input.readLine();

        System.out.print("Voucher (" + voucher.getVoucher() + ")            : ");
        String Voucher = input.readLine();
        
        System.out.print("Paket (" + voucher.getPaket() + ")            : ");
        String paket = input.readLine();
        
        System.out.print("Kode (" + voucher.getKode() + ")          : ");
        int kode = Integer.parseInt(input.readLine());
        
        System.out.print("Masa (" + voucher.getMasa() + ")          : ");
        String masa = input.readLine();
        
        System.out.print("Harga (" + voucher.getHarga() + ")          : Rp. ");
        int harga = Integer.parseInt(input.readLine());
        
        voucher.setProvider(provider);
        voucher.setWilayah(wilayah);
        voucher.setVoucher(Voucher);
        voucher.setpaket(paket);
        voucher.setKode(kode);
        voucher.setMasa(masa);
        voucher.setHarga(harga);

        System.out.println("\nData voucher berhasil diubah.");
    }
    
    
    
    
    
    //----------- HAPUS DATA ----------
    private static void hapusPulsa() throws IOException {
    tampilkanPulsa();

    if (dataPulsa.size() == 0) {
        return;
    }

    System.out.print("\nPilih nomor data yang akan dihapus: ");
    int nomor = Integer.parseInt(input.readLine());

    if (nomor < 1 || nomor > dataPulsa.size()) {
        System.out.println("Nomor data tidak valid.");
        return;
    }

    Voucher barang = dataPulsa.get(nomor-1);
    dataPulsa.remove(barang);

    System.out.println("\nData berhasil dihapus.");
    }
    
    
    
    private static void hapusKuota() throws IOException {
    tampilkanKuota();

    if (dataKuota.size() == 0) {
        return;
    }

    System.out.print("\nPilih nomor data yang akan dihapus: ");
    int nomor = Integer.parseInt(input.readLine());

    if (nomor < 1 || nomor > dataKuota.size()) {
        System.out.println("Nomor data tidak valid.");
        return;
    }

    Voucher barang = dataKuota.get(nomor-1);
    dataKuota.remove(barang);

    System.out.println("\nData berhasil dihapus.");
    }
}
