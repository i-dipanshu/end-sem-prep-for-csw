# Qns For Csw - End Sem

## 1. A java program to display prime numbers from 1 to n, where n is input given by user
```java
import java.util.Scanner;

public class Csw01_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // printing primes
        while (n >= 1) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
            n--;
        }
        sc.close();
    }

    // checks if number is prime
    private static boolean isPrime(int num) {
        // finding sqrt of num
        int sqrtOfNum = (int) Math.sqrt(num);

        while (sqrtOfNum >= 2) {
            if (num % sqrtOfNum == 0) {
                return false;
            }
            sqrtOfNum--;
        }
        return true;
    }
}
```

## 2. Write a java program to show multi-level inheritance

```java

// multi-level = class A -> class B -> class C
public class Csw02_MultiLevel_Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.wheel();
    }
}

class Rubber {
    void wheel() {
        System.out.println("I am Rubber");
    }
}

class Wheel extends Rubber {
    void wheel() {
        System.out.println("I am Wheel");
    }
}

class Car extends Wheel {
    void car() {
        System.out.println("I am Car");
    }
}

```

## 3. Write a java program to find common elements between two ArrayList

```java


import java.util.ArrayList;
import java.util.List;

public class Csw03_FindCommon {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        // adding elements to lists
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                l1.add(i);
            }
            if (i % 3 == 0) {
                l2.add(i);
            }
        }

        List<Integer> common = new ArrayList<Integer>(l1);
        // storing the common elements from two lists in a new list
        common.retainAll(l2);
        System.out.println(common);
    }
}

```

## 4. Write a program to show difference between static and non-static method

```java
// static methods can be called without creating a instance while non-static method couldn't

public class Csw04_Static_And_NonStatic {
    public static void main(String[] args) {
        staticMethod();
        Demo d = new Demo();
        d.nonStaticMethod();
    }

    private static void staticMethod() {
        System.out.println("I'm a static method.");
    }
}

class Demo {
    void nonStaticMethod() {
        System.out.println("I am non-static method.");
    }
}
```

## 5. Check whether input character is vowel or consonant

```java
import java.util.Scanner;

public class Csw05_Check_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        // taking input as lower case
        char input = sc.next().toLowerCase().charAt(0);

        if (search(input)) {
            System.out.println("The input is a vowel");
        } else {
            System.out.println("The input is a consonant");
        }

        sc.close();
    }

    private static boolean search(char input) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (char vowel : vowels) {
            if (input == vowel) {
                return true;
            }
        }
        return false;
    }
}

```

## 6. Write java program to implement following methods of set interface
- 1--> add - adds a new element 
- 2--> remove - remove the element passed as parameter
- 3--> contains - check if a element is present or not
- 4--> isEmpty - check if a set is empty or not
- 5--> clear - removes all element from the set
- 6--> add a linked list to set and display the result

```java

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Csw06_Set {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();

        // 1. add
        for (int i = 0; i < 10; i++) {
            s.add(i);
        }

        System.out.println(s);

        // 2. remove
        s.remove(1);

        System.out.println(s);

        // 3. contains
        System.out.println(s.contains(4));

        // 4. isEmpty
        System.out.println(s.isEmpty());

        // 5. clear
        s.clear();

        System.out.println(s);

        // 6. creating a linked list and adding to set
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            l.add(i);
            l.add(i + 1);
        }

        System.out.println(l); // we could see duplicate elements in the linked list

        // adding the linked list to set
        s.addAll(l);

        System.out.println(s); // all duplicates removed
    }
}

```

## 7.  Create a class Address having member variables plot no, post, city and required member functions.Create a TreeMap having key as name of a person and value as address. Insert the required key and value in the TreeMap and display it. 

```java
import java.util.Map;
import java.util.TreeMap;

public class Csw07_TreeMap {
    public static void main(String[] args) {

        // data
        String[] persons = { "Sam", "Ram", "Val", "Kia" };
        String[] city = { "city1", "city2", "city2", "city2" };

        // initializing a treeMap
        Map<String, Address> treeMap = new TreeMap<>();

        // inserting elements
        for (int i = 0; i < city.length; i++) {
            treeMap.put(persons[i], new Address(i, i * 10, city[i]));
        }

        // Note: TreeMap sorts the elements on the basis of key
        System.out.println(treeMap);
    }
}

class Address {
    int plot_no;
    int post;
    String city;

    Address(int plot_no, int post, String city) {
        this.plot_no = plot_no;
        this.post = post;
        this.city = city;
    }

    // overriding to print the data for each person
    @Override
    public String toString() {
        return "[ Plot No: " + plot_no + ", Post: " + post + ", City: " + city + " ]";
    }
}

```

## 8 . 

```java
```
## 9 . 

```java
```
## 11 . 

```java
```
## 12. 

```java
```
## 13. 

```java
```
## 14. 

```java
```
## 15. 

```java
```
## 16. 

```java
```
## 17. 

```java
```
## 18. 

```java
```
## 19. 

```java
```
## 20. 

```java
```
## 21. 

```java
```
## 22. 

```java
```
## 23. 

```java
```
## 24. Write a program to show the use case of lambda expression

- It provides a clear and concise way to represent one method interface using an expression
- It is very useful in collection library. It helps to iterate, filter and extract data from collection.

```java
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

```
## 25. Write a program to show the working of garbage collection

- process of reclaiming the runtime unused memory automatically.
- In java, garbage collection is automatic 
- A object with no reference is available to collected by garbage collector

- advantages 
  It makes java memory efficient because garbage collector 
  removes the unreferenced objects from heap memory.

- It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.

```java

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
```
## 26. Write a program to demonstrate multi threading

