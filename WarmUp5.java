
import java.io.*;
import java.util.ArrayList;

public class WarmUp5{

    public static void main(String[] args) {

        ArrayList<String> dictionary = new ArrayList<>();
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/lilia/OneDrive/Desktop/dictionary.txt"));
            while ((line = br.readLine()) != null) {
                dictionary.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SortingArrayList(dictionary);

    }

    public static void SortingArrayList(ArrayList<String> list) {
        ArrayList<Integer> lengthOfString = new ArrayList<Integer>();
        ArrayList<String> sortedList = new ArrayList<>();


        for (String j : list) {
            int length = j.length();
            lengthOfString.add(length);
        }

        java.util.Collections.sort(lengthOfString);

        for (Integer i : lengthOfString) {
            for (int n = 0; n < list.size(); n++) {
                String word = list.get(n);
                int lengthOfWord = word.length();
                if (i == lengthOfWord) {
                    sortedList.add(list.get(n));
                    list.remove(n);
                }


            }
        }

        System.out.println(sortedList.size());
    }
}