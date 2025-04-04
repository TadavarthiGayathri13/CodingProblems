//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = (int)i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.firstRepeated(arr));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        
        // Traverse from end to start to track first repeating from front
        int index = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (seen.contains(arr[i])) {
                index = i;
            } else {
                seen.add(arr[i]);
            }
        }

        return index == -1 ? -1 : index + 1;
    }
    }

