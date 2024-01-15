
package javito_dolgozat;


public class Lampa {
    public int gomb;
    public enum allapot{ALAP,ERROSEBB,VILLOG,VELETSZERUEN_VILLOG,KIKAPCSOL};

    public Lampa(int gomb, enum allapot) {
        this.gomb = 5;
        this.allapot = allapot.KIKAPCSOL;
    }

    public int getGomb() {
        return gomb;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.gomb;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lampa other = (Lampa) obj;
        return this.gomb == other.gomb;
    }

    @Override
    public String toString() {
        return "Lampa{" + "gomb=" + gomb + '}';
    }
    public void allapotok(){
        switch(this.allapot){
            case AllAP{
                System.out.println("A lámpa alap szinten világít");
            }
            case ERROSEBB{
               System.out.println("A lámpa erőssebben világít"); 
            }
            case VILLOG{
                sout
            }
             default KIKAPCSOL{
                System.out.println("A lampa kikapcsolva");
        }
           
            
        }
    }
    public int gombnyomas(){
        int szam = 0;
        if (szam < 5) {
            szam++;
        }
        else{
            szam = 0;
        }
        return szam;
    }
    public void mukodes(){
        boolean megnyomod_e =true;
       while(megnyomod_e){
           
       }
           
    }
}

