package session13;

public class Recursion {
    public static void countDown(int n){
        while (n >= 0){
            System.out.println(n);
            n = n -1;
        }
    }

    public static void countDownRec(int n){
        // do one unit of work
        if (n < 0) {
            return;
        }else {
            System.out.println(n);
            // make recursive call to do the rest
            countDownRec(n - 1);
        }
    }

    public static int countDownRec1(int n){
        // do one unit of work
        if (n < 0) {
            return 0;
        }else {
            System.out.println(n);
            int next = n-1;
            // make recursive call to do the rest
            int rest = countDownRec1(next);
            return  n + rest;
        }
    }


    public static void countUp(int n){
        for (int i = 0; i <= n; i++){
            System.out.println(i);
        }
    }

    public static void countUpRec(int n){
        if (n < 0) {
            return;
        }else {
            System.out.println("hiii" + n);
            countUpRec(n-1); // only loops in the function first then else
            System.out.println(n);
        }
    }

    public static int factorial(int n){
        //base case
        if (n < 0){
            return -1;
        }else if (n == 0){
            return 1;
        }else if (n ==1){
            return 1;
            // recursion case
        }else{
            int next = n-1;
            int rest = factorial(next);
            return n * rest;
        }
    }

    public static int Fibonacci(int n){
        //base case
        if (n <= 0){
            return -1;
        }else if (n == 1){
            return 0;
        }else if (n == 2){
            return 1;
            // recursion case
        }else{
//            int next = n-1;
            int fn_1 = Fibonacci(n-1);
            int fn_2 = Fibonacci(n-2);
//            int rest = Fibonacci(next) + Fibonacci(next - 1) ;
            return fn_1 + fn_2;
        }
    }

    public static boolean search (int [] array, int target) {
        for(int value :array){
            if (value == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        countDownRec(10);
//        countUpRec(10);
//        System.out.println(countDownRec1(10));
//        System.out.println(factorial(5));
//        countDownRec(20000); blow up the stack
//        for ( int i = 0; i < 20; i ++){
//            int fn = Fibonacci(i);
//            System.out.println("fibonacci(" + i + ") = " + fn);
//        }
//        int [] testArray = {0,1,2,3,4,5};
//        countUpRec(12346765); /// this would blow up the stack!
//        System.out.println(search(testArray, 4));
//        countUpRec(10);
//        countDownRec(10);
//        System.out.println("Second countDown");
//        countDownRec1(10);
        System.out.println("CountUp");
        countUpRec(10);
    }
}
