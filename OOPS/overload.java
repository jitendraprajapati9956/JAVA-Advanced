package JAVA.OOPS;

class Overload{
    void test() {
        System.out.println("No Parameter:");
    }

    void test(int a) {
        System.out.println("a:" +a);
    }

    void test(int a,int b) {
        System.out.println("a and b:"  + a +  "and"  +b);
    }

    
    double test(double a) {
        System.out.println("double a:" +a);
        return a * a;
    }

}
// Automatic type conversion apply to overloading
class Overloads2{
    void test2() {
        System.out.println("No Parameter:");
    }

    void test2(int a,int b) {
        System.out.println("a and b:"  + a +  "and"  +b);
    }

    
    void test2(double a) {
        System.out.println("Inside a(double):" +a);
  
    }

}

public class overload {
    public static void main(String[] args) {
        System.out.println("---> Overloading Method <---");
        System.out.println("Example:");

        Overload ol = new Overload();
        double result;

        ol.test();
        ol.test(10);
        ol.test(10, 20);
        
        result = ol.test(123.25);
        System.out.println("Result:" +result);
        System.out.println();

        System.out.println("Example:");

        Overloads2 ol2 = new Overloads2();
        int i =88;

        ol2.test2();
        ol2.test2(10, 20);

        ol2.test2(i);
        ol2.test2(123.2);

        System.out.println();

    }
}
