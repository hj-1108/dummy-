/*
 * OOPSBannerApp UC5
 * Render OOPS as Banner using Inline Array Initialization
 */

public class OOPSBannerApp5 {

    public static void main(String[] args) {

        // Inline declaration + initialization using String.join()
        String[] lines = {

            String.join("   ", " *** ", " *** ", "**** ", " ****"),
            String.join("   ", "*   *", "*   *", "*   *", "*    "),
            String.join("   ", "*   *", "*   *", "*   *", "*    "),
            String.join("   ", "*   *", "*   *", "**** ", " *** "),
            String.join("   ", "*   *", "*   *", "*    ", "    *"),
            String.join("   ", "*   *", "*   *", "*    ", "    *"),
            String.join("   ", " *** ", " *** ", "*    ", "**** ")
        };

        // Enhanced for-each loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}