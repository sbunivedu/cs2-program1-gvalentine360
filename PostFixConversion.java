import java.util.Scanner;

public class PostFixConversion
{
    public static void main(String [] args)
    {
        CharStack opstack = new CharStack();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please type in a infix expression to convert to a postfix expression.");
        
        String expression = scan.nextLine();
        
        int x = expression.length();
        
        
        
        boolean leftParens = false;
        
   
 
    for(int c = 0; c < x; c++)
    {
      
      
        if(isOperand(expression.charAt(c)))
        {
            System.out.print(expression.charAt(c));
        }
        
        if(isOperator(expression.charAt(c)))
        {
            while(!opstack.isEmpty() && opstack.peek() != '(' && precedenceOrder(opstack.peek()) >= precedenceOrder(expression.charAt(c)))
            {
                System.out.print(opstack.pop());
            }
            opstack.push(expression.charAt(c));
            
            
        }
        if(expression.charAt(c) == '(')
        {
            opstack.push('(');
            
        }
        if(expression.charAt(c) == ')')
        {
          
           
           
           while(!leftParens)
            {
                
                
                
              if(opstack.peek() != '(')
               {
                  
                 System.out.print(opstack.peek());
                 opstack.pop();
                  
                   
                   
               }
               if(opstack.peek() == '(')
               {
                    
                    opstack.pop();
                    leftParens = true;
                    
                    
                    
               }
               
                   
                
            }
            
            leftParens = false;
            
            
            
        }
        
        
        
    }
    while(!opstack.isEmpty())
    {
        
        System.out.print(opstack.pop());
    }
    

    }
    
       
    public static boolean isOperand(char c){
    if(
      (c>='a' && c<='z') ||
      (c>='A' && c<='Z') ||
      (c>='0' && c<='9')){
        return true;
      }else{
        return false;
      }
  }

  public static boolean isOperator(char c){
    return c=='+' || c=='-' || c=='*' || c=='/';
  }
  
  public static int precedenceOrder(char c){
    if(c == '*' || c == '/' ){
      return 2;
    }else {
      return 1;
    }
  }
 

}

   
  