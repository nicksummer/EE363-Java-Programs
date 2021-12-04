package hw4.p2;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
public class IntSetTest {

    //Test to see if the given value is inserted into the array properly
    @Test
    public void testInsertIntoArray () {
        IntSet set = new IntSet();
        set.insert(100);
        assertTrue(set.isIn(100) == true);
    }

    //Test to see a specific value is in the IntSet
    // asserts False if the value is not in the set
    @Test
    public void testSpecificValIsNotInSet () {
        IntSet set = new IntSet();
        set.insert (7);
        set.insert (4);
        set.insert (7);
        set.insert (10);
        set.insert (234);
        set.insert (33);
        set.insert (55);
        set.insert (-88);

        assertFalse(set.isIn(24) == true);
    }

    //Test to see if the new intset is empty
    @Test
    public void testIfEmpty () {
        IntSet set = new IntSet();
        assertTrue(set.size() == 0);
    }

    //Test no duplicates after object construction
    @Test
    public void test_noDuplPostCons () {
        IntSet is2 = new IntSet ();
        is2.insert (7);
        is2.insert (4);
        is2.insert (7);
        is2.insert (10);
        is2.insert (-3);
        assertEquals(is2.size(), 4);
    }
}
