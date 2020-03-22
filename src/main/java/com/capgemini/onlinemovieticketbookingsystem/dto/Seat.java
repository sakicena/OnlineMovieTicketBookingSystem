package com.capgemini.onlinemovieticketbookingsystem.dto;

public class Seat
{

	private Integer seatId;
	private Enum seatStatus;
	private double seatPrice;
	public Seat() {
		//Default Seat has been called
	}
	public Seat blockSeat()
	{
		this.seatStatus=BookingState.BLOCKED;
		return this;	
	}
	
	public Seat bookSeat()
	{
		this.seatStatus=BookingState.BOOKED;
		return this;
	}
	public Seat cancelSeatBooking()
	{
		return null;
	}
	public Enum unBlockSeat()
	{
		return null;
	}
	public Integer getSeatId() {
		return seatId;
	}
	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}
	public Enum getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(Enum<?> seatStatus) {
		this.seatStatus = seatStatus;
	}
	public double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
	
	

}
