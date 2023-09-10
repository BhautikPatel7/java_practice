package oops;

import java.util.*;

public class accesmodifire {
  public static void main(String[] args) {
    myemployess john = new myemployess();
    // john.setname("I am john");
    // System.out.println(john.getname());
    circle cr = new circle();
    cr.setarea(50);
    cr.getarea();

  }
}

class myemployess {
  protected int id;
  protected String name;

  public String getname() {
    return name;

  }

  public void setname(String n) {
    name = n;
  }

  public int getid() {
    return id;
  }

  public int setid(int i) {
    i = id;
    return i;

  }
}

class circle {
  private int area;
  private int permiti;

  public int setarea(int length) {
    int area = (int) (Math.PI * (length * length));
    // System.out.println(area);
    this.area = area;
    return area;
  }

  public void getarea() {
    System.out.println(area);
  }
}