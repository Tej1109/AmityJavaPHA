package Module1;
/*
Write a program that uses a while loop to find the sum of all even numbers between 1 and 50.
 */

public class PHA_M1_Q7 {
    public  static  void main(String[] args){
        int num = 1;
        int sumEven = 0;
        while (num <= 50) {
            if (num % 2 == 0){
                sumEven +=  num;
            }
            num++;
        }
        System.out.println("The sum of even numbers from 1 to 50 is : "+sumEven);
    }
}
