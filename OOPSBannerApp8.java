import java.util.HashMap;

public class OOPSBannerApp8 {

    /**
     * Creates HashMap containing ASCII patterns
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for O
        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for P
        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // Pattern for S
        charMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return charMap;
    }

    /**
     * Displays banner message
     */
    public static void displayBanner(String message,
                                     HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                if (pattern != null) {
                    sb.append(pattern[line]).append(" ");
                }
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap =
                createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}