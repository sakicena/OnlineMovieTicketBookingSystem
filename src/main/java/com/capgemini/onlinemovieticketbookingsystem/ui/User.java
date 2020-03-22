package com.capgemini.onlinemovieticketbookingsystem.ui;

import com.capgemini.onlinemovieticketbookingsystem.util.ScreenRepository;
//import com.capgemini.onlinemovieticketbookingsystem.util.ShowRepository;
import com.capgemini.onlinemovieticketbookingsystem.dto.Screen;
import com.capgemini.onlinemovieticketbookingsystem.dto.Show;
import com.capgemini.onlinemovieticketbookingsystem.service.UserService;
import java.util.Scanner;



public class User
{

	public User()
	{
		// Default Constructor Called
    }	
	public static void main(String args[])
	{
		UserService service=new UserService(); 
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		
		try 
		{	
			System.out.print("Enter the Screen in which You want to search :");
			Screen screenobject = ScreenRepository.ScreenData.get(scanner.nextInt());
			String choi="";
			do
			{
				System.out.println("Select the Options from Menu");
				System.out.println("1. Search Show \n"
						+ "2. Show shows");
				int choice=scanner.nextInt();
				switch(choice)
				{
				case 1:
				{
					System.out.print(" Enter show name :");
					Show show = screenobject.searchShow(scanner.next());
					service.getShowDetails(show);
					break;
				}
				case 2:
				{
					Show[] showslist=screenobject.showShows();
					if(showslist==null) 
					{
						System.out.println("No shows in the list");
						break;
					}
					for (Show show : showslist) {
						service.getShowDetails(show);
					}
					
					break;
				}
				default:
				{
					System.out.println("Invalid Option");
					break;
				}
				}
				System.out.println("Enter something to continue");
				choi=scanner.next();
				
			}
			while(!choi.isEmpty());
	    }

		catch(Exception exception)
		{
			System.out.print("Index Count Exceeded the number \n"
					+ "Please Select the Number which is Available");
		}
		scanner.close();
	}
	
}
