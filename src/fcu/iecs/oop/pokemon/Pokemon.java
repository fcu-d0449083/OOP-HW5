package fcu.iecs.oop.pokemon;

public class Pokemon {
	
	final String name;
    private int cp;

	public Pokemon(String name , int cp){
		this.name = name;
		this.cp = cp;
	}
	public String getName() {
	    return name;
	}
	public int getCP(){
		return cp;
	}
	public void setCP(int cp) {
		this.cp = cp;
	}

	
}