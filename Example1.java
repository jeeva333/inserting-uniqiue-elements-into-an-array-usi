


import java.util.Scanner;
class Example1
{
	static Scanner s=new Scanner(System.in);
	static int[] array=new int[91];
	static int top=0;

	public static void main(String[] args)
	{
		
		
		while(true)
		{
			System.out.println("enter your choice:");
			System.out.println("1.enter the value");
			System.out.println("2.display the elements in the stack ");
			System.out.println("3.exit");
			int n=s.nextInt();

		switch(n)
		{
     case 1: System.out.println("enter the value in between 10 and 100");
      int num =s.nextInt();
      boolean j=true;
      if(num>=10 && num<=100)
      {
        
       for(int i=0;i<top;i++)
       {
          if(num==array[i])
          {
           
              System.out.println(num + "already inserted in array");
              j=false;
            break;
           }
         
       }
         if(j!=false)
            { top++;
           array[top-1]=num;
             }
           
        
      }
      else 
      {
      	System.out.println("enter the value in between 10 and 100 only");
      }
      break;
      case 2:if(top==0)
      {
    	  System.out.println("list is empty");
      }
      else {
    	  for(int i=0;i<top;i++)
               System.out.println(array[i]);}
             break;
       case 3: System.exit(1);   
               break; 
       default:System.out.println("invalid option");  

      }

      }

	}


}