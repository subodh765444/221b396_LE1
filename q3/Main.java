/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Mother m=new Mother(); 
		Mother m1 = new Child();
		System.out.println(m1.show()); //output - Hello JUET!
		System.out.println(m.show());  //output - Hello World
		Child ch=new Child();
		System.out.println(ch.show()); //output - Hello JUET!
		System.out.println(ch.show()); //output - Hello JUET!
	}
}

/* Comparision Table 
  
Mother          Child            output
static       non-static      Error show() in child cannot override show() in Mother

non-static    static         Same error as above one

static        static         Hello World 
                             Hello World
                             Hello JUET!
                             Hello JUET!
                             */
                             