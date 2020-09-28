package math.fizzbuzz.java.lightweight;

import java.util.ArrayList;

public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> a = new ArrayList<String>();
        for(int i=0; i<A; i++) a.add(Integer.toString(i+1));
        for(int i=3; i<=A; i+=3) a.set(i-1,"Fizz");
        for(int i=5; i<=A; i+=5) a.set(i-1,"Buzz");
        for(int i=15; i<=A; i+=15) a.set(i-1,"FizzBuzz");
        return a;
    }
}
