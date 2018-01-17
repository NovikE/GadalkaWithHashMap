package by.htp.flowers.runner;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import by.htp.flowers.bean.Flower;
import by.htp.flowers.logic.BotanicEncyclopedia;
import by.htp.flowers.logic.FortuneTeller;
import by.htp.flowers.logic.FortuneTellerHashMap;

public class Main {

	public static void main(String[] args) {

		BotanicEncyclopedia enc = new BotanicEncyclopedia();

		String[] answer1 = { "Ans11", "Ans12", "Ans13", "Ans14", "Ans15", "Ans16" };
		FortuneTeller frt1 = new FortuneTeller("Question 1 ", answer1);

		String[] answer2 = { "Ans21", "Ans22", "Ans23", "Ans24" };
		FortuneTeller frt2 = new FortuneTeller("Question 2 ", answer2);

		String[] answer3 = { "Ans31", "Ans32", "Ans33", "Ans34", "Ans35", "Ans36", "Ans37", "Ans38", "Ans39", "Ans310",
				"Ans11", "Ans312" };
		FortuneTeller frt3 = new FortuneTeller("Question 3 ", answer3);

		System.out.println("-------------------");
		System.out.println("New flower born.");
		Flower flower = new Flower("Cammomile", 10, 1);

		enc.printFlowerInfo(flower);

		System.out.println("-------------------");
		System.out.println("Flower grow.");
		flower.grow(25, 3, 5);
		enc.printFlowerInfo(flower);

		System.out.println("-------------------");
		System.out.println("Flower bloom.");
		flower.bloom(8, "yellow");
		enc.printFlowerInfo(flower);

		System.out.println("-------------------");
		System.out.println("Flower wither.");
		flower.wither(4, "haki");
		enc.printFlowerInfo(flower);

		System.out.println("-------------------");
		System.out.println("Quantity of leaves: " + flower.getBud().getLeaves().length);

		frt1.tellTheTruth(flower);
		frt2.tellTheTruth(flower);
		frt3.tellTheTruth(flower);
		
		System.out.println("Please, select the question.");
		System.out.println("1 - Question 1.");
		System.out.println("2 - Question 2.");
		System.out.println("3 - Question 3.");
		
		Scanner in = new Scanner(System.in);
		String quest = in.next();
		
		
		
		HashSet<String> set1 = new HashSet<>();
		
		set1.add("Ans11");
		set1.add("Ans12");
		set1.add("Ans13");
		set1.add("Ans14");
		
		HashSet<String> set2 = new HashSet<>();
		
		set2.add("Ans21");
		set2.add("Ans22");
		set2.add("Ans23");
		set2.add("Ans24");
		
		HashSet<String> set3 = new HashSet<>();
		
		set3.add("Ans31");
		set3.add("Ans32");
		set3.add("Ans33");
		set3.add("Ans34");
		
		HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();
		
		map.put("1", set1);	
		map.put("2", set2);
		map.put("3", set3);
		
		FortuneTellerHashMap frtHM = new FortuneTellerHashMap(map);
		frtHM.tellTheTruth(flower, quest);
		
		

	}

}
