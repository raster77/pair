package fr.tdi.pair;

/**
 * @author thierry
 *     <p>Pair is a generic class that provides a way to store two heterogeneous objects as a single
 *     unit. First ans second can't be modified.
 * @param <T> the type of the first element that the pair stores.
 * @param <V> the type of the second element that the pair stores.
 */
public class ImmutablePair<T, V> {

  private final T first;
  private final V second;

  /**
   * Constructor with parameters
   *
   * @param first first element of the pair
   * @param second second element of the pair
   */
  public ImmutablePair(T first, V second) {
    this.first = first;
    this.second = second;
  }

  /** @return the first element */
  public T getFirst() {
    return first;
  }

  /** @return the second element */
  public V getSecond() {
    return second;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */ @SuppressWarnings("unchecked")
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ImmutablePair) {
      ImmutablePair<T, V> pair = (ImmutablePair<T, V>) obj;
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
    return new ImmutablePair<T, V>(this.first, this.second);
  }
}
