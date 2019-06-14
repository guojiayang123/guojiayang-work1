package ∫Ω∞‡π‹¿Ì;

public class Flight implements FlightInterface{
	private String FlightName;
	private int Row;
	private int RowLength;
	private int[] fail= {-1};
	private Passenger[] PassengerList;
	public Flight(String FlightName,int Rows,int RowLength)throws Exception{
		if(FlightName==null||FlightName.trim().length()==0||Rows<=0||RowLength<=0)
			throw new Exception("Error");
		else {
			this.FlightName=FlightName;
			this.Row=Rows;
			this.RowLength=RowLength;
			this.PassengerList=new Passenger[Row*RowLength];
			for(int i=0;i<Row*RowLength;i++)
				PassengerList[i]=null;
			
		}
	}

}
