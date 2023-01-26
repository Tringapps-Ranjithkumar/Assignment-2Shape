package org.example;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class ShapeAndDim{
    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static final String TRIANGLE= "TRIANGLE";
    private static final String RECTANGLE = "RECTANGLE";
    private static final String CIRCLE = "CIRCLE";
    String typeOfShape;
    double length;
    double breadth;
    double radius;
    double side1;
    double side2;
    double side3;
    double base;
    double height;
    static final float PI = 3.14f;
    ShapeAndDim(float a,float b){
        length=a;
        breadth=b;
    }
    ShapeAndDim(float b1, float h1, float s1, float s2, float s3){
        base=b1;height=h1;side1=s1;side2=s2;side3=s3;
    }
    ShapeAndDim(float r){
        radius=r;
    }
    public double perimeter(String s){
        if((s.toUpperCase()).equals(TRIANGLE)){
            return (side1+side2+side3);
        }
        else if((s.toUpperCase()).equals(RECTANGLE)){
            return (2*(length+breadth));
        }
        else if((s.toUpperCase()).equals(CIRCLE)){
            return (2*PI*radius);
        }
        return 0.0;
    }
    public double area(String s){
        if((s.toUpperCase()).equals(TRIANGLE)){
            return (0.5*base*height);
        }
        else if((s.toUpperCase()).equals(RECTANGLE)){
            return (length*breadth);
        }
        else if((s.toUpperCase()).equals(CIRCLE)){
            return (PI*radius*radius);
        }
        return 0.0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        LOGGER.log(Level.INFO,"Please enter the shape for which you want to find Area and Perimeter");
        String op=sc.next();
        if((op.toUpperCase()).equals(RECTANGLE)){
            LOGGER.log(Level.INFO,"Enter the length of the Rectangle");
            float l=sc.nextFloat();
            LOGGER.log(Level.INFO,"Enter the breadth of the Rectangle");
            float b=sc.nextFloat();
            String z=String.format("Select the Below required option\n1.Perimeter\n2.Area\n3.Both");
            LOGGER.log(Level.INFO,z);
            int option=sc.nextInt();
            if(option==1){
                ShapeAndDim figure=new ShapeAndDim(l,b);
                double pm=figure.perimeter("rectangle");
                LOGGER.log(Level.INFO,"The perimeter of the Rectangle is-----"+pm);
            }
            else if(option==2){
                ShapeAndDim figure=new ShapeAndDim(l,b);
                double ar=figure.area("rectangle");
                LOGGER.log(Level.INFO,"The Area of the Rectangle is-----"+ar);
            }
            else if(option==3){
                ShapeAndDim figure=new ShapeAndDim(l,b);
                double pm=figure.perimeter("rectangle");
                LOGGER.log(Level.INFO,"The perimeter of the Rectangle is-----"+pm);
                ShapeAndDim figure1=new ShapeAndDim(l,b);
                double ar=figure1.area("rectangle");
                LOGGER.log(Level.INFO,"The Area of the Rectangle is-----"+ar);
            }
            else{
                LOGGER.log(Level.INFO,"Oh! choose the correct option");
            }
        }
        else if((op.toUpperCase()).equals(TRIANGLE)){
            LOGGER.log(Level.INFO,"Enter the base of the Triangle");
            float b1=sc.nextFloat();
            LOGGER.log(Level.INFO,"Enter the height of the Triangle");
            float h1=sc.nextFloat();
            LOGGER.log(Level.INFO,"Enter the three sides of the Triangle");
            float s1=sc.nextFloat();
            float s2=sc.nextFloat();
            float s3=sc.nextFloat();
            String z=String.format("Select the Below required option\n1.Perimeter\n2.Area\n3.Both");
            LOGGER.log(Level.INFO,z);
            int option=sc.nextInt();
            if(option==1){
                ShapeAndDim figure=new ShapeAndDim(b1,h1,s1,s2,s3);
                double pm1=figure.perimeter("Triangle");
                LOGGER.log(Level.INFO,"The perimeter of the Triangle is-----"+pm1);
            }
            else if(option==2){
                ShapeAndDim figure=new ShapeAndDim(b1,h1,s1,s2,s3);
                double ar1=figure.area("Triangle");
                LOGGER.log(Level.INFO,"The Area of the Triangle is-----"+ar1);
            }
            else if(option==3){
                ShapeAndDim figure=new ShapeAndDim(b1,h1,s1,s2,s3);
                double pm1=figure.perimeter("Triangle");
                LOGGER.log(Level.INFO,"The perimeter of the Triangle is-----"+pm1);
                ShapeAndDim figure2=new ShapeAndDim(b1,h1,s1,s2,s3);
                double ar1=figure2.area("Triangle");
                LOGGER.log(Level.INFO,"The Area of the Triangle is-----"+ar1);
            }
            else{
                LOGGER.log(Level.INFO,"Oh! choose the correct option");
            }
        }
        else if((op.toUpperCase()).equals(CIRCLE)){
            LOGGER.log(Level.INFO,"Enter the radius of the Circle");
            float r=sc.nextFloat();
            String z=String.format("Select the Below required option\n1.Perimeter\n2.Area\n3.Both");
            LOGGER.log(Level.INFO,z);
            int option=sc.nextInt();
            if(option==1){
                ShapeAndDim figure=new ShapeAndDim(r);
                double pm2=figure.perimeter("circle");
                LOGGER.log(Level.INFO,"The perimeter of the circle is-----"+pm2);
            }
            else if(option==2){
                ShapeAndDim figure=new ShapeAndDim(r);
                double ar2=figure.area("circle");
                LOGGER.log(Level.INFO,"The Area of the circle is-----"+ar2);
            }
            else if(option==3){
                ShapeAndDim figure=new ShapeAndDim(r);
                double pm2=figure.perimeter("circle");
                LOGGER.log(Level.INFO,"The perimeter of the circle is-----"+pm2);
                ShapeAndDim figure3=new ShapeAndDim(r);
                double ar2=figure3.area("circle");
                LOGGER.log(Level.INFO,"The Area of the circle is-----"+ar2);
            }

            else{
                LOGGER.log(Level.INFO,"Oh! choose the correct option");
            }
        }
        else{
            LOGGER.log(Level.INFO,"Please select the proper option");
        }
    }

}
