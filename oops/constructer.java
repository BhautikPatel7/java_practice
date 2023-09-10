package oops;

public class constructer {
    public static void main(String[] args) {
        myemployess2 harry = new myemployess2("my is name",20);
         myemployess2 ram = new myemployess2("my is name");
          myemployess2 kr = new myemployess2();
        // harry.setname("code with harry");
        // harry.setid(10);

        // int x =  harry.getid();
        // String str = harry.getname();
        // System.out.println(x);
        // System.out.println(str);
    }
}
class myemployess2 {
    public myemployess2(String name,int id){
       // id = 454;
      //  name = "my name";
        System.out.println(name);
        System.out.println(id);
    }
    public myemployess2(String name){
       // id = 454;
      //  name = "my name";
        System.out.println(name);
       // System.out.println(id);
    }
    public myemployess2(){
       id = 454;
       name = "my name";
    //     System.out.println(name);
    //     System.out.println(id);
    }

    public myemployess2(myemployess2 m){
        id = m.id;
        name = m.name;
    }
    
    // public myemployess2(){

    // }
  private int id;
  private String name;

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
