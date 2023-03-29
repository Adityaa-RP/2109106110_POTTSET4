package posttest4;

public class Voucher {
    private String voucher;
    private String paket;
    private String masa;
    private int kode;
    private int harga;

    public Voucher (String voucher, String paket, String masa, int kode, int harga) {
        this.voucher = voucher;
        this.paket = paket;
        this.masa = masa;
        this.kode = kode;
        this.harga = harga;
    }

    //----------VOUCHER----------
    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }
    
    //----------PAKET----------
    public String getPaket() {
        return paket;
    }

    public void setpaket(String paket) {
        this.paket = paket;
    }
    
    //----------MASA----------
    public String getMasa() {
        return masa;
    }

    public void setMasa(String Masa) {
        this.masa = Masa;
    }
    
    //----------KODE----------
    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }
    
    //---------HARGA----------
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    //----------DISPLAY----------
    public String toString () {
        return voucher + " | " + paket + " | " + masa + " | " + kode + " |Rp.  " + harga;
    }
}
