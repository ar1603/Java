import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuffReaderStrTokenizer {
    public static void main(String args[]) {
        FastInputReader fs = new FastInputReader();
        System.out.println(fs.nextInt());
        System.out.println(fs.nextInt());
        System.out.println(fs.nextLine());
    }
}

/**
 * FastReader Class:
 * The FastReader combines BufferedReader and StringTokenizer for maximum speed
 * and ease of use. It is widely used in competitive programming.
 */
class FastInputReader {
    BufferedReader reader;
    // The StringTokenizer class in Java is used to break a string into smaller
    // parts called tokens based on specified delimiters.
    StringTokenizer st;

    FastInputReader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    String next(String del) {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return st.nextToken(del);
    }

    int nextInt() {
        return Integer.parseInt(this.next(" "));
    }

    float nextFloat() {
        return Float.parseFloat(this.next(" "));
    }

    String nextLine() {
        return this.next("\n");
    }
}