package math.fizzbuzz;

public class MySolution {
    public String[] fizzBuzz(int A) {
        String[] result = new String[A];
        for (int i = 1; i <= A; i++) {
            if (i % 15 == 0) {
                result[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                //or result[i - 1] = Integer.toString(i);
                result[i - 1] = "" + i;
            }
        }

        return result;
    }
}
