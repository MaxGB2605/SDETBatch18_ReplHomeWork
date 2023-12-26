package org.HomeWork;

public class R126Variables {
    /*
    Create a variable that will hold the count of all instances of the Main class
Create 3 Object of the class and print value of the count variable;
**Expected Output:**
3
     */
  private static int count=0;
  public R126Variables(){
      count++;
  }


    public static void main(String[] args) {
        R126Variables m1=new R126Variables();
        R126Variables m2=new R126Variables();
        R126Variables m3=new R126Variables();
        System.out.println("Created "+count);
    }

    
}
