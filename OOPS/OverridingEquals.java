package JAVA.OOPS;

class Complex {
	private double re, im;
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(!(o instanceof complex)) {
			return false;
		}
		
		complex c = (complex) o;
		return Double.compare(re,  c.re) == 0 && Double.compare(im, c.im) == 0;
	}
}

public class OverridingEquals {

	public static void main(String[] args) {
		complex c1 = new complex(10, 15);
		complex c2 = new complex(10, 15);
		if(c1.equals(c2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