- what --> a process of executing multiple threads simultaneously.

- why --> You can perform many operations together, so it saves time.
    --> Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread. */

- uses --> mostly used in games, animation, etc.

- how --> 
    There are two ways to create a thread:
    1.By extending Thread class
    2.By implementing Runnable interface.

```java

public class Csw26_MultiThreading {
    public static void main(String[] args) {
        NewThread n = new NewThread();

        MultiThread m = new MultiThread();
        Thread t = new Thread(m);

        // start() executes the thread and call its run() method
        n.start();
        t.start();

        // main thread started by jvm
        for (int i = 0; i < 4; i++) {
            System.out.println("Main thread running --> " + i);
        }

        // some method
        System.out.println("ID of thread t --> " + t.getId());
    }
}

// 1. extending thread class
class NewThread extends Thread {
    // run() --> is used to perform action for a thread.
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("New thread running along with main thread --> " + i);
        }
    }
}

// 2. Implementing Runnable Interface
class MultiThread implements Runnable {
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Thread running along with others --> " + i);
        }
    }
}

```
## 27.  Write a program to demonstrate File Handling in Java

- File is an abstract data type, a named location used to store related information is known as a File.
 operation -->  create, read, write, delete */

-  Stream -->  A series of data is referred to as a stream. -
    types -> Byte stream(byte data) and Character stream(character data)


- methods --> 
    1. boolean canRead() --> return true if readable
    2. boolean createNewFile() --> create new file and true if file successfully created

```java

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;


public class Csw27_File_Handling {
    public static void main(String[] args) {
        try {
            // 1. create a new file in this directory
            File f1 = new File(System.getProperty("user.dir") + "/sample.txt");

            if (f1.createNewFile()) {
                System.out.println("File created!");
            } else {
                System.out.println("File not created");
            }

            // 2. Get File Info
            if (f1.exists()) {
                // Getting file name
                System.out.println("The name of the file is: " + f1.getName());

                // Getting path of the file
                System.out.println("The absolute path of the file is: " + f1.getAbsolutePath());

                // Checking whether the file is writable or not
                System.out.println("Is file writeable?: " + f1.canWrite());

                // Checking whether the file is readable or not
                System.out.println("Is file readable " + f1.canRead());

                // Getting the length of the file in bytes
                System.out.println("The size of the file in bytes is: " + f1.length());
            } else {
                System.out.println("File not found");
            }

            // 3. Writing to the file
            FileWriter fileWriter = new FileWriter(f1);
            fileWriter.write("Hello from File Handling.");
            fileWriter.close();
            System.out.println("SuccessFully Written");

            // 4. Read from a file
            Scanner dataReader = new Scanner(f1);
            while (dataReader.hasNextLine()) {
                System.out.println(dataReader.nextLine());
            }
            dataReader.close();

            // 5. Delete the File
            if (f1.delete()) {
                System.out.println("File SuccessFully Deleted");
            } else {
                System.out.println("File not deleted");
            }

        } catch (IOException e) {
            // err stream
            System.err.println(e);
        }
    }
}

```
## 28. Qns : Create an HTML page which uses the following methods, (i) slideDown(), (ii) animate(), (iii) fadeIn(), (iv) hide(), (v) show(),(vi) mouseenter(), (vii) dblclick(), (viii) mouseleave(), (ix) attr(),and (x) html().

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Question</title>
    <script
      src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.2/jquery.min.js"
      integrity="sha512-tWHlutFnuG0C6nQRlpvrEhE4QpkG1nn2MOUMWmUeRePl4e3Aki0VB6W1v3oLjFtd0hVOtRQ9PHpSfN6u6/QXkQ=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    ></script>
    <style>
      p {
        cursor: pointer;
        font: 800 2rem Consolas;
      }
      img {
        margin-top: 2rem;
        display: block;
        border: 2px solid black;
      }
    </style>
  </head>
  <body>
    <div>
      <p>Sample Paragraph</p>
      <button class="btn-slide-up">Slide Up</button>
      <button class="btn-slide-down">Slide Down</button>
      <button class="animate">Animate</button>
      <button class="reset">Reset</button>
      <button class="fade-out">Fade Out</button>
      <button class="fade-in">Fade In</button>
      <button class="hide">Hide</button>
      <button class="show">Show</button>
      <button class="attr">Attr</button>
      <button class="html">HTML</button>
      <img src="#" alt="sample Image" width="300" height="200" />
    </div>

    <script>
      $(function () {
        $("p").mouseenter(function () {
          $(this).text("Sample Paragraph - Mouse Entered");
        });
        $("p").mouseleave(function () {
          $(this).text("Sample Paragraph - Mouse Left");
        });
        $("p").dblclick(() => {
          alert("Element Double Clicked");
        });

        $(".btn-slide-up").click(() => {
          $("p").slideUp();
        });
        $(".btn-slide-down").click(() => {
          $("p").slideDown();
        });
        $(".animate").click(() => {
          $("p").animate({ fontSize: "3rem" });
        });
        $(".reset").click(() => {
          $("p").animate({ fontSize: "2rem" });
        });
        $(".fade-out").click(() => {
          $("p").fadeOut();
        });
        $(".fade-in").click(() => {
          $("p").fadeIn();
        });
        $(".hide").click(() => {
          $("p").hide();
        });
        $(".show").click(() => {
          $("p").show();
        });
        $(".attr").click(() => {
          console.log("Hello");
          $("img").attr("height", "300");
        });
        $(".html").click(() => {
          $("p").html("<h4>HTML CHANGED</h4>");
        });
      });
    </script>
  </body>
</html>

```
