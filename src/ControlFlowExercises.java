import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

//        //Question 1 part a
//        int i = 5;
//        while(i <= 15){
//            System.out.printf("%s ", i);
//            i++;
//        }

        //Question 1 part b

//        int count = 0;
//        do{
//            if(count%2 == 0){
//                System.out.println(count);
//            }
//            count++;
//        }while(count <= 100);

//        int count2 = 100;
//        do{
//            //if(count2%5 == 0){
//                System.out.println(count2);
//            //}
//            count2-= 5;
//        }while(count2 >= -10);

//        long count3 = 2;
//        do{
//            System.out.println(count3);
//            count3 *= count3;
//        }while(count3 < 1000000);

        //Question 1 part c
//        for(int k = 100; k >= -10; k-= 5){
//            System.out.println(k);
//        }
//
//        for(long l = 2; l < 1000000; l *= l){
//            System.out.println(l);
//        }

        // Question 2
//        int count4 = 1;
//        while(count4 <= 100){
//            if(count4%3 == 0 && count4%5 == 0){
//                System.out.println("FizzBuzz");
//            }
//            else if(count4%3 == 0){
//                System.out.println("Fizz");
//            }
//            else if(count4%5 == 0){
//                System.out.println("Buzz");
//            }
//            else{
//                System.out.println(count4);
//            }
//            count4++;
//        }

        //Question 3
//        Scanner steve = new Scanner(System.in);
//
//        int userInput = 0;
//        String playAgain = "y";
//
//        while(playAgain.equalsIgnoreCase("y")){
//            System.out.print("What number would you like to go to?");
//            userInput = steve.nextInt();
//            System.out.println("Here's Your table! \n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= userInput; i++){
//                System.out.printf(" %s     | %s       | %s    \n", i, i*i, i*i*i);
//            }
//            System.out.println("Would you like to play again?");
//            playAgain = steve.next();
//        }
//
        // Question 4 - grade chekcer

        Scanner steve = new Scanner(System.in);

        int userInput = 0;
        String playAgain = "y";

        while(playAgain.equalsIgnoreCase("y")){
            System.out.print("What is you number grade?");
            userInput = steve.nextInt();
            if(userInput >=0 && userInput  <= 59){
                System.out.println("F");
            }
            else if(userInput >=60 && userInput  <= 66){
                System.out.println("D");
            }
            else if(userInput >=67 && userInput  <= 79){
                System.out.println("C");
            }
            else if(userInput >=80 && userInput  <= 87){
                System.out.println("B");
            }
            else if(userInput >=88 && userInput  <= 100){
                System.out.println("A");
            }
            else{
                System.out.print("Not on the grading scale");
            }

            System.out.println("Would you like to play again?");
            playAgain = steve.next();
        }









    }
}

