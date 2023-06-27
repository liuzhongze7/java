package test_10_29;

public class Test_10_29{
    public static void main(String[] args){
    		dog d=new dog("jack","white",300);
    		d.run();
	    	d.eat();
	    	System.out.print("¹·:");
	    	System.out.print(d.name);
	    	System.out.print(d.color);
	    	System.out.print(d.weight);
	    	cat a=new cat("tom","white",50);
	    	a.run();
	    	a.eat();
	    	System.out.print("Ã¨:");
	    	System.out.print(a.name);
	    	System.out.print(a.color);
	    	System.out.print(a.weight);
}
}

	class Animal{
		 public String name;
		 public String color;
		 Animal(String _name,String _color){
		  this.name=_name;
		  this.color=_color;
		 }
		 void eat(){
		     System.out.println(name+"³Ô·¹À²");
		 }
		 
		}
		class dog extends Animal{
		 int weight;
		 dog(String name,String color,int weight){
		  super("name", "color");
		  this.weight=300;
		  }
		 void run(){
		   System.out.println("Ð¡¹·ÔÚÅÜ.....");
		  }
		 
		}
		class cat extends Animal{
		 int weight;
		 cat(String name,String color,int weight){
		  super("name", "color");
		  this.weight=50;
		  }
		 void run(){
		   System.out.println("Ð¡Ã¨ÔÚ½Ð.....");
		  }
		 
		}


