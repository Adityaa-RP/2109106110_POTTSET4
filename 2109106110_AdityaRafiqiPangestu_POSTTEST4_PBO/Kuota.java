
package posttest4;

public class Kuota extends Voucher{
    protected String provider;
    protected String wilayah;

    public String getProvider() {
        return provider;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    public Kuota(String provider, String wilayah, String voucher, String paket, String masa, int kode, int harga) {
        super(voucher, paket, masa, kode, harga);
        this.provider = provider;
        this.wilayah = wilayah;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void setHarga(int harga) {
        super.setHarga(harga); 
    }

    @Override
    public int getHarga() {
        return super.getHarga(); 
    }

    @Override
    public void setKode(int kode) {
        super.setKode(kode); 
    }

    @Override
    public int getKode() {
        return super.getKode();
    }

    @Override
    public void setMasa(String Masa) {
        super.setMasa(Masa); 
    }

    @Override
    public String getMasa() {
        return super.getMasa();
    }

    @Override
    public void setpaket(String paket) {
        super.setpaket(paket); 
    }

    @Override
    public String getPaket() {
        return super.getPaket(); 
    }

    @Override
    public void setVoucher(String voucher) {
        super.setVoucher(voucher); 
    }

    @Override
    public String getVoucher() {
        return super.getVoucher(); 
    }
    
    
}