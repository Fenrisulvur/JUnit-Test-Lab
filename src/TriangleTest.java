import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	@Test
	public void test() {
		
		float result = Triangle.findArea(3.0f, 4.0f, 5.0f);
		float result2 = Triangle.findArea(6.0f, 7.0f, 2.0f);
		float result3 = Triangle.findArea(2.0f, 24.0f, 1.0f);
		float result4 = Triangle.findArea(-7.0f, (float)Integer.MAX_VALUE, (float)Integer.MAX_VALUE);
		float result5 = Triangle.findArea(34.0f, 14.0f, 22.0f);

		assertEquals(6.0f,result,.1);
		assertEquals(5.5f,result2,.1);
		assertEquals(0,result3,.1);
		assertEquals(0,result4,.1);
		assertEquals(97.7f,result5,.1);
	}

}
