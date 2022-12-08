package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;


class OtherAnnotation {
	
	@ParameterizedTest
	@DisplayName("Parameterized Test")
	@ValueSource(strings = {"test", "camel", "black", "red", "phone", "rocket"})
	void shouldPassNonNullMessageAsMethodParameter(String candidate) {
		assertTrue(candidate!=null, candidate);
	}
	
	@Nested
	@DisplayName("Nested Test")
	class NestTest {
		
		@Test
		@DisplayName("Add Test")
		void addTest() {
			assertEquals(3, 2+1);
		}
		@Test
		@DisplayName("Subtract Test")
		void subtractTest() {
			assertEquals(3, 4-1);
		}
		
	}
	
	@RepeatedTest(3)
	@DisplayName("Repeated Test")
	void repeatedTest(TestInfo testInfo) {
	    System.out.println("Executing repeated test");
	    assertEquals(3, Math.subtractExact(4, 1));
	}
}