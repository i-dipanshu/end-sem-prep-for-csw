// Qns --> Write a program to demonstrate multi threading

// what --> a process of executing multiple threads simultaneously.

/*  why --> You can perform many operations together, so it saves time.
    --> Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread. */

// uses --> mostly used in games, animation, etc.

/*  How --> 
    There are two ways to create a thread:
    1.By extending Thread class
    2.By implementing Runnable interface.
*/

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
