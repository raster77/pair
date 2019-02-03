package fr.tdi.pair;

/**
 * @author thierry
 *     <p>Pair is a generic class that provides a way to store two heterogeneous objects as a single
 *     unit.
 * @param <T> the type of the first element that the pair stores.
 * @param <V> the type of the second element that the pair stores.
 */
public class Pair<T, V> {

  private T first;
  private V second;

  public Pair() {}

  /**
   * Constructor with parameters
   *
   * @param first first element of the pair
   * @param second second element of the pair
   */
  public Pair(T first, V second) {
    this.first = first;
    this.second = second;
  }

  /** @return the first element */
  public T getFirst() {
    return first;
  }

  /** @param first the first to set */
  public void setFirst(T first) {
    this.first = first;
  }

  /** @return the second element */
  public V getSecond() {
    return second;
  }

  /** @param second the second to set */
  public void setSecond(V second) {
    this.second = second;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */ @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Pair) {
      Pair<T, V> pair = (Pair<T, V>) obj;
      return this.first == pair.first && this.second == pair.second;
    }
    return false;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */ @Override
  public int hashCode() {
    int hash = 7;
    hash = 31 * hash + (first == null ? 0 : first.hashCode());
    hash = 31 * hash + (second == null ? 0 : second.hashCode());
    return hash;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#clone()
   */ @Override
  public Object clone() throws CloneNotSupportedException {
    return new Pair<T, V>(this.first, this.second);
  }
}
