package com.restaurent.dao;

import com.restaurent.model.*;

public class TestMenuDAO {

	public static void main(String[] args) {
		
		MenuDao menuDAO = new MenuDao();

        Menu menu = new Menu();

		menu.setId(1);
	    menu.setName("Idli");

	     menuDAO.save(menu);

	}

}
