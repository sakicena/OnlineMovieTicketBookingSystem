package com.capgemini.onlinemovieticketbookingsystem.util;

import java.util.Date;
import java.util.HashMap;

import com.capgemini.onlinemovieticketbookingsystem.dto.Movie;
import com.capgemini.onlinemovieticketbookingsystem.dto.Show;



public class ShowRepository
{
	public static HashMap<Integer,Show> ShowData=new HashMap<Integer,Show>();
	static
	{
		
		ShowData.put(1001,new Show(Integer.valueOf(1001),new Date(2020, 02, 16, 9, 30),new Date(2020, 02, 16, 12, 30),"MorningShow",
				new Movie(1, "Bahubali","Drama","Rajamouli", 142, new Date(2016,7,10)),
						Integer.valueOf(1001),Integer.valueOf(1001)));
		
		ShowData.put(1002,new Show(Integer.valueOf(1002),new Date(2020, 02, 17, 13, 30),new Date(2020, 02, 17, 16, 30),"Matinee",
				new Movie(1, "Srimanthudu","Drama","Rajamouli", 142, new Date(2016,7,10)),
						Integer.valueOf(1001),Integer.valueOf(1001)));

		ShowData.put(1003,new Show(Integer.valueOf(1003),new Date(2020, 02, 18, 9, 30),new Date(2020, 02, 18, 12, 30),"MorningShow",
				new Movie(1, "Pokiri","Drama","Puri", 142, new Date(2016,7,10)),
						Integer.valueOf(1002),Integer.valueOf(1001)));
		
		ShowData.put(1004,new Show(Integer.valueOf(1004),new Date(2020, 02, 19, 13, 30),new Date(2020, 02, 19, 16, 30),"FirstShow",
				new Movie(1, "ALa vaikuntapuramlo","Drama","Rajamouli", 142, new Date(2016,7,10)),
						Integer.valueOf(1002),Integer.valueOf(1001)));
		
		ShowData.put(1005,new Show(Integer.valueOf(1005),new Date(2020, 02, 16, 9, 30),new Date(2020, 02, 16, 12, 30),"NightShow",
				new Movie(1, "Murari","Drama","KrishnaVamsi", 142, new Date(2016,7,10)),
						Integer.valueOf(1003),Integer.valueOf(1001)));
		
		ShowData.put(1006,new Show(Integer.valueOf(1006),new Date(2020, 02, 17, 13, 30),new Date(2020, 02, 17, 16, 30),"Matinee",
				new Movie(1, "Sye","Drama","Rajamouli", 142, new Date(2016,7,10)),
						Integer.valueOf(1003),Integer.valueOf(1001)));
		
		ShowData.put(1007,new Show(Integer.valueOf(1007),new Date(2020, 02, 18, 9, 30),new Date(2020, 02, 18, 12, 30),"NightShow",
				new Movie(1, "Sahoo","Action Drama","Sujith", 142, new Date(2016,7,10)),
						Integer.valueOf(1004),Integer.valueOf(1001)));
		
		ShowData.put(1008,new Show(Integer.valueOf(1008),new Date(2020, 02, 19, 13, 30),new Date(2020, 02, 19, 16, 30),"Matinee",
				new Movie(1, "Legend","Family Action","Boyapati", 142, new Date(2016,7,10)),
						Integer.valueOf(1004)/*Screen Id*/,Integer.valueOf(1001)));
		
		
		
	}
	public HashMap<Integer,Show> getShows()
	{
		return ShowData;
	}
	public ShowRepository() {
		// TODO Auto-generated constructor stub
	}
}
