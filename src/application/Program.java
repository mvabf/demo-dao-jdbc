package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department dp = new Department(1, "books");
		System.out.println(dp);
		
		
		Seller sl = new Seller(21, "Marcus", "marcus@gmail.com",sdf.parse("10/05/1994"), 13000.0,dp);
		System.out.println(sl);

	}

}
