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
	public int[] reserve(String Names[]) {
		if(Names.length>RowLength)
			return fail;
		int i=0,j=0,k=0;
		boolean flag=false;
		labelA:for(i=0;i<=Row-1;i++) {
			for(j=0;j<=RowLength-Names.length;j++) {
				for(k=j;k<=j+Names.length;k++) {
					if(PassengerList[i*RowLength+k]!=null)
						break;
				}
				if(k>j+Names.length-1) {
					flag=true;
					break labelA;
				}
			}
		}
		if(!flag)
			return fail;
		int[] bn=new int[Names.length];
		for(k=j;k<=j+Names.length-1;k++) {
			bn[k-j]=i*RowLength+k+1;
			PassengerList[i*RowLength+k]=new Passenger(Names[k-j],i*RowLength+k+1,j,k);
			
		}
		return bn;
	}

}
