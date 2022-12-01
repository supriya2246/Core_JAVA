class Test{
	static int a=100;
	int b=75;
	static void m(){
	System.out.println("Static method");
	}
	static{
		System.out.println("Static block");
	}
	void m2(){
		System.out.println("Non Static method");
	}
	public static void main(String[] args){
		int c=50;
		Test t= new Test();//creating object
		m();//static method
		t.m2();//non-static method
		System.out.println(t.b);//non static variable
		System.out.println(a);//static variable
	    System.out.println(c);
	}
}
		