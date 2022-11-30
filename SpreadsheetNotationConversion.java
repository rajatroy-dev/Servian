public class SpreadsheetNotationConversion {
    public static String getSpreadsheetNotation(long n) {
        if (n <= 26) {
            return "1" + String.valueOf((char) (64 + n));
        }

        int rowNumber = (int) (n / 702);
        int columnNumber = (int) (n % 702);

        if (columnNumber == 0) {
            return rowNumber + "ZZ";
        }

        int nthInteration = columnNumber / 26;

        int mod = columnNumber % 26;
        mod = mod == 0 ? 26 : mod;
        if (nthInteration == 0) {
            return rowNumber + 1 + String.valueOf((char) (64 + mod));
        }

        // columnNumber - (nthInteration * 26)
        return rowNumber + 1 + String.valueOf((char) (64 + nthInteration)) + String.valueOf((char) (64 + mod));
    }

    public static void main(String[] args) {
        System.out.println(getSpreadsheetNotation(1482));
    }
}
