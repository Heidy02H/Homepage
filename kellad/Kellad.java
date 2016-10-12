/*
 * Selles failis tuleb igal pool asendada kaldkriipsudest koosnevad read
 * sobiliku javadoc kommentaariga. Seej2rel genereerida javadoc ja
 * kontrollida, et poleks t2itmata j22nud lahtreid.
 */

/**
 * Peameetodit sisaldav silumisklass. Siit algab rakenduse täitmine.
 * @version 0.1
 * @author Heidi
 * @since 1.2
 */
public class Kellad { // peameetodit sisaldav silumisklass
   
   /**
    * Peameetod. Kutsub teisi meetodeid välja.
    * @param s k'surealt antud tekst
    */
   public static void main (String[] s) {
      Kell k = new KaeKell ("Rolex");
      System.out.println (((KaeKell)k).mark 
         + " " + k.jooksevAeg());
      Mobla m = new Mobla (25612345);
      System.out.println (String.valueOf (m.number)
         + " " + m.jooksevAeg());
   } // main

} // Kellad

/**
 *Liides. mis kirjeldab oskust aega näidata. niisugune oskus on paljudel seadmetel.
 * @version 0.7alpha
 */
interface Ajanaitaja { // liides, mis kirjeldab oskust aega n2idata

   /**
	* Aja näitamine teksti kujul. Erinevad seadmed annavad erinevat teksti.
	*@return jooksev aeg
	*/
   String jooksevAeg(); // tagastab jooksva kellaaja stringina

} // Ajanaitaja

/**
 * Kella omadusi kirjeldav klass. Kell oskab aega näidata
 * @author Jaanus Pöial
 */
class Kell implements Ajanaitaja {

   /**
	* Jooksva aja leidmine Date abil.
	*/
   public String jooksevAeg() {
      return new java.util.Date().toString();
   } // jooksevAeg

} // Kell

/**
 * Käekella omadusi kirjeldav klass. Käekell pärib Kellast.
 * @author Heidi
 */
class KaeKell extends Kell {

   /** Kella tootjafirma nimi */
   String mark; // kaekelladel peame meeles ka marki

   /**
	* Käekella konstruktor. Loob uue käekella.
	* @param s kella mark
	*/
   KaeKell (String s) {
      mark = s;
   } // konstruktor

} // KaeKell

/**
 * Telefoni omadusi kirjeldav klass. 
 */
class Telefon {

   /** Telefoninumber integer vormis */
   int number; // telefoninumber

   /**
	* Telefoni konstruktor. Loob uue telefoni.
	* @param n telefoninumber
	*/
   Telefon (int n) {
      number = n;
   } // konstruktor

} // Telefon

/**
 * Mobla omadusi kirjeldav klass. Mobla oskab aega näidata.
 * @author Jaanus Pöial
 */ 
class Mobla extends Telefon implements Ajanaitaja {

   /** Moblasse sisseehitatud kell */
   private Kell sisemineKell; // moblasse sisseehitatud kell

   /** 
	* Mobla konstruktor. Loob uue Mobla.
	* @param n telefoninumber
	*/
   Mobla (int n) {
      super (n);
      sisemineKell = new Kell();
   } // konstruktor

   /**
	* Jooksva aja leidmine sisemise kella abil.
	* @return jooksev aeg
	*/
   public String jooksevAeg() {
      return sisemineKell.jooksevAeg();
   } // jooksevAeg

} // Mobla

// faili l6pp

