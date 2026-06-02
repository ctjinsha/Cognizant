public class OperatorPrecedence {
    public static void main(String[] args) {
        
        int result1 = 10 + 5 * 2;
        System.out.println("Expression 1: 10 + 5 * 2");
        System.out.println("Result: " + result1);
        System.out.println("Explanation: Multiplication (*) has higher precedence than addition (+).");
        System.out.println("Evaluation: 5 * 2 = 10, then 10 + 10 = 20.\n");

       
        int result2 = (10 + 5) * 2;
        System.out.println("Expression 2: (10 + 5) * 2");
        System.out.println("Result: " + result2);
        System.out.println("Explanation: Parentheses () have the highest precedence, overriding standard order.");
        System.out.println("Evaluation: (10 + 5) = 15, then 15 * 2 = 30.\n");

        // Example 3: Left-to-Right Associativity
        int result3 = 20 / 5 * 2;
        System.out.println("Expression 3: 20 / 5 * 2");
        System.out.println("Result: " + result3);
        System.out.println("Explanation: Division (/) and Multiplication (*) share the same precedence level.");
        System.out.println("Evaluation: Because they share precedence, Java evaluates them left-to-right. 20 / 5 = 4, then 4 * 2 = 8.\n");
        
      
        int result4 = 10 + 15 / 5 * 2 % 3;
        System.out.println("Expression 4: 10 + 15 / 5 * 2 % 3");
        System.out.println("Result: " + result4);
        System.out.println("Explanation: /, *, and % have the same precedence and are evaluated left-to-right. Finally, + is evaluated.");
        System.out.println("Evaluation: ");
        System.out.println("  1. 15 / 5 = 3");
        System.out.println("  2. 3 * 2 = 6");
        System.out.println("  3. 6 % 3 = 0");
        System.out.println("  4. 10 + 0 = 10");
    }
}
