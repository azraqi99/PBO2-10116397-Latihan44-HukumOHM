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
public class Baterai {
    
    private float kuatArus;
    private float hambatan;

   public Baterai(){
       
   }
   
   public Baterai(float kuatArus, float hambatan){
       this.kuatArus = kuatArus;
       this.hambatan = hambatan;
   }
    
    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
    
}
