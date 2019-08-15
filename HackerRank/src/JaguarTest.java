import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class JaguarTest {
	@Test
	public void addTest() {
		String s= "1,2,3";
		
		int i = 6;
	
		assertEquals(i, new Jaguar().add(s));
	}
	@Test
	public void addEmptyTest() {
		String s ="";
		int i = 0;
		assertEquals(i, new Jaguar().add(s));
	}
	
	@Test
	public void testNewLine() {
		String s =  "1\n2,3";
		int i = 6;
		assertEquals(i, new Jaguar().add(s));
	}
	}
