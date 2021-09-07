package enumeration;


enum Month {
	jan(1),feb(2),march(3),april(4),may(5),june(6),july(7),aug(8),sep(9),oct(10),nov(11),dec(12); //list of enum --> Work Like Constructor
	
	
	public int MonthNum; //initialize veriable in enum
	private Month(int p)   // private parmetrised constructor inside the enum
	{
		MonthNum = p;  
	
	}
	
	int getMonth() {   // method in enum
		return MonthNum;
	}
}
public class Enum {
	
public static void main(String[] args) {
		Month m;
		Month x;
		System.out.println("My bday Month is ---> "+Month.may.getMonth()+" = "+Month.may);    //
		
		x=Month.valueOf("dec");         // Call by valueOf
		System.out.println("Using valuesOf : "+x);
		
		System.out.println("All month List");
		for(Month e : Month.values())      // Call by values
			System.out.println(e.getMonth()+" = "+e.name());

	}

}
/*OUTPUT
My bday Month is ---> 5 = may
Using valuesOf : dec
All month List
1 = jan
2 = feb
3 = march
4 = april
5 = may
6 = june
7 = july
8 = aug
9 = sep
10 = oct
11 = nov
12 = dec
*/
