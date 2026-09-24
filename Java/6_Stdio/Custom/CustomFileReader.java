import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CustomFileReader {
    public static void main(String args[]) {
        FastFileReader fs = new FastFileReader();
        System.out.println(fs.nextWord());
        System.out.println(fs.nextWord());
        System.err.println(fs.nextLine());
        System.out.println();
        while (fs.hasNext()) {
            System.out.println(fs.nextLine());
        }
    }
}

/**
 * FastReader Class:
 * The FastReader combines BufferedReader and StringTokenizer for maximum speed
 * and ease of use.
 */
class FastFileReader {
    BufferedReader reader;
    // The StringTokenizer class in Java is used to break a string into smaller
    // parts called tokens based on specified delimiters.
    StringTokenizer st;

    FastFileReader() {
        while (reader == null) {
            try {
                reader = new BufferedReader(new FileReader("Java/6_Stdio/Custom/file.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    String next(String del) {
        if (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                System.out.println("EOF");
            }
        }

        return st.nextToken(del);
    }

    String nextWord() {
        return this.next(" ");
    }

    String nextLine() {
        return this.next("\n");
    }

    boolean hasNext() {
        if (!this.st.hasMoreElements()) {
            try {
                st = new StringTokenizer(reader.readLine());
            } catch (Exception e) {
                return false;
            }
        }

        return this.st.hasMoreElements();
    }
}