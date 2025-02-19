# Implementation of Data Structures

<details>
  <summary> <h2> Stacks <h2> </summary>
    
‎ ‎ ‎ ‎ ‎ ‎ 
First-In, Last-Out (FILO) or Last-In, First-Out (LIFO) that's how the data in this structure goes. A stack is like a stack in real-life, a stack of cards, a stack of plates, of books but put inside a container, where you can only take out things from top to bottom.

![side-plate-storage-box---plate-size-181-to-215mm_2](https://github.com/user-attachments/assets/8538062c-63ab-4a48-a7d6-93a9875a9e6f)


‎ ‎ ‎ 	‎ ‎ ‎ 
To implemete the data structure, ‎an array is used together with an int variable called "top" and "max size". The latter is created because an array is used which has a fixed size on initiation while the former because it dictates what's on top of the stack. Every time new data is added, int "top" is added by 1, placing the data on top. When removing or popping the stack, the top data is simultaneously called and removed.

‎ ‎ ‎ 	‎ ‎ ‎ 
Downside of this implementation aside from the fixed size is the fixed data type.

  ‎ 

**DEMO:**
https://asciinema.org/a/XKk6gmegRnCRZstZ0rRlGwFlN


</details>
    



