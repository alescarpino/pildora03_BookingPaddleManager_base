package org.ulpgc.is1.model;

public class Date {
public int day;
public int month;
public int year;
public String date;

public Date(int d,int m, int y){
    this.date = String.valueOf(d) + String.valueOf(m)+String.valueOf(y);
}
}
