public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World! ");

      int myFavoriteNumber = 99;
        String myString = "my string";
        System.out.println(myFavoriteNumber);
        System.out.println(myString);

//        myString = 'm';
//
//        myString = 3.14159;
//
//        long myNumber;
//        System.out.println(myNumber);
////        not initialized
//
//        long myNumber = 3.14159;
//        decimal place error of incompatible types

//        myNumber = 123L; can not use L in place of original long notation.
        long myNumber = 123L;
        System.out.println(myNumber);

//        int x =5;
//        System.out.println(x++); prints out 5
//        System.out.println(x);
//
//        int x =5;
//        System.out.println(++x);prints out 6
//        System.out.println(x);
//

//        String theNumberThree = "three";
//        object o = theNumberThree;
////        int three = (int) o;

//        int x = 4;
//        x = x + 5;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y = y * x;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
////        x = x / y;
//        x /= y;
//        y = y - x;
//        y -= x;

        int reallyBigNumber = 2134567890;
//        int reallyBigNumber2 = 12345678900987654321; too big to hold
        int increReallyBigNumber = 2134567890;
        ++increReallyBigNumber;
        System.out.println(increReallyBigNumber);



    }
}
