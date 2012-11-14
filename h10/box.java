/*
 * 	Технологично училище "Електронни системи"
 * www.elsys-bg.org
 * 11a клас
 * Даниел Красимиров Цоков
 * Номер 9
 * Задача - да се направи програма, която да слага топчета в кутия
 * */
package ballandbox;

public class box {
	public static void main(String[] args) {
		BallContainer box = new BallContainer();
		ball b1 = new ball();
		b1.setName("b1");
		box.add(b1);
		box.print();
		System.out.println(box.contains(b1));
		ball b2 = new ball();
		b2.setName("b2");
		box.add(b2);
		ball b3 = new ball();
		b3.setName("b3");
		box.add(b3);
		ball b4 = new ball();
		b4.setName("b4");
		box.add(b4);
		ball b5 = new ball();
		b5.setName("b5");
		box.add(b5);
		ball b6 = new ball();
		b6.setName("b6");
		box.add(b6);
		ball b7 = new ball();
		b7.setName("b7");
		box.add(b7);
		ball b8 = new ball();
		b8.setName("b8");
		box.add(b8);
		ball b9 = new ball();
		b9.setName("b9");
		box.add(b9);
		ball b10 = new ball();
		b10.setName("b10");
		box.add(b10);
		System.out.println(box.getCapacity());
		System.out.println(box.size());
		System.out.println(box.contains(b10));
		ball b11 = new ball();
		b11.setName("b11");
		box.add(b11);
		System.out.println(box.contains(b11));
		box.print();
		System.out.println("###################");
		box.remove(b6);
		box.print();
		
	}

}