package JAVA.OOPS;

class complex {
	double  re;
    double im;
	
	public complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	//copy constructor
	complex(complex c) {
		System.out.println("Copy constructor called");
		re = c.re;
		im = c.im;
	}
	//Overrding the toString of Object class
	@Override
	public String toString() {
		return "(" + re + " + " + im + "i)";
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		complex c1 = new complex(10, 20);
		
		// Following involves a copy constructor call
		complex c2 = new complex(c1);
		
		complex c3 = c2;
		System.out.println(c2);
	}
}
