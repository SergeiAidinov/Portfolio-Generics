package ru.yandex.incoming34;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Box<E> {
	private ArrayList<E> fruitsInBox = new ArrayList<>();

	public void putItemIntoBox(E item) {
		fruitsInBox.trimToSize();
		if (fruitsInBox.size() == 0) {
			doPut(item);
		} else {
			if (isCompatible(item, fruitsInBox)) {
				doPut(item);
			} else {

			}
		}

	}

	private void doPut(E item) {
		fruitsInBox.add((E) item);
		String itemName = item.getClass().getSimpleName();
		System.out.println(itemName + " is added to box " + this.hashCode());
	}

	private boolean isCompatible(E item, ArrayList<E> itemsInBox) {
		try {
			if (itemsInBox.get(0).getClass() == item.getClass()) {
				return true;
			} else {
				String currentFruit = item.getClass().getSimpleName();
				fruitsInBox.trimToSize();
				String boxOf = itemsInBox.get(0).getClass().getSimpleName();
				System.out.println(currentFruit + " cannot be added into box of " + boxOf);
				return false;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
			return true;
		}

	}

	public double getWeight() {
		double wheightOfBox;
		fruitsInBox.trimToSize();
		if (fruitsInBox.size() == 0) {
			wheightOfBox = 0;
		} else {
			wheightOfBox = (fruitsInBox.size() * ((Fruit) fruitsInBox.get(0)).getWheight());

		}
		return wheightOfBox;

	}

	public boolean compare(Box<?> oneBox) {
		if (this.getWeight() == oneBox.getWeight()) {
			return true;
		} else {
			return false;
		}
	}

	public void emtyInto(Box<E> targetBox) {
		System.out.print("Trying to empty box " + this.hashCode() + " to box " + targetBox.hashCode() + ":");
		boolean isPossible = true;
		if (targetBox.getWeight() != 0) {
			if (targetBox.getTypeOfBox() != this.getTypeOfBox()) {
				isPossible = false;
				System.out.println(" FAILURE! Boxes contain fruits of different types.");
			}
		}
		if (isPossible) {
			fruitsInBox.trimToSize();
			System.out.println();
			for (E fruit : fruitsInBox) {
				targetBox.putItemIntoBox(fruit);
			}
			fruitsInBox.clear();
			fruitsInBox.trimToSize();
			System.out.println("Success!");

		}

	}

	public Class<? extends Fruit> getTypeOfBox() {
		fruitsInBox.trimToSize();
		if (fruitsInBox.size() == 0) {
			return null;
		} else {

			Class<? extends Fruit> fruit = (Class<? extends Fruit>) fruitsInBox.get(0).getClass();
			return fruit;
		}
	}

	
	public void showBox() {
		fruitsInBox.trimToSize();
		if (fruitsInBox.size() == 0) {
			System.out.println("Box " + this.hashCode() + " is empty.");
		} else {
		System.out.println("Box " + this.hashCode() + " contains:");
		int index = 0;
		for (E fruit : fruitsInBox) {
			index++;
			System.out.println(index + ". " + fruit.getClass().getSimpleName());
		
	}
	}
	}

}
