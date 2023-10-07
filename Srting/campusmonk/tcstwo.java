package Srting.campusmonk;

public class tcstwo {
    public static void main(String[] args) {
        String barcode = "12ab";
        int maxAsciiDigit = -1;

        for (int i = 0; i < barcode.length(); i++) {
            char c = barcode.charAt(i);
            int asciiValue = (int) c;

            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                if (digit > maxAsciiDigit) {
                    maxAsciiDigit = digit;
                }
            }
        }

        if (maxAsciiDigit != -1) {
            System.out.println("Maximum ASCII digit value: " + maxAsciiDigit);
        } else {
            System.out.println("No digits found in the barcode.");
        }

    }
}
