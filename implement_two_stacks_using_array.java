


/* Structure of the class is
class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}*/

class Stacks
{
    //Function to push an integer into the stack1.
    void push1(int x, TwoStack sq)
    { 
      //condition to  check to see if stack 1 is full or both stacks are full
       if(sq.top1+1==sq.top2 || sq.size==0)
       {
           return; 
       }
       
       else
       {
           sq.top1++;
           sq.arr[sq.top1]=x;
           sq.size--;
           return;
       }
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    { 
        
      //condition to  check to see if stack 2 is full or both stacks are full
        if(sq.top2-1==sq.top1 || sq.size==0)
        {
            return;
        }
        else
        {
            sq.top2--;
            sq.arr[sq.top2]=x;
            sq.size--;
            return;
        }
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {            
      
      //condition to  check to see if stack 1 is empty or both stacks are empty
        if(sq.size==sq.arr.length || sq.top1==-1)
        {
            return -1;
        }
        else
        {
            int val = sq.arr[sq.top1];
            sq.top1--;
            sq.size++;
            return val;
        }
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
        //condition to  check to see if stack 2 is empty or both stacks are empty
        if(sq.size==sq.arr.length || sq.top2==sq.arr.length)
        {
            return -1;
        }
        else
        {
            int val = sq.arr[sq.top2];
            sq.top2++;
            sq.size++;
            return val;
        }
    }
}
