/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        //  A k = new A();
        //  k.printIA(); 
         
         B b = new B();
        //  b.setIA(new IA(){
        //      public void printIA(int sum){
        //           System.out.println("Hello World thoi ");
        //      }
        //  });
        //  b.print();
        b.setIA(new A());
         b.print();
	}
}
