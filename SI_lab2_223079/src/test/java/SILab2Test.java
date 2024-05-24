import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void testCheckCartEveryBranch() {
        // Allitems = null
        RuntimeException ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100));
        assertEquals("allItems list can't be null!", ex.getMessage());
    }

    @Test
    void testCheckCartMultipleCondition() {
        // Site True
        Item item1 = new Item("item1", "012345", 350, 0.1f);
        List<Item> items = Arrays.asList(item1);
        assertTrue(SILab2.checkCart(items, 40));
    }
}
