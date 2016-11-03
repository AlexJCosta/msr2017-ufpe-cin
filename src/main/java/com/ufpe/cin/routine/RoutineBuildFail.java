package com.ufpe.cin.routine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RoutineBuildFail implements Routine {
	public static final String URL_ARCHIVE = "travistorrent_27_10_2016.csv";
	
	private static final int COLUMN_TR_STATUS = 33;

	public void executeRoutine() {
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(new FileReader(URL_ARCHIVE));
			int currentLine = 0;
			while (bufferedReader.ready()) {
				currentLine++;
				String line = bufferedReader.readLine();
				String[] lineBroke = line.split(",");
				this.printReport(lineBroke);
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] " + e.getMessage());
		} catch (IOException e) {
			System.out.println("[ERROR] " + e.getMessage());
		}
	}

	private void printReport(String[] lineBroke) {
		if (lineBroke != null && lineBroke.length > 0) {
			System.out.println("tr_status: " + lineBroke[COLUMN_TR_STATUS]);
		}		
	}

}
