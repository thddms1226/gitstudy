package gittest;

public class Hello {

	public static void main(String[] args) {
		hello();
		helloName("kacao");
		helloName("Elsa");
	}
	
	public static void hello() {
		System.out.println("Hello~");
	}
	
	public static void helloName(String name) {
		System.out.println("Hello~ " + name);
	}

}
