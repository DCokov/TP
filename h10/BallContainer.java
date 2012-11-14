/*
 * Технологично училище "Електронни системи"
 * www.elsys-bg.org
 * 11a клас
 * Даниел Красимиров Цоков
 * Номер 9
 * Задача - да се направи програма, която да слага топчета в кутия
 * */
package ballandbox;
import java.util.ArrayList;

public class BallContainer {
	private int capacity = 10;
	private ArrayList<ball> bc = new ArrayList<ball>(capacity);
	
	public void add (ball a) {
		if(bc.size() != capacity) {
			if(!bc.contains(a)){
				bc.add(a);
			} else {
				System.out.println("This ball is already in the box");
			}
		} else {
			System.out.println("box is full !!!");
		}
	}
	
	public void remove (ball a) {
		if(!bc.isEmpty()) {
			if(!bc.contains(a)) {
				System.out.println("This ball is not in the container");
			} else {
				bc.remove(a);
			}
		} else {
			System.out.println("box is empty");
		}
	}
	
	public void clear() {
		bc.clear();
	}
	
	public boolean contains(ball a) {
		return bc.contains(a);
	}
	
	public int size() {
		return capacity -  bc.size();
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void print() {
		for(ball p:bc) {
			System.out.println(p.getName());
		}
	}
}
