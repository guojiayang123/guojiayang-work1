package ∫Ω∞‡π‹¿Ì;

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
	}
	

	
	
}
