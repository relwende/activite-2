package exo2appdev;

/** 
 * Ceci est la classe calcul.
 **/
public class Calcul {
   /** 
    * Calcul la somme de deux nombres.
    **/
        
   public static int somme(int vala,int valb) {
	   
    return vala + valb;
    
    }
   
   /** Renvoie la note, bornée par les valeurs min et max, exemples:
    * noteBornee(12.5,0.0,20.0) doit renvoyer 12.2
    * noteBornee(25.0,0.0,20.0) doit renvoyer 20.0
    * noteBornee(-2.0,0.0,20.0) doit renvoyer 0.0
    **/

    public static double noteBornee(double note, double min, double max) {
    	
       if (note >= max){
          return max; 
        }
        if (note <= min)
        { 
          return min;
        }
         return note;
         } 
   /** @return vala / valb si valb != 0
    * @throw IllegalArgumentException si valb == 0
    */
    public static int division(int vala,int valb){
        if ( valb == 0 ) {
          throw new IllegalArgumentException("valb ne doit pas etre 0");
         }
         return vala / valb;
         }
}