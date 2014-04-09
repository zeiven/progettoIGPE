package Entity;

import TileMap.mattonciniMap;



public class Nemico extends MapObject {
	
	protected int health; //in teoria non dovrebbe morire subito al primo attacco. o forse si?????!!!
	protected int maxHealth;
	protected boolean dead;
	protected int damage; //pericolosità
	
	protected boolean indietreggiare;
	protected long indietreggiareTimer;
	
	public Nemico(mattonciniMap tm) {
		super(tm);
	}
	
	public boolean isDead() { return dead; }
	
	public int getDamage() { return damage; } //il dannoche arreca il nemico
	
	public void hit(int damage) {
		if(dead || indietreggiare) return;
		health -= damage;
		if(health < 0) health = 0;
		if(health == 0) dead = true;
		indietreggiare = true;
		indietreggiareTimer = System.nanoTime();
	}
	
	public void update() {}

	public void setContaCibo() {
		// TODO Auto-generated method stub
		
	}

	public int getContaCibo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}














