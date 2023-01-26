// Write a program to show the working of garbage collection

// process of reclaiming the runtime unused memory automatically.
// In java, garbage collection is automatic 
// A object with no reference is available to collected by garbage collector

// advantages 
// It makes java memory efficient because garbage collector 
// removes the unreferenced objects from heap memory.

// It is automatically done by the garbage collector(a part of JVM) 
// so we don't need to make extra efforts.

public class Csw25_Garbage_Collection {
    // The finalize() method is invoked each time before the object is garbage
    // collected.
    protected void finalize() {
        System.out.println("Unreachable Object is garbage collected");
    }

    public static void main(String[] args) {
        // Ways to de-reference a object

        // 1. assigning null
        Student s1 = null;
        // 2. assigning one object to other
        Student s2 = new Student();
        Student s3 = s2; // now, s2 is de-ref and available to collected by GC

        // 3. anonymous object
        new Student();

        // The gc() method is used to invoke the garbage collector to perform cleanup
        // processing.
        System.gc();
    }
}

class Student {
    int name;
}