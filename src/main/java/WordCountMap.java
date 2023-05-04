import java.util.*;

public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){
        HashMap<String, Integer> hashyMap = new HashMap<>(); // Declaring a HashMap of <String, Integer>
        String[] myWords = words.split(" "); // Splitting the words of string and storing them in an array
        for (String word : myWords) { // Iterate through the resulting array
            Integer integer = hashyMap.get(word);
            if (integer == null)
            hashyMap.put(word, 1); // Insert a new key to the map every time you encounter a word that is not already a key in the map
            else 
            hashyMap.put(word, integer + 1); // Add to the word's count value every time you encounter a word that already exists in the map
        }
        return hashyMap;
    }
}
