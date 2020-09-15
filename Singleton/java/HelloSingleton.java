package design.main;

public class HelloSingleton {

	static HelloSingleton instance = null;
	
	private HelloSingleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static HelloSingleton getInstance() {
		boolean condition = HelloSingleton.instance == null;

		System.out.printf("instance isNull: %b\n", condition);
		
		if(condition)			
			HelloSingleton.instance = new HelloSingleton();
		
		return HelloSingleton.instance;
	}

}
