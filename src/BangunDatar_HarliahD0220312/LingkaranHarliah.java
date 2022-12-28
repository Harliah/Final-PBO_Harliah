
package BangunDatar_HarliahD0220312;

public class LingkaranHarliah  extends BangunDatarHarliah {
     // jari-jari lingkaran
    float r;
    
    @Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("------------------------------------");
        System.out.println("Menghitung Luas dan Volume Lingkaran\n");
        System.out.println("r (jari-jari) = " + r+"\n");
        System.out.println("Luas = 3.14 x r x r");
        System.out.println("Luas = 3.14 x "+r +" x "+r);
        System.out.println("Luas = " + luas);
        return luas;
    }
    @Override
    float volume(){
        float volume = (float) (Math.PI * r * r);
        System.out.println("\nVolume = 3.14 x r x r");
        System.out.println("Volume = 3.14 x "+r +" x "+r);
        System.out.println("Volume: " + volume);
        System.out.println("------------------------------------\n");
        return volume;
    }
    
}
 

