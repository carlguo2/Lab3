import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Functions {
    public static String urlToString(final String url){
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }


    public static void main(final String[] args) {
        //Word Counting
        String urlContent = urlToString("http://erdani.com/tdpl/hamlet.txt");
        int wordCount = 0;
        String[] urlWordCount = urlContent.split("\\s+");
        wordCount = urlWordCount.length;
        System.out.println("word count of document: " + wordCount);

        //Counting One Word
//        String searchWord = "prince";
        //no longer case sensitive
//        String urlContent = urlToString("http://erdani.com/tdpl/hamlet.txt").toLowerCase();
//        int wordFrequency = 0;
//        String[] urlWordFrequency = urlContent.split(searchWord);
//        wordFrequency = urlWordFrequency.length - 1;   // there will be one array w/o search word
//        System.out.println(searchWord + " appears this many times: " + wordFrequency);

    }





}
