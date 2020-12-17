package ru.yandex.incoming34;

import java.util.ArrayList;

public class Exercise2 {
	
	private  final String GAP = " | ";
	String[] strings = { "first", "second", "third", "fourth", "fifth" };
	Double[] doubles = { 1.0, 2.7, 3.14, 4.57, 5.0 };
	
	private <T> ArrayList<T> convertIntoArrayList (T[] array){
		
		ArrayList<T> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		
		return list;
	}
	
	private <T> void showArray(T[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i].toString() + GAP);
		}
		System.out.println();

	}
	
	private <T> void showList(ArrayList<T> oneList) {

		for (int i = 0; i < oneList.size(); i++) {
			T tempStr = (T) oneList.get(i);
			System.out.print(tempStr + GAP);
		}
		System.out.println();

	}
	
	
	public void procedure() {
		System.out.println("------------------------------------");
		System.out.println("Exercise 2");
		System.out.println("Initial array of String: ");
		showArray(strings);
		System.out.println("Array, converted to ArrayList: ");
		ArrayList<String> listOfStrings = convertIntoArrayList(strings);
		showList(listOfStrings);
		System.out.println("Initial array of Double: ");
		showArray(doubles);
		System.out.println("Array, converted to ArrayList: ");
		ArrayList<Double> listOfDoubles = convertIntoArrayList(doubles);
		showList(listOfDoubles);
	}

}
