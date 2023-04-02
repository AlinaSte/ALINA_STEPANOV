package org.example.homework_nr_4_1;

import java.util.Scanner;

public class Clock {
    int h;
    int m;
    int s;

    public Clock() {
        this.h = 12;
        this.m = 0;
        this.s = 0;
      }
    public Clock(int newS) {
      h=newS/3600;
      m=newS % 3600 / 60;
      s=newS % 60;
      }
    public Clock(int newH, int newM, int newS) {
        if (newH >= 0 && newH <= 23) {
            this.h = newH;
        } else {
            setHours(newH);
        }
        if (newM >= 0 && newM < 60) {
            this.m = newM;
        } else {
            setMinutes(newM);
        }
        if (newS >= 0 && newS < 60) {
            this.s = newS;
        } else {
            setSeconds(newS);
        }
    }
    void setHours(int newH) {
        h = newH;
        if (h >= 0 && h <= 23) {
            h = 0;
        } else {h = newH % 24;}
    }
    public void setMinutes(int newM) {
        m = newM;
        if (m >= 0 && m <= 59) {
            m = 0;
        } else {m = newM % 60;}
    }

    public void setSeconds(int newS) {
        s = newS;
        if (s >= 0 && s <= 59) {
            s = 0;
        }else {s = newS % 60;}
    }

    public int getHours() {
        return h;
    }

    public int getMinutes() {
        return m;
    }

    public int getSeconds() {
        return s;
    }

    public String toString() {
        return h + ":"+m+":"+s;
    }
    public void tick() {
        s = s + 1;
        if (s >= 59) {
            m++;
            s = 0;
        }
        if (m >= 59) {
            h++;
            m = 0;
        }
        if (h >= 24) {
            h = 0;
        }
    }
    public void tickDown() {
        s = s - 1;
        if (s < 0) {
            m--;
            s = 59;
        }
        if (m < 0) {
            h--;
            m = 59;
        }
        if (h < 0) {
            h = 23;
        }
    }


}

