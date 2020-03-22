package com.capgemini.onlinemovieticketbookingsystem.util;

import java.util.HashMap;

import com.capgemini.onlinemovieticketbookingsystem.dto.Screen;
import com.capgemini.onlinemovieticketbookingsystem.dto.Show;

public class ScreenRepository 
{
	
	public static HashMap<Integer,Screen> ScreenData=new HashMap<Integer,Screen>();
	static
	{
		Show[] showslist1= {ShowRepository.ShowData.get(1001),ShowRepository.ShowData.get(1002)};
		ScreenData.put(1001, new Screen(1001,1001,"SCREEN 1",showslist1,5,5));
		Show[] showslist2= {ShowRepository.ShowData.get(1003),ShowRepository.ShowData.get(1004)};
		ScreenData.put(1002, new Screen(1002,1001,"SCREEN 2",showslist2,8,5));
		Show[] showslist3= {ShowRepository.ShowData.get(1005),ShowRepository.ShowData.get(1006)};
		ScreenData.put(1003, new Screen(1003,1001,"SCREEN 3",showslist3,6,5));
		Show[] showslist4= {ShowRepository.ShowData.get(1007),ShowRepository.ShowData.get(1008)};
		ScreenData.put(1004, new Screen(1004,1001,"SCREEN 4",showslist4,6,5));

	}
	public ScreenRepository()
	{
		//  Default Constructor Called
	}
   
	static HashMap<Integer, Screen> getScreenData()
	{
		return ScreenData;
    }
	
	
}
