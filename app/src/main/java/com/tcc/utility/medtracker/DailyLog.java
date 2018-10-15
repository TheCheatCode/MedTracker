package com.tcc.utility.medtracker;

import java.time.*;

/**
 * Created by TCC on 9/25/2018.
 */

public class DailyLog {

    private String log;
    private LocalDate date;

    public DailyLog() {
        date = LocalDate.now();
        log = "";
    }

}
