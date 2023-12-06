/**
 * Interface for dictionary operations
 *
 * @author Greg Gagne
 */

public interface Dictionary <K, V>
{
    /**
     * Put the key:value mapping in the dictionary
     *
     * @return The value mapped to this key. If the key is
     * mapped to an existing value, the  
     * mapping is updated to the new value.
     */
    public V put(K key, V value);

    /**
     * Get the value mapped to the specified key.
     *
     * @return V the value mapped to the key, or null if no mapping exists.
     */
    public V get(K key);

    /**
     * Determines if the dictionary contains the specified key.
     *
     * @return boolean - True if the dictionary contains the key, false otherwise.
     */
    public boolean contains(K key);

    /**
     * Returns the number of [key:value] mappings
     */
    public int size();

}
