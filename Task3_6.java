import java.util.*;

class Task3_6 {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

        Integer[] idx = new Integer[n];

        for(int i = 0; i<n; i++){
            idx[i] = i;
        }

        Arrays.sort(idx, (a,b) -> heights[b] - heights[a]);

        String[] result = new String[n];
        for(int i =0; i<n; i++){
            result[i] = names[idx[i]];
        }
        return result;
    }
    
    public static void main(String[] args) {
    	int n;
    	Scanner sc = new Scanner(System.in);
    	
    	n = sc.nextInt();
    	
    	String[] a = new String[n];
    	
    	int[] b = new int[n];
    	
    	for(int i =0; i<n; i++) {
    		a[i] = sc.next();
    		b[i] = sc.nextInt();
    	}
    	
    	System.out.println(sortPeople(a,b));
    }
}