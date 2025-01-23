/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Mother m=new Mother(); //output - Hello i am in mother class
		m.motherclass();
		Child ch=new Child();
		ch.motherclass(); //output - Hello i am in mother class
		ch.childclass(); //output - Hello i am in child class
	}
}