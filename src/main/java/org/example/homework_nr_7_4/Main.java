package org.example.homework_nr_7_4;

public class Main {
        public static void main(String[] ags) {
     Circle circle = new Circle(5);
     Cube cube = new Cube(3);
     Sphere sphere = new Sphere(8);
     Square square = new Square(10);
//            System.out.println("Circle Area= "+circle.Area());
//            System.out.println("Square Area= "+square.Area());
//            System.out.println("Sphere Area= "+sphere.Area());
//            System.out.println("Cube Area= "+cube.Area());
//            System.out.println("Cube volume= "+cube.Volume());
//            System.out.println("Sphere volume= "+sphere.Volume());
     Shape[] shapearray = new Shape[]{
             circle,
             cube,
             sphere,
             square
     };
     for (int i=0; i!=shapearray.length; i++){
         System.out.println(shapearray[i].Area());
         if (shapearray[i] instanceof ThreeDimensional){
             ThreeDimensional figure=(ThreeDimensional) shapearray[i];
             System.out.println(figure.Volume());
         }
     }
        }
}
