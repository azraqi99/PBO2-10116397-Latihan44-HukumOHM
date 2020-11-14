/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Hukum Ohm
 */
package pbo210116397latihan44hukumohm;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=======Hukum OHM======");
        
        Baterai bti = new Baterai(3,12);
        System.out.println("Kuat Arus : " +bti.getKuatArus()+ " ampere ");
        System.out.println("Hambatan : " +bti.getHambatan()+ " ohm ");
        System.out.println("Hasil Tegangan : " +bti.hitungTegangan()+ " volt ");
    
    }
    
}
