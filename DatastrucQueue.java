
package datastrucqueue;

import java.util.Scanner;

    

public class DatastrucQueue {

    static class Queue { 
        private static int front, rear; 
        private static int capacity; 
        private static long queue[]; 

        Queue(int size) { 
            front = rear = 0; 
            capacity = size; 
            queue = new long[capacity];
        } 

        // insert an element into the queue
        void queueEnqueue(long item)  { 
            // check if the queue is full
            if (capacity == rear) { 
                System.out.printf("\nQueue is full\n"); 
            } 

            // insert element at the rear 
            else { 
                queue[rear] = item; 
                rear++; 
            } 
        } 

        //remove an element from the queue
        void queueDequeue()  { 
            // check if queue is empty 
            if (front == rear) { 
                System.out.printf("\nQueue is empty\n"); 
            } 

            // shift elements to the right by one place uptil rear 
            else { 
                for (int i = 0; i < rear - 1; i++) { 
                    queue[i] = queue[i + 1];
                } 


          // set queue[rear] to 0
                if (rear < capacity) 
                    queue[rear] = 0; 

                // decrement rear 
                rear--; 
            } 
        } 

        // print queue elements 
        void queueDisplay() 
        { 
            int i; 
            if (front == rear) { 
                System.out.printf("Queue is Empty\n"); 
                return; 
            } 

            // traverse front to rear and print elements 
            for (i = front; i < rear; i++) { 
                System.out.printf("[%d] ", queue[i]); 
            }
            System.out.println(" ");
        } 

        // print front of queue 
        void queueFront() 
        { 
            if (front == rear) { 
                System.out.printf("Queue is Empty\n"); 
                return; 
            } 
            System.out.printf("\nFront Element of the queue: %d", queue[front]); 
        } 
    } 
    public static void main(String[] args) {
              
        System.out.println("// Customer calls in call center systems are placed in queues.");
        
        Queue callLine = new Queue(10); 
        Scanner console = new Scanner(System.in);
        String answer;
   
        System.out.println("Call-line:");
        callLine.queueDisplay();
        
        System.out.println("\nAfter an hour...\n");
        
        callLine.queueEnqueue(639305613690L);
        callLine.queueEnqueue(638138954691L);
        callLine.queueEnqueue(639935468079L);
        callLine.queueEnqueue(639857309950L);
        callLine.queueEnqueue(639345640730L);
        
        System.out.println("Call-line:");
        callLine.queueDisplay(); 
        
        System.out.println("Receive call?");
        System.out.println("Press 'y' to receive or 'e' to exit.");
        answer = console.nextLine();
        
        while(answer.equals("y")){
            callLine.queueDequeue();
            System.out.println("\nCaller Received.\n");
            System.out.println("Call-line:");
            callLine.queueDisplay();
            System.out.println("Receive call?");
            answer = console.nextLine();
        }
    }  
}
