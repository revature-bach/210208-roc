package com.revature;

import com.revature.demo.OperatorDemo; // this is an import statement
// If I'm using a class in a different package, I need to import that class
// by specifying an import statement like the above
// it is the <package_name>.<class_name>

// Alternatively, if I don't import, I have to use a "fully qualified class name" in my code

public class Application {

	public static void main(String[] args) {
		// FQCN example
//		com.revature.demo.OperatorDemo.demo();
		
		OperatorDemo.demo();
	}

}
