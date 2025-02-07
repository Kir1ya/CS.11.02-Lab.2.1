public class Main {

    public static void main(String[] args) {
        int resultOne = add(5, 6);
        System.out.println(resultOne);
        String introduction = morningGreeting("Jason");
        System.out.println(introduction);
        String introduction2 = afternoonGreeting("Maxwell");
        System.out.println(introduction2);
        String tripling = triple("Joe Biden");
        System.out.println(tripling);
        double resultTwo = half(8);
        System.out.println(resultTwo);
        int resultThree = roundPositiveValueToNearestInteger(9.4);
        System.out.println(resultThree);
        int resultFour = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(resultFour);
    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(add(a, b), add(c, d));
    }

    // 3. morningGreeting
    public static String morningGreeting(String person) {
        return "早上好, " + person + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String person) {
        return "下午好, " + person + "!";
    }

    // 5. triple
    public static String triple(String base) {
//        base.repeat(3);
        return base + base + base; //ask jesus
    }

    // 6. half
    public static double half(int number) {
        return number / 2.0; //int divided by double means it has to output double
        // return (double) number/2; is alternative solution
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double rounding) {
        int output = (int) (rounding + 0.5);
        // use math logic and realize that adding 0.5 will give nearest integer
        return output;
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double rounding) {
        int output = (int) (rounding - 0.5);
        //same as above but negative numbers
        return output;
    }
}
