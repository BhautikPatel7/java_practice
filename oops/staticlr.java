package oops;

public class staticlr {
    public static void main(String[] args) {
        collage s1 = new collage(1, "Rahul");
        collage s2 = new collage(2, "Mitul");
        s1.display();
        s2.display();
    }
}
// Problem Without Static

// IN Collage there has 500 student which name and rollnum is Change BUt collage never gonna change So making Static Its Always returns Static variable

class collage{
    int rollnum = 5; // INstance variable
    String name;
    static String collagename = "GIT"; // Satic variable

    collage(int rollnum,String name){
        this.rollnum = rollnum;
        this.name = name;
    }
    void display(){
        System.out.println(rollnum +" "+ name + " " + collagename);
    }
}

//its not crete every time new memory xpace just refrence it 

//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
class Counter{  
int count=0;//will get memory each time when the instance is created  
  
Counter(){  
count++;//incrementing value  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//Creating objects  
Counter c1=new Counter();  
Counter c2=new Counter();  
Counter c3=new Counter();  
}  
} 



