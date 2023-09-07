package abbreviate_two_words;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String abbrevName = "";

        for (int i = 0; i < name.length(); i++) {
            if(i == 0) {
                abbrevName = String.valueOf(name.charAt(i)).toUpperCase();
            } else if (name.charAt(i-1) == ' ') {
                abbrevName += ("." + name.charAt(i)).toUpperCase();
            }
        }
        System.out.println(abbrevName);
        return abbrevName;
    }

    public static void main(String[] args) {
        abbrevName("Sam Harris");
        abbrevName("Patrick Feenan");
        abbrevName("Evan Cole");
        abbrevName("P Favuzzi");
        abbrevName("David Mendieta");
    }
}
