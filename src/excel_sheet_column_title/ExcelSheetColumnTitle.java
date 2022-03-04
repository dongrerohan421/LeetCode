package excel_sheet_column_title;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println("1 --> " + convertToTitle(1));
        System.out.println("27 --> " + convertToTitle(27));
        System.out.println("28 --> " + convertToTitle(28));
        System.out.println("203 --> " + convertToTitle(203));
        System.out.println("701 --> " + convertToTitle(701));
    }

    private static String convertToTitle(int columnNumber) {
        StringBuilder builder = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            builder.append((char) ((columnNumber % 26) + 'A'));
            columnNumber /= 26;
        }
        return builder.reverse().toString();
    }
}
