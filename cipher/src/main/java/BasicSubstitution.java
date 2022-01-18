import java.util.ArrayList;
import java.util.List;

public class BasicSubstitution {

    private final String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","non"};

    public String encodeMessage(String message, int offsetValue) {
        String encodedMessage = "";

        for (int i = 0; i < message.length(); i++) {
            int letterIndex;
            for (int j = 0; j < alphabet.length; j++) {
                String letter = alphabet[j];
                if (letter.equalsIgnoreCase(message.substring(i, i+1))) {
                    String newLetter = alphabet[(j + offsetValue) % 26];
                    encodedMessage = encodedMessage + newLetter;
                    break;
                } else if (letter.equals("non")) {
                    encodedMessage = encodedMessage + message.substring(i, i+1);
                }
            }
        }

        return encodedMessage;
    }

}
