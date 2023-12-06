import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Unit test for testing linear probing.
 * 
 * @author Greg Gagne - April 2023.
 *
 */
public class TestLinear {

	@Test
	public void testAdd() {
		Dictionary<String, Integer> d = new HashDictionary<String, Integer>();

		// some basic additions
		assertEquals(Integer.valueOf(16),d.put("Jay", 16));
		assertEquals(Integer.valueOf(19),d.put("Tom", 19));
		assertEquals(Integer.valueOf(1),d.put("Sydney", 1));
		assertEquals(Integer.valueOf(31),d.put("Nate", 31));
		assertEquals(Integer.valueOf(31),d.put("Emily", 31));

		// now test that put() replaces an existing mapping
		assertEquals(Integer.valueOf(20), d.put("Tom", 20));
		assertEquals(5,d.size());

		// replace an existing entry with the same value
		// should have no effect
		assertEquals(Integer.valueOf(31),d.put("Emily", 31));
		assertEquals(5,d.size());
	}

	@Test
	public void testGet() {
		Dictionary<String, Integer> d = new HashDictionary<String, Integer>();

		assertNull(d.get("Tom"));

		assertEquals(Integer.valueOf(19),d.put("Tom", 19));

		assertEquals(Integer.valueOf(19), d.get("Tom"));
	}

	@Test
	public void testContains() {
		Dictionary<String, Integer> d = new HashDictionary<String, Integer>();

		assertFalse(d.contains("Tom"));

		assertEquals(Integer.valueOf(19),d.put("Tom", 19));

		assertTrue(d.contains("Tom"));

	}

/*

	@Test public void testStressfulAdd() { 
		Dictionary<String, Integer> d = new HashDictionary<String, Integer>();

		// some basic additions 
		assertEquals(Integer.valueOf(16),d.put("Jay", 16));
		assertEquals(Integer.valueOf(19),d.put("Tom", 19));
		assertEquals(Integer.valueOf(1),d.put("Sydney", 1));
		assertEquals(Integer.valueOf(31),d.put("Nate", 31));
		assertEquals(Integer.valueOf(31),d.put("Emily", 31));

		// now test that put() replaces an existing mapping
		assertEquals(Integer.valueOf(20), d.put("Tom", 20));
		assertEquals(5,d.size());

		// replace an existing entry with the same value 
		// should have no effect
		assertEquals(Integer.valueOf(31),d.put("Emily", 31));
		assertEquals(5,d.size());

		// some basic retrievals 
		assertEquals(Integer.valueOf(16), d.get("Jay"));
		assertEquals(Integer.valueOf(20), d.get("Tom"));
		assertEquals(Integer.valueOf(1), d.get("Sydney"));
		assertEquals(Integer.valueOf(31), d.get("Nate"));
		assertEquals(Integer.valueOf(31), d.get("Emily"));

		assertNull(d.get("Paul"));

		// now trigger rehashing the table
		assertEquals(Integer.valueOf(25),d.put("Andrew", 25));
		assertEquals(Integer.valueOf(6),d.put("Liam", 6));
		assertEquals(Integer.valueOf(2),d.put("Tilda", 2));
		assertEquals(Integer.valueOf(35),d.put("Becky", 35));

		// this should cause the rehash
		assertEquals(Integer.valueOf(12),d.put("Mitzi", 12));

		assertEquals(10,d.size());

		// now ensure everything is present 
		assertTrue(d.contains("Jay"));
		assertTrue(d.contains("Tom")); assertTrue(d.contains("Sydney"));
		assertTrue(d.contains("Nate")); assertTrue(d.contains("Emily"));
		assertTrue(d.contains("Andrew")); assertTrue(d.contains("Liam"));
		assertTrue(d.contains("Tilda")); assertTrue(d.contains("Becky"));
		assertTrue(d.contains("Mitzi"));

		assertFalse(d.contains("Henry"));

		// now a stress test 
		d = new HashDictionary<String, Integer>();

		for (int i = 0; i < 50000; i++) { 
			assertEquals(Integer.valueOf(i),d.put(Integer.toString(i), i) ); 
		}
		
		assertEquals(50000,d.size());

		for (int i = 0; i < 50000; i++) { 
			assertTrue(d.contains(Integer.toString(i))); 
		}
	}
*/

}
