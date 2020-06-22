
public class Constru {
	//fields (or instance variable)
	   String webName;
	   int webAge;

	   // constructor
	   Constru(String  Name, int Age ){
		   this. webName =  Name;
		   this. webAge = Age;
	   }
	   public static void main(String args[]){
	      //Creating objects
		   Constru obj1 = new Constru("beginnersbook", 5);
		   Constru obj2 = new Constru("google", 18);

	     //Accessing object data through reference
	     System.out.println(obj1.webName+" "+obj1.webAge);
	     System.out.println(obj2.webName+" "+obj2.webAge);
	   }

}
