/*it is a symbol that is used to perform operations.
Arthamatic operations(+,-,/,*,%,\)
unary operators(--,++)
left shift<<, right shift>>
logical operators AND(&&),OR(||)
*/

class UnaryOperators{
	public static void main(String[] args){
		int x=5;
		int y=6;
		System.out.println(x);//5
		System.out.println(x++);//5
		System.out.println(x);//6
		System.out.println(--x);//5
		
		System.out.println(y);//6
		System.out.println(y++);//6
		System.out.println(y);//7
		System.out.println(--y);//6
		
		System.out.println(x++ + y++);//11
		System.out.println(--x + --y);//11
		
		System.out.println(x++ + --y);//10
		System.out.println(--y + --y);//7
		System.out.println(x + y);//9
	}
}