package application;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TESTE 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TESTE 2: seller findByDepartment===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);

		System.out.println("\n=== TESTE 3: seller findAll===");
		list = sellerDao.findAll();
		list.forEach(System.out::println);

		System.out.println("\n=== TESTE 4: seller insert===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());
		
		System.out.println("\n=== TESTE 5: seller update===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Cacimb�o");
		sellerDao.update(seller);
		System.out.println("Update complete!");
		
		System.out.println("\n=== TESTE 6: seller update===");
		System.out.println("enter id for delete test"); 
		int id = in.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		
		
		in.close();

	}

}
