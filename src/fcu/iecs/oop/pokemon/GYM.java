package fcu.iecs.oop.pokemon;
import java.util.Random;
public class GYM {

	public static void fight(Pokemon p1, Pokemon p2){
		System.out.println("Name:"+p1.getName());
		System.out.println("CP:"+p1.getCP());
		System.out.println("Name:"+p2.getName());
		System.out.println("CP:"+p2.getCP());
		Random ran = new Random();
		int i=ran.nextInt(2)+1;
		if (i%2==1)
		{
			System.out.println("Winner is ["+p1.getName()+"]");
			System.out.println("CP:"+p1.getCP()+"+500");
			p1.setCP(p1.getCP()+500);
			System.out.println("NEW CP:"+p1.getCP());
		}
		else
		{
			System.out.println("Winner is ["+p2.getName()+"]");
			System.out.println("CP:"+p2.getCP()+"+500");
			p2.setCP(p2.getCP()+500);
			System.out.println("NEW CP:"+p2.getCP());
		}
	}

}