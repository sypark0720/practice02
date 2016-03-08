package prob5;

public abstract class AbstractClass {
	   private int a;
	   private int b;
	   
	   void setValue(int a, int b){
		   this.a=a;
		   this.b=b;
	   }
	   
	   abstract public void calculate(int a, int b);
}
