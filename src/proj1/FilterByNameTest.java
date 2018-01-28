package proj1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FilterByNameTest {
	private Person p1;
	private Person p2;
	
	private FilterByName f;

	@Before
	public void setUp() {
		p1 = new Person();
		p1.setFullName("John");
		p2 = new Person();
		p2.setFullName("Jane");
		f = new FilterByName("John");

	}

	@Test
	public void acceptTest() {
		Assert.assertTrue("Filter john should be true", f.accept(p1));
		Assert.assertFalse("Filter jane should be false", f.accept(p2));
	}

}
