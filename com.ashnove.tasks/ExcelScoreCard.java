import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.FillPatternType;  
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelScoreCard {
	
	private static Workbook wb;
	private static Sheet sh;
	private static FileInputStream fis;
	private static FileOutputStream fos;
	private static Row row;
	private static Cell cell;

	public static void main(String[] args) throws Exception {
		
		fis = new FileInputStream("/home/ashnove/Documents/NETMEDS-WORK/netmeds-java-learning/com.ashnove.tasks/scoreCardxl.xlsx");
		wb = WorkbookFactory.create(fis);
		sh = wb.getSheet("Sheet1");
		fos = new FileOutputStream("/home/ashnove/Documents/NETMEDS-WORK/netmeds-java-learning/com.ashnove.tasks/scoreCardxl.xlsx");
		
		int currentRow = 0;
		row = sh.createRow(currentRow++);cell = row.createCell(0);
		cell.setCellValue("Cricket Game Started");
		
//		CellStyle green = wb.createCellStyle();
		CellStyle blue = wb.createCellStyle(); 
		
		int playerA_Hand;
		int playerB_Hand;

		Random random = new Random();	

		int numberOfMatches = 4;
		boolean turn = true;
		
		blue.setFillBackgroundColor(IndexedColors.GREEN.getIndex());  
		row = sh.createRow(currentRow++);cell = row.createCell(0);
		cell.setCellValue("##");
		cell.setCellStyle(blue);
		
		cell = row.createCell(1);
		cell.setCellValue("PLayer A");
		
		cell = row.createCell(2);
		cell.setCellValue("PLayer B");

		int matchesWonByA = 0, matchesWonByB = 0;

		for(int match = 1; match <= numberOfMatches; match++) {
			int playerA_score = 0, playerB_score = 0;
			 
			row = sh.createRow(currentRow++);cell = row.createCell(0);
			cell.setCellValue("Match " + match);


			while(true) {

				playerA_Hand = random.nextInt(7);
				playerB_Hand = random.nextInt(7);
			
				if(playerA_Hand == playerB_Hand) {
					
					break;
				}
				if(turn == true)
					playerA_score += playerA_Hand;
				else
					playerB_score += playerB_Hand;
			}
			cell = row.createCell(1);
			cell.setCellValue(playerA_score);
			
			cell = row.createCell(2);
			cell.setCellValue(playerB_score);
			
			if(playerA_score == playerB_score) {
//				cell = row.createCell(0);
//				cell.setCellValue("Match Tied");
			}
			else if(playerA_score > playerB_score) {
//				int AwonBy = playerA_score - playerB_score;
//				row = sh.createRow(currentRow++);cell = row.createCell(0);
//				cell.setCellValue("A won the game by " + AwonBy + " runs.");

				matchesWonByA++;
			}
			else if(playerA_score < playerB_score) {
//				int BwonBy = playerB_score - playerA_score;
//				row = sh.createRow(currentRow++);cell = row.createCell(0);
//				cell.setCellValue("A won the game by " + BwonBy + " runs.");

				matchesWonByB++;
			}
			if(turn == true) turn = false;
			else turn = true;
			currentRow++;
		}
		currentRow++;

		if(matchesWonByA > matchesWonByB) {
			row = sh.createRow(currentRow++);cell = row.createCell(0);
			cell.setCellValue("A won the Championship!");

		}
		else {
			row = sh.createRow(currentRow++);cell = row.createCell(0);
			cell.setCellValue("B won the Championship!");
		}
		wb.write(fos);
		fos.flush();
		fos.close();
		System.out.println("Done!");

	}

}
