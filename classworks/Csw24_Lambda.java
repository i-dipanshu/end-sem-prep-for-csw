// Write a program to show the use case of lambda expression

// It provides a clear and concise way to represent one method interface using an expression
// It is very useful in collection library. It helps to iterate, 
// filter and extract data from collection.

interface Drawable {
    public void draw();
}

public class Csw24_Lambda {
    public static void main(String[] args) {
        int width = 10;

        // without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();

         //with lambda  
         Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
    }
    
}
