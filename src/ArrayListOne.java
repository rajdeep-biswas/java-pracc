import java.util.ArrayList;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-arraylist/problem
public class ArrayListOne {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        // An ArrayList of ArrayList of Integers
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < n; i++) {
            
            String lineIn = in.nextLine();
            
            // This is how we do a String.split() in Java (it takes regex).
            String[] strArr = lineIn.split("\\s");
            
            // An ArrayList of Integers
            ArrayList<Integer> intList = new ArrayList<Integer>();
            
            // This starts from 1 because of the stupid problem spec
            for(int j = 1; j < strArr.length; j++) {
            	System.out.println("Here: " + strArr[j]);
                intList.add(Integer.parseInt(strArr[j]));
            }
            
            arr.add(intList);
        }
        
        n = in.nextInt();
        in.nextLine();
        
        int x, y;
        for(int i = 0; i < n; i++) {
            x = in.nextInt();
            y = in.nextInt();
            
            if(x > arr.size() || y > arr.get(x - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(arr.get(x - 1).get(y - 1));
            }
        }
        
        in.close();
    }
 
}
