package exercise;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        if(dayOfWeek==6) {
            System.out.println("Er det fredag?");
            System.out.println("Ja");
        } else {
            System.out.println("Er det fredag?");
            System.out.println("Nej :(");
        }
    }

}
