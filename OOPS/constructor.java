package JAVA.OOPS;

class box{                //Constructor
    double width;
    double height;
    double depth;

    box()
    {
       System.out.println("Constructing Box");
       width = 10;
       height = 10;
       depth = 10;
    }
   double Volume()
    {
    
       return width * height * depth;
    }
}

class box2{                // Parameterized Constructor
    double width;
    double height;
    double depth;

    box2(double w, double h, double d)
    {
       width = w;
       height = h;
       depth = d;
    }
   double Volume2()
    {
    
       return width * height * depth;
    }
}


class box3{                //  Overloading	Constructors
    double width;
    double height;
    double depth;

    box3(double w, double h, double d)
    {
       width = w;
       height = h;
       depth = d;
    }

    box3() {
        width = -1;
        height = -1;
        depth = -1;
    }

    box3(double len) {
        width = height = depth = len;
    } 
   double Volume3()
    {
       return width * height * depth;
    }
}

class Test {                // Using Objects	as	Parameters
    int a,b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
         }
         else{
            return false;
         }
    }
}

class box4{                //  Using Objects	as	Parameters
    double width;
    double height;
    double depth;

    box4(box4 ob)
    {
       width = ob.width;
       height = ob.height;
       depth = ob.depth;
    }

    box4(double w, double h, double d)
    {
       width = w;
       height = h;
       depth = d;
    }
    box4() {
        width = -1;
        height = -1;
        depth = -1;
    }

    box4(double len) {
        width = height = depth = len;
    } 
   double Volume4()
    {
       return width * height * depth;
    }
}
public class constructor {
    public static void main(String[] args) {
        System.out.println("---> Constructor <---");
        System.out.println("Example");
        System.out.println();
    
        box mybox1 = new box();
        box mybox2 = new box();
        double vol;

        
        vol = mybox1.Volume();
        System.out.println("Volume is" +vol);

        vol = mybox2.Volume();
        System.out.println("Volume is:" +vol);
        System.out.println();

        System.out.println("Parameterized Constructors:");
        System.out.println("Example:");
        System.out.println();
    
        box2 mybox3 = new box2(10, 20,15);
        box2 mybox4 = new box2(3,6,9);
        double vol2;

        vol2 = mybox3.Volume2();
        System.out.println("Volume is:" +vol2);
    
        vol2 = mybox4.Volume2();
        System.out.println("Volume is:" +vol2);
        System.out.println();

        System.out.println(" The this Keyword:");
        System.out.println("box (double w, double h, double d) {");
        System.out.println("this.width = w;");
        System.out.println("this.height = h;");
        System.out.println("this.depth = d;");
        System.out.println("}");
        System.out.println();
    
        System.out.println(" Overloading Constructors");
        System.out.println("Example:");
 
        box3 mybox5 = new box3(10,20,15);
        box3 mybox6 = new box3();
        box3 mybox7 = new box3(7);
        double vol3;

        vol3 = mybox5.Volume3();
        System.out.println("Volume mybox5 is:" +vol3);
       
        
        vol3 = mybox6.Volume3();
        System.out.println("Volume mybox6 is:" +vol3);
        
        vol3 = mybox7.Volume3();
        System.out.println("Volume mybox7 is:" +vol3);
        System.out.println();
    

        System.out.println(" Using Objects as Parameters");
        System.out.println("Example:");

        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("ob1 == ob2: " +ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " +ob1.equalTo(ob3));
        System.out.println();
    
        System.out.println("Example2:");

        box4 mybox8 = new box4(10,20,15);
        box4 mybox9 = new box4();
        box4 mycube = new box4(7);
       
        box4 myclone = new box4(mybox8);  //copy
       
        double vol4;

        vol4 = mybox8.Volume4();
        System.out.println("Volume mybox8 is:" +vol4);
    
        vol4 = mybox9.Volume4();
        System.out.println("Volume mybox9 is:" +vol4);
    
        vol4 = mycube.Volume4();
        System.out.println("Volume cube is:" +vol4);
    
        vol4 = myclone.Volume4();
        System.out.println("Volume clone is:" +vol4);
        System.out.println();
    



    }
    
}
