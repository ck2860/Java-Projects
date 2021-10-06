package Homework19;


import java.io.*;
import java.util.*;
import java.util.List;

public class Anagrams {
    /**
     * the read words method is used to read every word in the file.
     * It would return a collection of words.
     * The split function is used to split two words or more per line.
     * If any problems occur, an Anagram exception is thrown.
     * @param filename a string file name
     * @return the collection of unique words
     * @throws AnagramException throws an AnagramException
     */
    public static Collection<String> readWords(String filename) throws AnagramException {
        Set<String> words = new HashSet<>(); //make the words unique?
        try {
            File myFile = new File(filename);
            FileReader fr = new FileReader(myFile);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                String [] array = line.split(" ");
                int i =0;
                while(array.length > 0 && i < array.length){
                    words.add(array[i]);
                    i++;
                }
                line = br.readLine(); // read next line
            }
            fr.close();
        }catch (Exception e){
//            Throwable b = new Throwable("Anagram Exception");
            throw new AnagramException("Error: Problem reading file", e);
        }
        return words;
    }

    /**
     * The sort word method would accepts a word as a string and returns  a string with
     * a character in sorted orders.
     * @param word
     * @return
     */

    public static String sortWords(String word){
        int[] array = new int[word.length()];
        for (int i = 0; i < word.length(); i++) {
            array[i] = word.charAt(i);
        }
        Arrays.sort(array);
        char[] array1 = new char[array.length];
        for(int j =0; j < array.length; j++){
            array1[j] = (char)(array[j]);
        }
        String sortedString = "";
        for (int k = 0; k <array1.length; k++){
            sortedString = sortedString + array1[k];
        }
        return sortedString;
    }

    /**
     * This method is use to make an anagram that takes a collection of unique words.
     * The sortword method is used to for key in a map.
     * it would store the values in the same key.
     * @param wordsCollection
     * @return
     */

    public static Map makeAnagrams(Collection<String> wordsCollection) {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (String word : wordsCollection) {
            String sortedWord = sortWords(word);
            if (!map.containsKey(sortedWord)) { // map doesn't have this key, create a new key/value pair
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word); // add this word permutation to the key
        }
        return map;
    }

    /**
     * The map of anagram would be written into the file.
     * The set of anagram would be printed per line.
     * So the first word would be the sorted word then followed all of the anagrams with the same characters will be also sorted..
     * Once the key and its values are written
     * the next line is printed.
     * @param map the map of anagram
     * @param filename the name of the file
     * @throws AnagramException throws an exception
     */

    public static void writeAnagrams(Map map, String filename) throws AnagramException {
        try{
            File myFile = new File(filename);
            FileWriter fw = new FileWriter(myFile);
            PrintWriter pw = new PrintWriter(fw);
            String [] array = new String [map.size()];
            int i =0;
            for(Object key: map.keySet()){
                array[i] = (String) key;
//                fw.write(array[i]);
//                fw.write(" ");
                pw.print(array[i]);
                pw.print(" ");
                List VALUES = (ArrayList<String>) map.get(key);
                Collections.sort(VALUES);
                for (Object word : VALUES) {
//                    fw.write((String) word);
//                    fw.write(" ");
                    pw.print(word);
                    pw.print(" ");
                }
//                fw.write("\n");
                pw.print("\n");
                i++;
            }
            fw.flush();
            fw.close();
        } catch (Exception ex) {
//            Throwable b = new Throwable("Anagram Exception");
            throw new AnagramException("Problem writing data into file", ex);
        }
    }

    /**
     * A method that would take two filenames for input and output  as command line arugement s
     * then anagram would be created into the output filename.
     * The prompt would be in the loop so the user would type the words into the anagram.
     * If the user enters a blank line then the program would quit.
     * @param args two file names (input and output)
     */


    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Map map = new HashMap();
            String input;
            String output;
            if (args.length == 2){
                input = args[0];
                output = args[1];
            }else{
                input = "words_alpha.txt";
                output = "Output";
            }
            Collection<String> list = readWords(input);
            map = makeAnagrams(list);
            int counter = 0;
            while(counter == 0) {
                System.out.print("Enter a word: ");
                String a = scanner.nextLine();
                if((!(a.isBlank())) && map.containsKey(sortWords(a))){
                    String b = sortWords(a);
                    Map outputMap = makeAnagrams((Collection<String>) map.get(b));
                    writeAnagrams(outputMap, output);
                }else{
                    System.out.println("it is not in anagram");
                    counter++;
                }
            }
        } catch (AnagramException a){
            System.out.println(a.getMessage());
        } catch (Exception e){
            System.out.println(e);
            System.exit(1);
        }
    }
}