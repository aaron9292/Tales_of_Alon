import java.util.*;
public class character {
	private String type;
	private String weapon;
	private String armor;
	private int[] bag;
	private int health;
	private int speed;
	private int attack;
	private int magic;
	private int stamina;
	
	public character() {
		type = "";
		weapon = "";
		armor = "";
		bag = new int[5];
		health = 0;
		speed = 0;
		attack = 0;
		magic = 0;
		stamina = 0;
	}
	
	public character(String t, int h, int sp, int a, int m, int st) {
		type = t;
		weapon = "";
		armor = "";
		bag = new int[5];
		health = h;
		speed = sp;
		attack = a;
		magic = m;
		stamina = st;
	}
	
	public String getType() {
		return type;
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	public String getArmor() {
		return armor;
	}
	
	public int[] getBag() {
		return bag;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getMagic() {
		return magic;
	}
	
	public int getStamina() {
		return stamina;
	}
	
	public void setType(String t) {
		type = t;
	}
	
	public void setWeapon(String w) {
		weapon = w;
	}
	
	public void setArmor(String a) {
		armor = a;
	}
	
	public void setBag(int[] b) {
		bag = b;
	}
	
	public void setHealth(int h) {
		health = h;
	}
	
	public void setSpeed(int s) {
		speed = s;
	}
	
	public void setAttack(int a) {
		attack = a;
	}
	
	public void setMagic(int m) {
		magic = m;
	}
	
	public void setStamina(int s) {
		stamina = s;
	}
	 
}
