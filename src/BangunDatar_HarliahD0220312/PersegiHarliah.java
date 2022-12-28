
package BangunDatar_HarliahD0220312;

public class PersegiHarliah extends BangunDatarHarliah {
    float sisi, p, l, t;  
    
    @Override
    float luas(){
        float luas = sisi * sisi;
        System.out.println("------------------------------------");
        System.out.println("Menghitung Luas dan Volume Persegi\n");
        System.out.println("sisi (s) = " + sisi);
        System.out.println("\nLuas = s x s");
        System.out.println("Luas = "+ sisi +" x "+sisi);
        System.out.println("Luas : " + luas);
        
        return luas;
    }

    @Override
    float volume(){
        float volume = p*l*t;
        System.out.println("\nPanjang (p) = " + p);
        System.out.println("Lebar (l) = " + l);
        System.out.println("Tinggi (t) = " + t);
        System.out.println("\nVolume = p x l x t");
        System.out.println("Volume = " +p +" x "+ l + " x "+ t);
        System.out.println("Volume : " + volume);
        System.out.println("------------------------------------\n");
        return volume;
    }
}
