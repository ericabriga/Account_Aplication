import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class NameSearchTest {
	
	Service service = new Service();

	Account jay = new Account("Jay","m","123");
	@Test
	public void nameSearchTest() {
		service.addAccount(jay);
		int expected = 1;
		int actual = service.nameSearch("Jay");
		Assert.assertEquals(expected, actual);

 }
}