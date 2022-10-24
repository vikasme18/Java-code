package lab6;

public class StringBufferBuilderDemo {
	
	public void stringBufferDemo() {
		StringBuffer strbuffer1 = new StringBuffer("good");
		StringBuffer strbuffer2 = new StringBuffer("make my day");
		StringBuffer strbuffer3 = new StringBuffer("happy diwali");
		StringBuffer strbuffer4 = new StringBuffer("to check");
		StringBuffer strbuffer5 = new StringBuffer("to check");
		
		// append method of StringBuffer class
		strbuffer1.append(" morning");
		System.out.println(strbuffer1);
		// reverse method of StringBuffer class
		System.out.println(strbuffer1.reverse());
		// delete method of StringBuffer class
		System.out.println(strbuffer2.delete(3, 7));
		// insert method of StringBuffer class
		System.out.println(strbuffer3.insert(0, "Very "));
		// equals method of StringBuffer class
		System.out.println(strbuffer4.equals(strbuffer5));
		System.out.println(strbuffer2.equals(strbuffer3));
	}	
	
	public void stringBuilderDemo() {
		StringBuilder strbuild1 = new StringBuilder("new activity");
		StringBuilder strbuild2 = new StringBuilder("new activity");
		
		// equals method of StringBuilder class
		System.out.println(strbuild1.equals(strbuild2));
		// append method of StringBuilder class
		System.out.println(strbuild1.append(" launch"));
		// delete method of StringBuilder class 
		System.out.println(strbuild2.delete(3, 12));
		// insert method of StringBuilder class
		System.out.println(strbuild2.insert(3, " language"));
		// reverse method of StringBuilder class
		System.out.println(strbuild2.reverse());
	}
	
	public static void main(String[] args) {
		StringBufferBuilderDemo sbd = new StringBufferBuilderDemo();
		sbd.stringBufferDemo();
		System.out.println();
		sbd.stringBuilderDemo();
	}
}