package JAVA.OOPS;

class Box{
    double width;
    double height;
    double depth;
}

class Box2{         //Adding a Method to the Box Class
    double width;
    double height;
    double depth;

    void Volume()
    {
        System.out.println("Volume is:");
        System.out.println(width * height * depth);
    }
}

class Box3{                //Returning a Value
    double width;
    double height;
    double depth;

    double Volume2()
    {
    
       return width * height * depth;
    }
}

class Box4{                // Adding a Method That Takes Parameters
    double width;
    double height;
    double depth;

    double Volume3()
    {
    
       return width * height * depth;
    }

    void setDim(double w,double h,double d)
    {
        width = w;
        height = h;
        depth = d;
    }
}
public class classAndobject {
    public static void main(String[] args) {
        
    
    System.out.println("---> Class <---");
    System.out.println("The General Form of a Class");
    System.out.println();

    System.out.println("class classname {");
    System.out.println("type instance-variable 1;");
    System.out.println("..type instance-variable N;");
  
    System.out.println("type methodname1(parameter-list){");
    System.out.println("//body of method");
    System.out.println("}");
  
    System.out.println("type methodnameN(parameter-list){");
    System.out.println("//body of method");
    System.out.println("}");
    System.out.println("}");
    
    System.out.println();
    
    System.out.println("class box {");
    System.out.println("double width;");
    System.out.println("double height;");
    System.out.println("double depth;");
    System.out.println("}");
    
    System.out.println("box mybox = new box();");
    System.out.println();

    System.out.println("Example:");

    Box mybox = new Box();
    double vol;

    mybox.width = 10;
    mybox.height = 10;
    mybox.depth = 15;

    vol = mybox.width * mybox.height * mybox.depth;
    System.out.println("Volume is:" +vol);
     System.out.println();

     System.out.println("Example2:");

    Box mybox1 = new Box();
    Box mybox2 = new Box();
    double vol2;

    mybox1.width = 10;
    mybox1.height = 10;
    mybox1.depth = 15;

    mybox2.width = 3;
    mybox2.height = 6;
    mybox2.depth = 9;

    vol2 = mybox1.width * mybox1.height * mybox1.depth;
    System.out.println("Width:" +mybox1.width);
    System.out.println("Height:" +mybox1.height);
    System.out.println("Depth:" +mybox1.depth);
    
    System.out.println("Volume is:" +vol2);
    System.out.println();
   
    vol2 = mybox2.width * mybox2.height * mybox2.depth;
    System.out.println("Width:" +mybox2.width);
    System.out.println("Height:" +mybox2.height);
    System.out.println("Depth:" +mybox2.depth);
    System.out.println("Volume is:" +vol2);
    System.out.println();
   
    System.out.println("Declaring Objects:");
    System.out.println(" Box mybox; // declare reference to object");
    System.out.println("mybox = new Box(); // allocate a Box object");
    System.out.println();

    System.out.println("Assigning Object Reference Variables");
    System.out.println(" Box b1 = new Box();");
    System.out.println(" Box b2 = b1; ");
    System.out.println();

  
    System.out.println("Method:");
    System.out.println("type name(parameter-list) {");
    System.out.println(" // body of method");
    System.out.println("}");
    System.out.println();


    System.out.println(" Adding a Method to the Box Class:");
    System.out.println("Example:");

     Box2 myBox3 = new Box2();
     Box2 myBox4 = new Box2();

     myBox3.width = 10;
     myBox3.height = 20;
     myBox3.depth = 15;

     myBox4.width = 3;
     myBox4.height = 6;
     myBox4.depth = 9;

     myBox3.Volume();
     System.out.println();

     myBox4.Volume();
     System.out.println();

     System.out.println("Returning a Value:");
     System.out.println("Example:");

     Box3 myBox5 = new Box3();
     Box3 myBox6 = new Box3();
     double vol3;

     myBox5.width = 10;
     myBox5.height = 20;
     myBox5.depth = 15;

     myBox6.width = 3;
     myBox6.height = 6;
     myBox6.depth = 9;

     vol3 = myBox5.Volume2();
     System.out.println("Volume is:"+vol3);

     vol3 = myBox6.Volume2();
     System.out.println("Volume is:"+vol3);

     System.out.println();
     System.out.println("Adding a Method That Takes Parameters:");
     System.out.println("int squre (int i)");
     System.out.println("{");
     System.out.println("return i * i;");
     System.out.println("}");
     System.out.println("int x,y;");
     System.out.println("x = square(5);");
     System.out.println("x = squre(6);");
     System.out.println();
     
     System.out.println("Example:");

     Box4 myBox7 = new Box4();
     Box4 myBox8 = new Box4();
     double vol4;

     myBox7.setDim(10, 20, 15);
     myBox8.setDim(3, 6, 9);

     vol4 = myBox7.Volume3();
     System.out.println("Volume is:"+vol4);

     vol4 = myBox8.Volume3();
     System.out.println("Volume is:"+vol4);


}
}
