
package BangunDatar_HarliahD0220312;

public class SegitigaHarliah  extends BangunDatarHarliah{
    float alas, tinggi, prisma;
   
    
    @Override
    float luas() {
        float luas = (float) (0.5 * alas * tinggi);
        System.out.println("------------------------------------");
        System.out.println("Menghitung Luas dan Volume Segitiga");
        System.out.println("\nalas = " + alas);
        System.out.println("tinggi = " + tinggi);
        System.out.println("\nLuas = 1/2 x alas x tinggi");
        System.out.println("Luas = 1/2 x "+ alas +" x "+tinggi);
        System.out.println("Luas = " + luas);
        
        return luas;
    } 
    
    @Override
    float volume() {
       
        float volume = (float) (0.5 * alas * tinggi * prisma);
        System.out.println("\nalas = " + alas);
        System.out.println("tinggi = " + tinggi);
        System.out.println("tinngiprisma = " + prisma);
        System.out.println("\nLuas = 1/2 x alas x tinggi x tinggiprisma");
        System.out.println("Luas = 1/2 x "+ alas +" x "+tinggi+" x "+ prisma);
        System.out.println("Volume Segitiga: " + volume);
        System.out.println("------------------------------------\n");
        return volume;
    }  
}
