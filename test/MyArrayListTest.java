import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    MyArrayList list = new MyArrayList(2);
    @Test
    public void testArrayListIsEmpty() {
        assertTrue(list.isEmpty());
    }
    @Test
    public void testArrayListCanAddElements() {
        list.add(1344);
        list.add(1244);
        list.add(1010);
        assertEquals(3, list.size());
    }
    @Test
    public void testArrayListCanRemoveElement() {
        list.add(1234);
        list.add(1010);
        assertFalse(list.isEmpty());
        assertTrue(list.remove(1234));
        assertEquals(1, list.size());
    }
    @Test
    public void testArrayListCanGetElementByIndex() {
        list.add(1234);
        list.add(1010);
        assertEquals(1234, list.get(0));
    }
}

