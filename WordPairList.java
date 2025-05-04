import java.util.ArrayList;
public class WordPairList {

    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length-1;i++){
            for (int j = i+ 1; j < words.length; j++){
                WordPair w= new WordPair(words[i], words[j]);
                allPairs.add(w);
            }
        }
    }
    public int numMatches() {
        int matches = 0;
        for(WordPair w : allPairs){
            if (w.getFirst().equals(w.getSecond())) matches++;
        }
        return matches;
    }
    public String toString(){
        return "(\"" + first + "\", \"" + second + "\")"; 
    }
    public ArrayList<WordPair> getAllPairs(){
        return allPairs;
    }
}