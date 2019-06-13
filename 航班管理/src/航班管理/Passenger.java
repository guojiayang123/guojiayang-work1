package ∫Ω∞‡π‹¿Ì;

public class Passenger implements PassengerInterface
{
	private String Names;
	private int BookingNumeber;
	private int Rows;
	private int SeatPosition;
	
	public Passenger(String Names,int BookingNumeber,int Rows,int SeatPosition) {
		this.Names=Names;
		this.BookingNumeber=BookingNumeber;
		this.Rrows=Rows;
		this.SeatPosition=SeatPosition;
	}
	public String getName() {
		return Names;
	}
	public int getBookingNumeber() {
		return BookingNumeber;
	}
	public int getRow() {
		return Rows;
	}
	public int getSeatPosition() {
		return SeatPosition;
	}
	
}
