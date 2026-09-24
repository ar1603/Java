
/**
 * An InputStreamReader is a bridge from byte streams to character streams.
 * It reads bytes and decodes them into characters using a specified charset.
 * The charset that it uses may be specified by name or may be given explicitly,
 * or the platform's default charset may be accepted.
 * 
 * ready(), close(), read();
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class IpStreamReader {
    /**
     * Function to take the input using the stream reader.
     */
    private static void takeInputUsingInputStreamReader() {

        try {
            InputStreamReader is = new InputStreamReader(System.in);
            int i = is.read();
            while (i == '\n') {
                System.out.println((char) i);
                i = is.read();
            }
            is.close();
        } catch (IOException error) {
            System.out.println(Objects.toString(error));
        }
    }

    public static void main(String args[]) {
        takeInputUsingInputStreamReader();
    }
}
