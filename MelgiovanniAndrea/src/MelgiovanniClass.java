	/**
	 *  <b>MelgiovanniClass</b>
	 * @author <u> Melgio </u>
	 * 
	 *<UL>
	 *<UI>data  <I>13/05/2020</I>
	 *</UL>
 	*/
public class MelgiovanniClass {

	private int b,e;
	
    /**
    *
    * CLASSE MelgiovanniClass
    */
	

	public MelgiovanniClass(int b1, int e1){
	
	
}
	public float melgiovanniMet (int b, int e) {
		int val1=1; 		
			for (int i=1; i<=b; i++){
				val1 = val1 * b;
			}
			return val1;
		}

	
	public static void main(String[] args) {
		MelgiovanniClass m=new MelgiovanniClass(10,3);
		System.out.println(m.melgiovanniMet(10,3));
	    /**
	     *
	     * main
	     */
	}
	}