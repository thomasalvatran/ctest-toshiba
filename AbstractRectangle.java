abstract class Shape{
   final int b = 20;
   public void display(){
     System.out.println("This is display method");
   }
   abstract public void calculateArea();
}

class AbstractRectangle extends Shape{
   public void calculateArea(){ System.out.println("calculateArea");}
   public static void main(String args[]){
      AbstractRectangle obj = new AbstractRectangle();
      obj.display();
      obj.calculateArea();
      //obj.b=200; cannot assign because it is final
  }
}

