
package BangunDatar_HarliahD0220312;

public class MainClass {
    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunDatarHarliah bangunDatar = new BangunDatarHarliah();
        
        // membuat objek persegi dan mengisi nilai properti
        PersegiHarliah persegi = new PersegiHarliah();
        persegi.sisi = 2;
        persegi.p=12;
        persegi.l=4;
        persegi.t=8;
        
        
        // membuat objek Lingkaran dan mengisi nilai properti
        LingkaranHarliah lingkaran = new LingkaranHarliah();
        lingkaran.r = 15;
        
        
        
        // membuat objek Segitiga dan mengisi nilai properti
        SegitigaHarliah mSegitiga = new SegitigaHarliah();
        mSegitiga.alas = 14;
        mSegitiga.tinggi = 6;
        mSegitiga.prisma=10;
        
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        
        
        persegi.luas();
        persegi.volume();
        
        lingkaran.luas();
        lingkaran.volume();
        
        mSegitiga.luas();
        mSegitiga.volume();
    }
}
    
 
