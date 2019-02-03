package fr.tdi.pair.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import fr.tdi.pair.Pair;

class PairTest {

  @Test
  void testConstructor() {
    Pair<String, String> stringPair = new Pair<>("first", "second");
    assertEquals("first", stringPair.getFirst(), "stringPair.getFirst() should equal first");
    assertEquals("second", stringPair.getSecond(), "stringPair.getSecond() should equal second");
  }

  @Test
  void testEquals() {
    Pair<String, String> stringPair1 = new Pair<>("first", "second");
    Pair<String, String> stringPair2 = new Pair<>("first", "second");
    assertEquals(
        true, stringPair1.equals(stringPair2), "stringPair1 should be equal to stringPair2");
  }

  @Test
  void testNotEquals() {
    Pair<String, String> stringPair1 = new Pair<>("first", "second");
    Pair<String, String> stringPair2 = new Pair<>("first2", "second2");
    assertNotEquals(
        true, stringPair1.equals(stringPair2), "stringPair1 should not be equal to stringPair2");
  }

  @SuppressWarnings("unchecked")
  @Test
  void testClone() {
    Pair<String, String> stringPair1 = new Pair<>("first", "second");
    Pair<String, String> clone = null;
    try {
      clone = (Pair<String, String>) stringPair1.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    assertEquals(true, stringPair1.equals(clone), "clone should be equal to stringPair1");
  }
}
