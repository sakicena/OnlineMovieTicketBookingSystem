package com.capgemini.onlinemovieticketbookingsystem.dto;

//import java.util.HashMap;

import com.capgemini.onlinemovieticketbookingsystem.service.UserService;
//import com.capgemini.onlinemovieticketbookingsystem.util.ShowRepository;

public class Screen 
{

	private Integer screenId;
	private Integer theatreId;
	private String screenName;
	private Show[] showList;
	private Integer rows;
	private Integer columns;
	public Integer getScreenId() {
		return screenId;
	}
	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}
	public Integer getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public Show[] getShowList() {
		return showList;
	}
	public void setShowList(Show[] showList) {
		this.showList = showList;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getColumns() {
		return columns;
	}
	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	public Screen(Integer screenId, Integer theatreId, String screenName,
			Show[] showList, Integer rows, Integer columns) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		this.showList = showList;
		this.rows = rows;
		this.columns = columns;
	}
	public Screen()
	{
		
	}
	UserService userser = new UserService();

	@SuppressWarnings("static-access")
	public Show searchShow(String showName)
	{
		for (Show show : userser.getShows(this.getScreenId()) )
		{
			if(show.getShowName().equalsIgnoreCase(showName))
			{
				return show;
			}
		}
		return null;
	}
	
	
	public Show[] showShows()
	{
		
		 return UserService.getShows(getScreenId());
	}
}
