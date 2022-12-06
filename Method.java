/*METHOD:-A collection of instructions that performs a specific task 
-->Methods provides the reuability of code.*/
 public class Method{
	 public  int sum(int a, int b){
		 return (a+b);
	 }
	public int sub(int a, int b){
		 return(a-b);
	}
	public int mul(int a,int b){
		return(a*b);
	}
	public int div(int a,int b){
		return(a/b);
	}
	public int per(int a, int b){
		return(a%b);
	}
	public static void main(String[] args){
		Method m=new Method();//object creation
		System.out.println(m.sum(15,25));//40
		System.out.println(m.sub(14,10));//4
		System.out.println(m.mul(78,6));//468
		System.out.println(m.div(159,5));//31
		System.out.println(m.per(899,5));//4
	}
 }
		