package dateTests;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class ME {		//Testing time zone, GMT = +0930

	@Test
	void test1() {
		String originalInput = "Tue, 3 Jun 2008 1:05:30 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		String metaMorphInput = "Tue, 3 Jun 2008 1:05:30 +0930";
		LocalDateTime metaMorphDateTime = LocalDateTime.parse(metaMorphInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		assertEquals(originalDateTime, metaMorphDateTime);
	}

	@Test
	void test2() {
		String originalInput = "Wed, 12 Dec 2018 1:05:30 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		String metaMorphInput = "Wed, 12 Dec 2018 1:05:30 +0930";
		LocalDateTime metaMorphDateTime = LocalDateTime.parse(metaMorphInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		assertEquals(originalDateTime, metaMorphDateTime);
	}	
	
	@Test
	void test3() {
		String originalInput = "Tue, 3 Jun 2008 1:5:5 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		String metaMorphInput = "Tue, 3 Jun 2008 1:5:5 +0930";
		LocalDateTime metaMorphDateTime = LocalDateTime.parse(metaMorphInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		assertEquals(originalDateTime, metaMorphDateTime);		
	}
	
	@Test
	void test4() {
		String originalInput = "Tue, 3 Jun 2008 1:05 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		String metaMorphInput = "Tue, 3 Jun 2008 1:05 +0930";
		LocalDateTime metaMorphDateTime = LocalDateTime.parse(metaMorphInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		assertEquals(originalDateTime, metaMorphDateTime);
	}
	
	@Test
	void test5() {
		String originalInput = "Tue, 3 Jun 2008 1:05:30 +0000"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;

		String metaMorphInput = "Tue, 3 Jun 2008 1:5:30 +0930";
		LocalDateTime metaMorphDateTime = LocalDateTime.parse(metaMorphInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		assertEquals(originalDateTime, metaMorphDateTime);		
	}
	
	@Test
	void test6() {
		String originalInput = "3 Jun 2008 1:6:30 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;

		String metaMorphInput = "3 Jun 2008 1:6:30 +0930";
		LocalDateTime metaMorphDateTime = LocalDateTime.parse(metaMorphInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		assertEquals(originalDateTime, metaMorphDateTime);	
	}
	
	@Test
	void test7() {
		String originalInput = "3 Jun 2008 1:05 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;

		String metaMorphInput = "3 Jun 2008 1:05 +0930";
		LocalDateTime metaMorphDateTime = LocalDateTime.parse(metaMorphInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		assertEquals(originalDateTime, metaMorphDateTime);	
	}
	
	@Test
	void test8() {
		String originalInput = "3 Jun 2008 1:05:30 +0000"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;

		String metaMorphInput = "3 Jun 2008 1:05:30 +0930";
		LocalDateTime metaMorphDateTime = LocalDateTime.parse(metaMorphInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		assertEquals(originalDateTime, metaMorphDateTime);		
	}
	
	@Test
	void test9() {
		String originalInput = "Tue, 3 Jun 2008 1:05:30 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;

		String metaMorphInput = "Tue, 3 Jun 2008 1:05:30 +0930";
		LocalDateTime metaMorphDateTime = LocalDateTime.parse(metaMorphInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		assertEquals(originalDateTime, metaMorphDateTime);		
	}
	
	@Test
	void test10() {
		String originalInput = "12 Dec 2018 1:05:30 GMT"; 
		LocalDateTime originalDateTime = LocalDateTime.parse(originalInput, DateTimeFormatter.RFC_1123_DATE_TIME);;

		String metaMorphInput = "12 Dec 2018 1:05:30 +0930";
		LocalDateTime metaMorphDateTime = LocalDateTime.parse(metaMorphInput, DateTimeFormatter.RFC_1123_DATE_TIME);;
		
		assertEquals(originalDateTime, metaMorphDateTime);		
	}	
}
