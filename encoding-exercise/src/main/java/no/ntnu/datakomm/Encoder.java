package no.ntnu.datakomm;

/**
 * The encoder for exercise in IDATA2304. Your task is to implement the missing functions according to the protocol.
 */
public class Encoder {
    /*
     * TODO - describe the protocol
     */

    /**
     * A dummy help-printer. You should not run this method. Run unit tests instead!
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is the encoding exercise, used in the course IDATA2304!");
        System.out.println("You can run the unit tests by either executing `mvn test` in the terminal, or");
        System.out.println("right click on the src/test/java and choose Run 'All tests'");
    }

    /**
     * An encoding function. Takes in a "plaintext message", returns a bit array
     *
     * @param message A message where each character can only be one of the following:
     *                - lowercase letters a-z
     *                - uppercase letters A-Z
     *                - digits 0-9
     *                - space ' '
     *                - comma ','
     *                - period '.'
     *                - exclamation mark '.'
     * @return The message encoded as a bit stream according to the protocol described above
     * each bit must be represented as one character in a string. For example, if the result is 10101011,
     * return the string "10101011"
     * If the input message is null or an empty string, return null
     * If the input message is an empty string, return empty string
     * @throws IllegalArgumentException If the message contains an illegal character (for example, Å, -, [, etc)
     */
    public static String encode(String message) throws IllegalArgumentException {
        // TODO - implement this function
        throw new UnsupportedOperationException("Feature not implemented");
    }

    /**
     * Read a binary signal (ones and zeroes), decode it to a human-readable message.
     * Inverse function for encode(m). When implemented correctly, decode(encode(m)) == m
     *
     * @param binarySignal The signal in a binary format, consisting of ones and zeroes, as a string. For example,
     *                     binary 10101011 will be represented as a string "10101011".
     *                     Constraints for the input data:
     *                     - Each character in the binarySignal must be either '0' or '1', no other values allowed
     *                     - The binarySignal must always consist of 8-character blocks, where each block will be
     *                     translated to one character in the decoded message. For example,
     * @return Decoded message, as a string.
     * If the binarySignal is null, return null.
     * If the binarySignal is an empty string, return empty string
     * @throws IllegalArgumentException If the format for binarySignal is invalid
     */
    public static String decode(String binarySignal) throws IllegalArgumentException {
        // TODO - implement this function
        throw new UnsupportedOperationException("Feature not implemented");
    }
}