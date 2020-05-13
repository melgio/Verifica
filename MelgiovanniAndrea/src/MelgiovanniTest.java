import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MelgiovanniTest {

	@Test
	void test1() {
		MelgiovanniClass m=new MelgiovanniClass(3,7);
		float risAtteso =2187;
		float risOttenuto = m.melgiovanniMet(3,7);
		assertEquals(risAtteso, risOttenuto, 0.0001);
	}
	void test2() {
		MelgiovanniClass m=new MelgiovanniClass(0,1);
		float risAtteso =0;
		float risOttenuto = m.melgiovanniMet(0,1);
		assertEquals(risAtteso, risOttenuto, 0.0001);
	}
	void test3() {
		MelgiovanniClass m=new MelgiovanniClass(0,0);
		float risAtteso =1;
		float risOttenuto = m.melgiovanniMet(0,0);
		assertEquals(risAtteso, risOttenuto, 0.0001);
	}

}
