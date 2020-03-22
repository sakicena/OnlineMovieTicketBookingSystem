package com.capgemini.onlinemovieticketbookingsystem.dao;
import com.capgemini.onlinemovieticketbookingsystem.dto.Show;
import com.capgemini.onlinemovieticketbookingsystem.util.ScreenRepository;
import com.capgemini.onlinemovieticketbookingsystem.util.ShowRepository;
public class ScreenDao
{
	ShowRepository reposhow = new ShowRepository();
    ScreenRepository reposcreen = new ScreenRepository();
	public Show searchShow(String showName)
	{
		for (Show show : ShowRepository.ShowData.values())
		{
			if(show.getShowName().equalsIgnoreCase(showName) && show.getTheatreId()==1001)
			{
				return show;
			}
		}
		return null;
	}
	public static Show[] getShows(Integer screenId)
	{
		return ScreenRepository.ScreenData.get(screenId).getShowList();
	}
}
