package Starter;

import Ocean.Sand;
import Ocean.Sea;
import Ocean.Creature.Crab;
import Ocean.Creature.Fish;
import Ocean.plants.Algae;
import Ocean.plants.Seaweed;

public class App {

	public static void main(String[] args) {
		Fish fish1 = new Fish();
		Crab crab1 = new Crab();
		Sand sand1 = new Sand();
		Algae aglae1 = new Algae();
		Seaweed seaweed1 = new Seaweed();
		Sea sea1 = new Sea();
		
		
		fish1.Swimming();
		crab1.Moving();

	}

}
