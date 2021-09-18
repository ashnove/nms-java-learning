import java.io.*;
//import java.io.FileOutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class PowerConsumption
{
		String date ;
		int machineNo ;
		int consumptionInHp ;
		
		public PowerConsumption( String date , int machineNo , int consumptionInHp )
		{
			this.date = date ;
			this.machineNo = machineNo ;
			this.consumptionInHp = consumptionInHp ;
		}
		
		public String toString()
		{
			StringBuffer str = new StringBuffer() ;
			str.append( date );
			str.append( "\t\t" );
			str.append( String.valueOf( machineNo ) );
			str.append( "\t\t" );
			str.append( String.valueOf( consumptionInHp ) );
			return str.toString() ;
		}
		
		public static void main( String ar[] )
		{
			PowerConsumption p[] = new PowerConsumption[6] ;
			p[0] = new PowerConsumption ( "10.05.08" , 10 , 100 ) ;
			p[1] = new PowerConsumption ( "10.05.08" , 11 , 120 ) ;
			p[2] = new PowerConsumption ( "10.05.08" , 12 , 125 ) ;
			p[3] = new PowerConsumption ( "11.05.08" , 10 , 145 ) ;
			p[4] = new PowerConsumption ( "11.05.08" , 11 , 155 ) ;
			p[5] = new PowerConsumption ( "12.05.08" , 12 , 165 ) ;
			System.out.println("Date\t\t\tMachine\t\tConsumption");
			for( int i = 0 ; i < p.length ; i++ ) {
				System.out.println(p[i]) ;
			}
			
			HashMap<String, ArrayList<Integer>> forEachMachineConsumption = new HashMap<String, ArrayList<Integer>>();
			HashMap<String, ArrayList<Integer>> forEachDateConsumption = new HashMap<String, ArrayList<Integer>>();
			
			HashSet<String> allMachineNumbers = new HashSet<>(); 
			HashSet<String> allDates = new HashSet<>(); 
			
			HashMap<String, Integer> date_machine_val = new HashMap<String, Integer>();
			
//			HashMap<String, HashMap<String, Integer>> mp = new HashMap<String, HashMap<String, Integer>>();
			
			
			for(int i = 0; i < p.length; i++) {
				
				//adding to the list all the power consumption for a particular machine number;
				String machineNo_string = Integer.toString(p[i].machineNo);
				ArrayList<Integer> currentListMachine = forEachMachineConsumption.get(machineNo_string);
				if(currentListMachine == null) {
					currentListMachine = new ArrayList<Integer>();
					currentListMachine.add(p[i].consumptionInHp);
					forEachMachineConsumption.put(machineNo_string, currentListMachine);
				}
				else {
					if(!currentListMachine.contains(p[i].consumptionInHp)) {
						currentListMachine.add(p[i].consumptionInHp);
					}
				}
				
				//adding to the list all the power consumption for a particular date;
				String date_string = p[i].date;
				ArrayList<Integer> currentListDate = forEachDateConsumption.get(date_string);
				if(currentListDate == null) {
					currentListDate = new ArrayList<Integer>();
					currentListDate.add(p[i].consumptionInHp);
					forEachDateConsumption.put(date_string, currentListDate);
				}
				else {
					if(!currentListDate.contains(p[i].consumptionInHp)) {
						currentListDate.add(p[i].consumptionInHp);
					}
				}
				
				//mapping the powerconsumption for a Date-MachineNumber pair;
				String date_machine_string = machineNo_string + date_string;
				date_machine_val.put(date_machine_string, p[i].consumptionInHp);
				
//				mp.put(date, )
				
				allMachineNumbers.add(machineNo_string);
				allDates.add(date_string);
				
			}
			
			//Initializing the size of the result table;
			int tableRow = allMachineNumbers.size() + 2;
			int tableCol = allDates.size() + 2;
			String[][] table = new String[tableRow][tableCol];
			
			
			// Filling all the machine number header;
			int it = 1;
			for(String i : allMachineNumbers) {
				table[it][0] = i;
				it++;
			}
			// Filling all the date header;
			it = 1;
			for(String i : allDates) {
				table[0][it] = i;
				it++;
			}
			// adding required Headers
			table[0][0] = "M/D";
			table[0][tableCol - 1] = table[tableRow - 1][0] = "Total";
			
				
			int overallTotal = 0; // to calculate total consumption;
			
			
			//using streams to put summation value for each machine;
			for(int i = 1; i <= tableRow - 2; i++) {
				ArrayList<Integer> curr = forEachMachineConsumption.get(table[i][0]);
				int tot = curr.stream().collect(Collectors.summingInt(Integer::intValue));
				overallTotal += tot;
				table[i][tableCol - 1] = Integer.toString(tot);
			}
			
			//using streams to put summation value for each date;
			for(int i = 1; i <= tableCol - 2; i++) {
				ArrayList<Integer> curr = forEachDateConsumption.get(table[0][i]);
				int tot = curr.stream().collect(Collectors.summingInt(Integer::intValue));
				overallTotal += tot;
				table[tableRow - 1][i] = Integer.toString(tot);
			}
			
			// adding total power consumption to the list
			table[tableRow - 1][tableCol - 1] = Integer.toString(overallTotal);
			
			
			// Filling the table with the mapped value of Date-MachineNumber
			for(int i = 1; i < tableRow - 1; i++) {
				for(int j = 1; j < tableCol - 1; j++) {

					int val = 0;
					// table[i][0] = Machine Number;
					// table[0][j] = Date;
					if(date_machine_val.containsKey(table[i][0] + table[0][j]))
							val = date_machine_val.get(table[i][0] + table[0][j]);
					
					table[i][j] = Integer.toString(val);
					
				}
			}
			
			//Printing the resultant table;
			for(int i = 0; i < tableRow; i++) {
				
				for(int j = 0; j < tableCol; j++) {
					System.out.print(table[i][j] + "\t");
					if(i>0 && j>0)
						System.out.print("\t");
					
				}
				System.out.println();
			}
				
		}
		
}