package ∫Ω∞‡π‹¿Ì;

import java.io.BufferedReader;

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
	

	
	
}
