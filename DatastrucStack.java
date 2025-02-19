
package datastruc.stack;

import java.util.Scanner;

public class DatastrucStack {
    
   public static class Stack {
        int top;            //define top of stack
        int maxsize = 100;    //max size of the stack  
        String[] stack_arry = new String[maxsize];  //define array that will hold stack elements
        Stack(){            //stack constructor; initially top = -1
            top = -1;  
        }    
        boolean isEmpty(){          //isEmpty () method
            return (top < 0);  
        }  
       boolean push (String val){     //push () method  
            if(top == maxsize-1) {  
                System.out.println("Stack Overflow !!");  
                return false;  
            }  
            else  {  
                top++;  
                stack_arry[top]=val;  
                return true;  
            }  
        }  
        boolean pop () {            //pop () method
            if (top == -1) {  
                System.out.println("Stack Underflow !!");  
                return false;  
            }  
            else   {  

                System.out.println("\nBullet fired: " + stack_arry[top--]);  
                return true;  
            }  
        }  
        boolean search (int index){     //search () method  
            if(index > maxsize-1) {  
                System.out.println("Index limit reached!");  
                return false;  
            }  
            else  {  
                System.out.print(stack_arry[index]);
                return true;  
            }
        }
        void display () {           //print the stack elements  
            for(int i = top; i>=0;i--) {  
                System.out.print("[ " + stack_arry[i] + " ]\n");  
            }  
        }  
    }


    public static void main(String[] args) {
        
        System.out.println("// bullets in a magazine are arranged in a stack\n");
        
        Scanner console = new Scanner(System.in);
        boolean repeat = true;
        int bulletNo = 1;
        Stack magazine = new Stack();
        System.out.println("Enter [r] to Reload; [f] to Fire; [v] to view Magazine; [e] to exit");
        while(repeat == true){
            switch(console.nextLine()){
                case "r" -> {
                    magazine.push("bullet 0" + bulletNo);
                    System.out.println("\nclick!\n");
                    bulletNo++;
                }   
                case "f" -> {
                    System.out.println("\nBANG!");
                    magazine.pop();
                }
                case "v" -> magazine.display();
                case "e" -> repeat = false;
            }   
        }
    } 
}


