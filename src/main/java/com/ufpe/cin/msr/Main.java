package com.ufpe.cin.msr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.ufpe.cin.routine.Routine;
import com.ufpe.cin.routine.RoutineBuildFail;


public class Main {
	public static void main(String args[]){
		Map<Integer, Routine> routines = new HashMap<Integer, Routine>();
		routines.put(new Integer(1), new RoutineBuildFail());

		System.out.println(" *** Travis Torrent BD *** ");
		System.out.println("1 - Build Fail's");
		
		System.out.println("Enter your choice: ");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		try {
			routines.get(new Integer(choice)).executeRoutine();
		} catch (NullPointerException e) {
			System.out.println("Choice error!");
		}

	}
}
