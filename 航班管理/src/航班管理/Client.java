package ∫Ω∞‡π‹¿Ì;

import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Client {
	private String FlightName=null;
	private int Row=0;
	private int RowLength=0;
	private Flight Flight=null;
	private String cmdString=null;
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args) {
		new Flight().commandShell();
	}
	private void commandShell() {
		System.out.println("\n\n=============================");
		System.out.println("Command Shell V2.01");
		System.out.println("type'exit'command to exit.");
		while(true) {
			readCommand();
			processCommand();
		}
	}
	private void readCommand() {
		if(flightName==null) {
			System.out.println("*************************************************");
			System.out.println("Please Create The Flight Date First!");
			System.out.println("Use command:create flight_name rows RowLength<CR>");
			System.out.println("*************************************************\n\n\n");
		}
		System.out.print("\nCOMMAND>");
		try {
			cmdString=br.readLine().trim();
		}catch(IOEexception e) {
			System.out.println("command error!  ");
			cmdString=null;
		}
	}
	private void processCommand() {
		String[] cmds;
		String cmd;
		if(cmdString!=null) {
			cmds=command(cmdString);
			if(cmds!=null) {
				cmd=cmds[0].toLowerCase();
				if(cmd.equals("create")) {
					if(FlightName==null);
					createCommand(cmds);
					else {
						System.out.println("Create Error:can't handle more flight!");
					}
				}else if(cmd.equals("reserve")) {
					if(FlightName!=null)
						reserveCommand(cmds);
				}else if(cmd.equals("cancel")) {
					if(FlightName!=null)
						cancelCommand(cmds);
				}else if(cmd.equals("list")) {
					if(FlightName!=null)
						listCommand(cmds);
				}else if(cmd.equals("exit")) {
					System.out.println("Thanks.See you later!");
					Sysrem.exit(0);
				}else {
					System.out.println("Bad command!");
					cmdString=null;
				}
			}
		}
	}
	private String[] command(String cmDStr) {
		int cc=0;
		String[] cmd;
		StringTokenizer st=new StringTokenizer(cmdStr);
		if((cc=st.countTokens())==0)
			return null;
		cmd=new String[cc];
		for(int i=0;i<cc;i++)
			cmd[i]=st.nextToken();
		return cmd;
	}
	private void createCommand(String[] cmds) {
		if(cmds.length!=4) {
			System.out.println("create command error!");
		}
		else {
			FlightName=cmd[1];
			Row=readInt(cmds[2]);
			RowLength=readInt(cmds[3]);
			if(Row<=0||RowLength<=0) {
				System.out.println("create command parameters error!");
				FlightName=null;
				Row=0;
				RowLength=0;
			}else{
				try{
					Flight=new Flight(FlightName,Row,RowLength);
					System.out.println("create Flight OK!");
					
				}catch(Exception e) {
					System.out.println(e);
					Flight=null;
					FlightName=null;
					Row=0;
					RowLength=0;
					
				}
			}
		}
	}
    private void reserveCommand(String[] cmds) {
    	if(cmds.length<=1) {
    		System.out.println("reserve command error!");
    		return;
    	}
    	String[] Names=new String[cmds.length-1];
    	for(int i=0;i<Names.length;i++)
    		Names[i]=new String(cmds[i+1]);
    	int[] bn=Flight.reserve(Names);
    	if(bn[0]!=-1) {
    		for(int i=0;i<bn.length;i++)
    			System.out.println(Names[i]+"s Booking Number is:"+bn[i]);
    	}else
    		System.out.println("No Such Sequential Seats Now!");
    	
    }
    private void cancelCommand(String[] cmds) {
    	if(cmds.length!=2) {
    		System.out.println("\ncancel command format error!");
    		return;
    	}
    	int BookingNumber=readInt(cmds[1]);
    	if(BookingNumber<=0) {
    		System.out.println("\ncancel commandparameter error!");
    		return;
    		
    	}
    	boolean state=Flight.cancel(BookingNumber);
    	if(state)
    		System.out.println("Your seat has been cancelled!");
    	else
    		System.out.println("The sea has not been reserved!");
    	
    }
    private void ListCommand(String[] cmds) {
    	if(cmds.length!=1) {
    		System.out.println("\nlist command format error!");
    		return;
    	}
    	Passenger[] PassengerList=Flight.getPassengerList();
    	int flag=0;
    	System.out.println("Name Booking Number Row Seat Position");
    	System.out.println("------------------------------------------");
    	if(PassengerList=null||PassengerList.length<=0)
    		System.out.println("Now no seat is occupied!");
    	else {
    		flag=0;
    		for(int b=0;b<PassengerList.length;b++) {
    			if(PassengerListP[b]!=null) {
    				flag=1;
    				System.out.println(formatStr(PassengerList[b].getName())+formatStr(""+PassengerList[b].getBookingNumber())+formatStr(""+PassengerList[b].getRow())+formatStr(""+PassengerList[b].getSeatPosition()));
    			}
    		}
    		if(flag==0)
    			System.out.println("Now no seat is occupied!");
    	}
    	
    	
    	}
    private String formatStr(String s) {
    	for(int i=0;i<16-s.trim().length();i++)
    		s+='';
    	return s;
    }
	
	
}
