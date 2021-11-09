import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOne {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < n; i++) {
            
            String lineIn = in.nextLine();
            String[] strArr = lineIn.split("\\s");
            
            ArrayList<Integer> intList = new ArrayList<Integer>();
            
            for(int j = 1; j < strArr.length; j++) {
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
