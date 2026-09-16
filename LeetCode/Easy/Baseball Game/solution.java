class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            String current = operations[i];

            if (current.equals("C")) {
                stack.pop();
            }
            else if (current.equals("D")) {
                int a = stack.peek();
                stack.push(2 * a);
            }
            else if (current.equals("+")) {
                int last = stack.pop();
                int slast = stack.peek();

                stack.push(last);
                stack.push(last + slast);
            }
            else {
                stack.push(Integer.parseInt(current));
            }
        }

        int sum = 0;

        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}