
import java.io.*;

public class Task4_5 {

    public static String timeConversion(String s) {

        String period = s.substring(8);     
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8);    

        if(period.equals("AM")) {
            if(hour == 12) {
                hour = 0;
            }
        } else { 
            if(hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d", hour) + rest;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String result = timeConversion(s);  

        System.out.println(result);

        br.close();
    }
}
