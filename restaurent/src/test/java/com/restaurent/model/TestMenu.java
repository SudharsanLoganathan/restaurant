package com.restaurent.model;

public class TestMenu {

	public static void main(String[] args) {
		
		Menu menu = new Menu();



		menu.setId(1);
		menu.setName("Idli");

		System.out.println(menu.toString());

		System.out.println(menu.getId());
		System.out.println(menu.getName());
	}

}
