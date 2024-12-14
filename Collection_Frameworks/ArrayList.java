import java.util.ArrayList;
class ArrayList
{
		public static void main(String [] args)
		 {
				ArrayList<String> Hero = new ArrayList<>();
				Hero.add("Hello");
				Hero.add("Media");
				Hero.add("Hyd");
				Hero.add("City");
				Hero.add("Town");
				Hero.add("Mega");			
				System.out.println(Hero);
				System.out.println("Size of Array : "+Hero.size());
				System.out.println("Contains : "+Hero.contains("City"));
				System.out.println("Content is "+Hero.get(1));
				System.out.println("Index is "+Hero.indexOf("Hyd"));
				Hero.remove(3);
				Hero.set(4,"peak");

				System.out.println(Hero);
				ArrayList<String> Hero1 = new ArrayList<>();
				Hero1.add("Hii");
				Hero.addAll(Hero1);
				System.out.println("Second List : "+Hero1);
				

			  			    
		 }
}
