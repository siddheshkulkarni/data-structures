package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.datastructures.Palindrome;
public class PalindromeTest {

	String input;
	
  @Before
  public void perform()
  {
	  input="";
		  
  }
	@Test
	public void test_valid() {
		input="racecar";
		assertEquals(true,Palindrome.isPalindrome(input));
	}
	@Test
	public void test_empty()
	{
		assertFalse(Palindrome.isPalindrome(input));
	}

}
