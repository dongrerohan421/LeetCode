package final_value_of_variable_after_performing_operations;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] operations = { "--X", "X++", "X++" };
        finalValueAfterOperations(operations);
        finalValueAfterOperations2(operations);
        String[] operations2 = { "++X", "++X", "X++" };
        finalValueAfterOperations(operations2);
        finalValueAfterOperations3(operations2);
        String[] operations3 = { "X++", "++X", "--X", "X--" };
        finalValueAfterOperations(operations3);
    }

    private static int finalValueAfterOperations(String[] operations) {
        int val = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                val += 1;
            } else {
                val -= 1;
            }
        }
        return val;
    }

    private static int finalValueAfterOperations2(String[] operations) {
        int val = 0;
        for (int i = 0; i < operations.length; i++) {
            val = operations[i].charAt(1) == '+' ? ++val : --val;
        }
        return val;
    }

    private static int finalValueAfterOperations3(String[] operations) {
        int val = 0;
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "++X":
                    val++;
                    break;
                case "X++":
                    val++;
                    break;
                case "--X":
                    val--;
                    break;
                case "X--":
                    val--;
                    break;
                default:
                    break;
            }
        }
        return val;
    }
}
