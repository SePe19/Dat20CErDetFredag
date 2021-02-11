package com.example.exercise.services;

import java.util.Calendar;
import java.util.Date;

public class ErDetFredag {
    public String fredagPlease(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        if(dayOfWeek==6) {
            return "Er det fredag?<br>Ja";
        } else {
            return "Er det fredag?<br>Nej";
        }
    }
}
