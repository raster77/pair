package fr.tdi.pair.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import fr.tdi.pair.ImmutablePair;

public class ImmutablePairTest {

  @Test
  void testConstructor() {
    ImmutablePair<String, String> stringPair = new ImmutablePair<>("first", "second");
    assertEquals("first", stringPair.getFirst(), "stringPair.getFirst() should equal first");
    assertEquals("second", stringPair.getSecond(), "stringPair.getSecond() should equal second");
  }

  @Test
  void testEquals() {
    ImmutablePair<String, String> stringPair1 = new ImmutablePair<>("first", "second");
    ImmutablePair<String, String> stringPair2 = new ImmutablePair<>("first", "second");
    assertEquals(
        true, stringPair1.equals(stringPair2), "stringPair1 should be equal to stringPair2");
  }

  @Test
  void testNotEquals() {
    ImmutablePair<String, String> stringPair1 = new ImmutablePair<>("first", "second");
    ImmutablePair<String, String> stringPair2 = new ImmutablePair<>("first2", "second2");
    assertNotEquals(
        true, stringPair1.equals(stringPair2), "stringPair1 should not be equal to stringPair2");
  }

  @SuppressWarnings("unchecked")
  @Test
  void testClone() {
    ImmutablePair<String, String> stringPair1 = new ImmutablePair<>("first", "second");
    ImmutablePair<String, String> clone = null;
    try {
      clone = (ImmutablePair<String, String>) stringPair1.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    assertEquals(true, stringPair1.equals(clone), "clone should be equal to stringPair1");
  }
}
