//shift operators:-<<left shit operator, >>right shift operator
/*Left, Right shift operator

left shit operator << 

EX: 10<<2 --> 10 Multiple by 2 powerof 2 = 10*4 = 40;

	10<<3 --> 10 * 2 powerof 3 = 10*8 = 80

Right shit opertor >>

EX: 10>>2 --> 10 devided by 2 square 2 = 10 /4 = 2
	10>>3 --> 10 devided by 2 cube 		=10/8 =1
*/



class ShiftOperator{
	public static void main(String[] args){
		System.out.println(10<<5); //10*2 power of 5=10*(2*2*2*2*2)=10*32=>320
		System.out.println(25<<2);//25*2 power of 2=25*(2*2)=25*4=>100
		
		System.out.println(10>>5);//10/(2*2*2*2*2)=10/32=>0
        System.out.println(25>>2);//25/(2*2)=25/4=>6
	}
}