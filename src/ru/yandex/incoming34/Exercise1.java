package ru.yandex.incoming34;

public class Exercise1 {

	private  final String GAP = " | ";
	String[] strings = { "first", "second", "third", "fourth", "fifth" };
	Double[] doubles = { 1.0, 2.7, 3.14, 4.57, 5.0 };

	private <T> void swap(T[] array, int firstCell, int secondCell) {

		if (firstCell == secondCell) {
			System.out.println("Nothing to swap");
			return;
		}

		if ((firstCell > (array.length - 1)) || (secondCell > (array.length - 1))) {
			System.out.println("Index of cell is out of bounds.");
			return;
		}

		Object tempObject = array[firstCell];
		array[firstCell] = array[secondCell];
		array[secondCell] = (T) tempObject;

	}

	private <T> void showArray(T[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i].toString() + GAP);
		}
		System.out.println();

	}
	
	public void procedure() {
		
		System.out.print("Initial array of String: ");
		showArray(strings);
		System.out.print("Initial array of Double: ");
		showArray(doubles);
		swap(strings, 12, 14);
		swap(strings, 2, 3);
		System.out.print("Modified array of String: ");
		showArray(strings);
		swap(doubles, 3, 3);
		swap(doubles, 0, 4);
		System.out.print("Modified array of Double: ");
		showArray(doubles);
		
	}

}
