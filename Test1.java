import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {

	@Test
	public void test_length() {
		Snowboard snowboard = new Snowboard(10,Snowboard.shapes[0],true,20.3f);

		int length = 10;
		assertEquals(length, snowboard.getLength());
	}

	@Test
	public void test_shapes() {
		Snowboard snowboard = new Snowboard(10,Snowboard.shapes[0],true,20.3f);
		Snowboard snowboard1 = new Snowboard(10,Snowboard.shapes[1],true,20.3f);
		Snowboard snowboard2 = new Snowboard(10,Snowboard.shapes[2],true,20.3f);
		assertEquals(Snowboard.shapes[0], snowboard.getShape());
		assertEquals(Snowboard.shapes[1], snowboard1.getShape());
		assertEquals(Snowboard.shapes[2], snowboard2.getShape());
	}

	@Test
	public void test_radius() {
		Snowboard snowboard = new Snowboard(10,Snowboard.shapes[0],true,20.3f);

		float radius = 20.3f;
		assertEquals(radius, snowboard.getRadius());
	}

	@Test
	public void test_isDirectional() {
		Snowboard snowboard = new Snowboard(10,Snowboard.shapes[0],true,20.3f);

		assertTrue(snowboard.isDirectional());
	}

}
