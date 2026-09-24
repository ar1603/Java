import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The BufferedReader class in Java helps read text efficiently from files or
 * user input.
 * It stores data in a buffer, making reading faster and smoother instead of
 * reading one character at a time.
 * - Faster Reading: Reads large chunks of data at once, reducing the number of
 * read operations.
 * - Easy to Use: Can read text line by line using the readLine() method.
 * 
 * read(), readLine(), ready();
 */

public class BufferedIpReader {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Cannot read more than a character, but faster as it uses Buffer.
        int a = br.read();
        String s = br.readLine();

        System.out.println(a - '0');
        System.out.println(s);
    }
}
