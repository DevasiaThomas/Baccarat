import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BaccaratRuleEngineTest {
	Shoe s;

	@Before
	public void setUp() throws Exception {
		s = new Shoe();
	}

	@Test
	public void test() {
		int result = BaccaratRuleEngine.returnResult(8, 9, s);
		System.out.println(result + "\n");
		assertEquals(-1, result);

	}

}
