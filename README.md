# Implementation of Data Structures
using Java

<details>
  <summary> <h2> Stacks <h2> </summary>

‎ ‎ ‎ ‎ ‎ ‎ 
First-In, Last-Out (FILO) or Last-In, First-Out (LIFO) that's how the data in this structure goes. A stack is like a stack in real-life, a stack of cards, a stack of plates, of books but put inside a container, where you can only take out things from top to bottom.

‎ ‎ ‎ 	‎ ‎ ‎ 
To implemete the data structure, ‎an array is used together with an int variable called "top" and "max size". The latter is created because an array is used which has a fixed size on initiation while the former because it dictates what's on top of the stack. Every time new data is added, int "top" is added by 1, placing the data on top. When removing or popping the stack, the top data is simultaneously called and removed.

```
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
```

‎ ‎ ‎ 	‎ ‎ ‎ 
Downside of this implementation aside from the fixed size is the fixed data type.

  ‎ 

**DEMO:**
https://asciinema.org/a/XKk6gmegRnCRZstZ0rRlGwFlN

‎ 

[code](https://github.com/HindiSiraYan/DAA-PL-PT1-datastructures/blob/main/DatastrucStack.java)
</details>

<details>
  <summary> <h2> Queue <h2> </summary>

‎ ‎ ‎ ‎ ‎ ‎ 
First-In, First-out, another self-explanatory data structure that is just like in real-life. A queue is a like a queue of people, first come first serve.



</details>


