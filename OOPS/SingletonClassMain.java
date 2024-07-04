package JAVA.OOPS;


public class SingletonClassMain {

	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		obj1.message("Jitendra");
		obj2.message("Prajapati");
	}
}
