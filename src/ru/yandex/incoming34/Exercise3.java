package ru.yandex.incoming34;

import java.util.Random;

public class Exercise3 {

	Apple myApple = new Apple();
	Orange myOrange = new Orange();
	Box appleBox = new Box();
	Box anotherBox = new Box();
	Box orangeBox = new Box();
	private int quantity = 10;

	public void procedure() {
		System.out.println("------------------------------------");
		System.out.println("Exercise 3");
		System.out.println(myApple.getClass().getSimpleName() + " wheights " + myApple.getWheight());
		System.out.println(myOrange.getClass().getSimpleName() + " wheights " + myOrange.getWheight());
		appleBox.putItemIntoBox(myApple);
		orangeBox.putItemIntoBox(myOrange);
		fillBoxes(quantity);
		anotherBox.putItemIntoBox(new Apple());
		appleBox.showBox();
		orangeBox.showBox();
		anotherBox.showBox();
		System.out.println("Box with apples weights " + appleBox.getWeight());
		System.out.println("Box with oranges weights " + orangeBox.getWeight());
		System.out.println("Two boxes have the same weight: " + appleBox.compare(orangeBox));
		appleBox.emtyInto(anotherBox);
		orangeBox.emtyInto(anotherBox);
		orangeBox.emtyInto(appleBox);
		appleBox.showBox();
		orangeBox.showBox();
		anotherBox.showBox();

	}

	private void fillBoxes(int quantity) {
		Random random = new Random();
		Fruit fruit = null;
		for (int i = 0; i < quantity; i++) {
			int rndFruit = random.nextInt(2);
			int rndBox = random.nextInt(2);
			switch (rndFruit) {
			case 0: {
				fruit = new Apple();
				break;
			}
			case 1: {
				fruit = new Orange();
				break;
			}
			}
			if (rndBox == 0) {
				appleBox.putItemIntoBox(fruit);
			} else {
				orangeBox.putItemIntoBox(fruit);
			}

		}

	}

}
