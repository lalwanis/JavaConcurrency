import java.util.Scanner;
/*
class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }


}
class myCalculator{

    public  int  power(int n,int p) throws Exception{
        if(n >=0 && p>=0){
            return new Double(Math.pow(n,p)).intValue();
        }else {
            throw new Exception("n and p should be non-negative");
        }
    }
    for (int i = 1;i<=inp;i++){
           if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }

            else{
                System.out.println(i);
            }

        }
}
*/


import java.io.*;
import java.util.*;
import java.util.concurrent.Exchanger;
/*
public class Solution {


    public static void main(String[] args) {

        try {


            Scanner s = new Scanner(System.in);

            StringBuilder strBuilder = new StringBuilder();
            String line = "";


            while (s.hasNext()) {
                strBuilder.append(s.next()).append(" ");
            }
            s.close();

            String inp = strBuilder.toString();


            StringBuilder formatted = new StringBuilder();
            int scriptBegin = inp.indexOf("<script");
            formatted.append(inp.substring(0, scriptBegin));
            int scriptEnd = inp.indexOf("</script>");
            formatted.append(inp.substring(scriptEnd + 9, inp.length()));


            System.out.println(formatted);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}*/


import java.io.*;
import java.util.*;
public class Solution {

    // You DO NOT need to make any changes to the main function
    // which handles the input for your convenience.
    // Implement the validation logic in the "Solve" function
    // By writing the appropriate code

    public static void main(String args[] ) throws Exception {
        // This code processes the input from STDIN
        // This can be left as is
        Scanner in = new Scanner(System.in);
        // Read in the number of tests
        int t = Integer.parseInt(in.nextLine());
        for(int i = 0; i < t; i++){
            // Read the credit card number
            // The function Solve return 'Yes' or 'No'
            // depending on whether or not the Credit Card number is valid
            System.out.println(Solve(in.nextLine()));
        }
    }

    // This is the function you need to write the code for
    // The card number with 16 digits is the parameter provided
    // Return Yes or No depending on whether it is valid or not.
    private static String Solve(String card){
        // Return the String "Yes" or "No" depending on whether
        // the card number is valid or not
        StringBuilder cardBuild = new StringBuilder(card).reverse();
        char[] revArray = cardBuild.toString().toCharArray();
        int A = 0;
        int j = 0;
        for(int i =0;i<revArray.length;i++){
            if(j<revArray.length && j%2==0) {
                A = A + revArray[j];
                j=j+1;
            }
        }

        List<Integer> evenList = new ArrayList<>();
        j = 1;
        for(int i =0;i<revArray.length;i++){
            if(j<revArray.length && j%2!=0) {
                evenList.add(Character.getNumericValue(revArray[j]) * 2);
                j = j+2;
            }
        }
        List<Integer> modifiedEvenList = new ArrayList<>();
        for(int i : evenList){
            if(i>=10){
                String d = String.valueOf(i);
                char[] gt = d.toCharArray();
                int added = 0;
                for(int k=0;k<gt.length;k++){
                    added = added+Character.getNumericValue(gt[k]);
                }
                modifiedEvenList.add(added);
            }
            else{
                modifiedEvenList.add(i);
            }
        }
        int B = 0;
        for (int a :modifiedEvenList){
            B = B+a;
        }


        int C = B+A;
        if (C%10==0){
            return  "Yes";

        }
        else {
            return  "No";
        }


    }
}