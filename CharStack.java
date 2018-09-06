public class CharStack
{
  private final int MAX_CAP = 100;
  private int top; //location of top item on the stack
  private char [] s; //The stack

  public CharStack(){
    //PRE:
    //POS:
    //TAS: Create an empty stack with a default capacity
    s = new char[MAX_CAP];
    top = -1;
  }

  public void push(char element){
    //PRE: 
    //POS: 
    //TAS: Add a new item to the stack
    top ++;
    s[top] = element;
  }

  public char pop (){
    //PRE: 
    //POS: 
    //TAS: remove and return the item on the top of the stack
 
 
      top --;
      int temp = top + 1;
      return s[temp];
     
 
  }

  public boolean isEmpty(){
    
    if(top == -1)
    {
      //System.out.println("Stack is empty.");
      return true;
    }
    else
    {
      //System.out.println("Stack is not empty.");
      return false;
    }
      
  
    //PRE:
    //POS:
    //TAS: Return whether or not the stack is empty. HINT: look
    //     at the constructor.
   
  }

  public boolean isFull(){
    //PRE:
    //POS:
    //TAS: return whether or not the stack is full
    return top == MAX_CAP-1;
  }
  
  public char peek()
  {
    
    //System.out.println(s[top]);
    return s[top];
    
  }
  
  public String toString()
  {
    String temp = "";
  
    for(int x = top; x != -1; x--)
    {
      temp += s[x];
    }
    //System.out.println(temp);
    return temp;
  }
}
