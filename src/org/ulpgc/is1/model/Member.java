package org.ulpgc.is1.model;

public class Member extends Customer {
public int points;
public Member(String n, String su, String add, int c, int ca, String cit){
    super(n,su,add,c,ca,cit);
    this.points = 0;
}
public void setPoints(int p){
    this.points = p;
}
public int getPoints(){
    return points;
}
}
