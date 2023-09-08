package fizz_buzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(int n){
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                answer.add("FizzBuzz");
            }else if (i % 3 == 0){
                answer.add("Fizz");
            }else if (i % 5 == 0){
                answer.add("Buzz");
            }else {
                answer.add(String.valueOf(i));
            }
        }
        System.out.println(answer);
        return answer;
    }
    
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(3);
        fizzBuzz.fizzBuzz(5);
        fizzBuzz.fizzBuzz(15);
    }
}
