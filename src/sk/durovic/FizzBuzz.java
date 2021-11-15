package sk.durovic;

public class FizzBuzz {
    private String Fizz = "Fizz";
    private String Buzz = "Buzz";

    public void getNumbers() {

        for (int i = 1; i <= 100; i++) {
            String result = String.valueOf(i);

            if (i % 3 == 0 && i % 5 == 0)
                result = "FizzBuzz";
            else if (i % 3 == 0)
                result = "Fizz";
            else if (i % 5 == 0)
                result = "Buzz";

            System.out.println(result);
        }
    }
}
