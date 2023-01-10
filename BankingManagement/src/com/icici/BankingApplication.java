package com.icici;

import java.util.Scanner;

import com.icici.models.Account;
import com.icici.repositories.AccountArrayRepository;


public class BankingApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option;
		
		System.out.println("Student Management\n=================");
		System.out.println("Enter the number of records");
		
		AccountArrayRepository repo = new AccountArrayRepository(scanner.nextInt());
		
		while(true) {
			
			System.out.println("\nSELECT AN OPTION\n=================");
			System.out.println("1) Add a account");
			System.out.println("2) List a account");
			System.out.println("3) List all accounts");
			System.out.println("4) Update a account");
			System.out.println("5) Delete a account");
			System.out.println("*) Quit");
			
			option = scanner.nextInt();
			scanner.nextLine();
			
			switch(option) {
				case 1:{
					
					System.out.println("Adding Student to Position : "+dao.getPosition()+"/"+dao.getLength());
					System.out.println("Enter Name : ");
					String name = scanner.nextLine();
					System.out.println("Enter Account Type : ");
					System.out.println(Account.CURRENT_ACCOUNT+") Current Account");
					System.out.println(Account.SAVINGS_ACCOUNT+") Savings Account");
					int type = scanner.nextInt();
					
					
					Account account = new Account();					
					account.setName(name);
					account.setType(type);
					
					repo.add(account);
					
					break;
				}
				case 2:{
					
					System.out.println("Enter the roll no of Student : ");
					String name = scanner.nextInt();
					
					Student student = repo.getByName(name);
					
					if(student == null) {
						
						System.out.println("Oops! No such record found");
						
					}else {
						
						student.printDetails();
						
					}
					
					break;
				}
				case 3:{
					
					System.out.println("All Students\n-------------");
					
					Account accounts[] = repo.getAll();
					
					for(Account account:accounts) {
						
						//method 1 (preferred)
						if(student == null) continue;						
						student.printDetails();
						repo.calculateInterest(account);
							
						//method 2
//						try {
//							
//							student.printDetails();
//
//						}catch(NullPointerException e) {
//							
//							continue;
//							
//						}
						
						
					}
					
					break;
				}
				case 4:{
					
					System.out.println("Enter the roll no of Student : ");
					int rollNo = scanner.nextInt();
					scanner.nextLine();
					
					Student student = dao.getStudent(rollNo);
					
					if(student == null) {
						
						System.out.println("Oops! No such record found");
						
					} else {
						
						student.printDetails();
						
						System.out.println("\nEnter the new name : ");
						String name = scanner.nextLine();
						System.out.println("Enter the new address : ");
						String address = scanner.nextLine();
						System.out.println("Enter the new blood group : ");
						String bloodGroup = scanner.nextLine();
						
						Student newStudent = new Student();
						newStudent.setName(name);
						newStudent.setAddress(address);
						newStudent.setBloodGroup(bloodGroup);
						
						dao.editStudent(student,newStudent);
						
					}
					
					break;
				}
				case 5:{
					
					System.out.println("Enter the roll no of Student : ");
					int rollNo = scanner.nextInt();
					
					Student student = dao.getStudent(rollNo);
					
					if(student == null) {
						
						System.out.println("Oops! No such record found");
						
					}else {
						
						System.out.println("The student with below details have been deleted :");						
						student.printDetails();
						
						dao.deleteStudent();
						
					}
					
					
					break;
				}
			}
			
		}


	}

}
