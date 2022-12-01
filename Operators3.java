/*Logical AND, OR
------------------

Truth Table:

condition-1		condtion-2 ...	 AND &&		OR ||

	True				True		True		True
	False				True		False		True
	True				False		False		True
	False				False		False		False
*/
class LogicalOperator{
	public static void main(String[] args){
		int a=35,b=25,c=20;
	System.out.println(a<b&&a<c);//false&&false=false
	System.out.println(a<b||a<c);//false||false=false
	
	System.out.println(a>c&&b<c);//true&&false=false
	System.out.println(a>c||b<c);//true||false=true
	System.out.println(a>c&&a>b);//true&&true=true
	}
}