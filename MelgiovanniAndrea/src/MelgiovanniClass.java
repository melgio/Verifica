	/**
	 *  <b>MelgiovanniClass</b>
	 * @author <u> Melgio </u>
	 * 
	 *<UL>
	 *<UI>data  <I>13/05/2020</I>
	 *</UL>
 	*/
public class MelgiovanniClass {


	
    /**
    *
    * CLASSE MelgiovanniClass
    */
	

	public MelgiovanniClass(int b1, int e1){
	
	
}
	public float melgiovanniMet (int b, int e) {
		int val1=b;  // val1 non puo essere ugale a 1 ma ugale a b
		for (int i=1; i<e; i++){
		val1 = val1 * b;
		}
		return val1;
		}
	//nel for dobbaimo sostituire la e al posto della b e impostare i<e

	
	public static void main(String[] args) {
		//MelgiovanniClass m=new MelgiovanniClass(10,3);
		//System.out.println(m.melgiovanniMet(10,3));
	    /**
	     *
	     * main
	     */
	}
	}