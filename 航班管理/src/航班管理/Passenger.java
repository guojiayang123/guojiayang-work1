package ∫Ω∞‡π‹¿Ì;

public class Passenger implements PassengerInterface
{
	private String Names;
	private int BookingNumber;
	private int Rows;
	private int SeatPosition;
	
	public Passenger(String Names,int BookingNumber,int Rows,int SeatPosition) {
		this.Names=Names;
		this.BookingNumber=BookingNumber;
		this.Rows=Rows;
		this.SeatPosition=SeatPosition;
	}
	public String getName() {
		return Names;
	}
	public int getBookingNumber() {
		return BookingNumber;
	}
	public int getRow() {
		return Rows;
	}
	public int getSeatPosition() {
		return SeatPosition;
	}
	
}
