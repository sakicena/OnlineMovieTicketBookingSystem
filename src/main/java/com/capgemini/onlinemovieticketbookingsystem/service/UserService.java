package com.capgemini.onlinemovieticketbookingsystem.service;
import com.capgemini.onlinemovieticketbookingsystem.dao.ScreenDao;
import com.capgemini.onlinemovieticketbookingsystem.dto.Show;
import com.capgemini.onlinemovieticketbookingsystem.util.ScreenRepository;

public class UserService 
{
	public UserService()
	{
		//Default Constructor Called
	}
	
	public void getShowDetails(Show show)
	   {
		if(show==null)
		{
			System.out.println("No show present with that name");
			return;
		}
		System.out.println("Name : "+show.getShowName());
		System.out.println("Movie : "+show.getMovieName().getMovieName());
		System.out.println("Screen Id : "+show.getScreenId());
		System.out.println("Screen Name : "+ScreenRepository.ScreenData.get(show.getScreenId()).getScreenName());
		System.out.println("Timings : "+show.getShowStartTime().toString() +" to "+show.getShowEndTime().toString());
		System.out.print("\n");
	}
     public static Show[] getShows(Integer screenId)
     {
		return ScreenDao.getShows(screenId);
	 }
	
}
