package by.htp.flowers.logic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import by.htp.flowers.bean.Flower;

public class FortuneTellerHashMap {

	private HashMap<String, HashSet<String>> hm = new HashMap<String, HashSet<String>>();

	public FortuneTellerHashMap(HashMap<String, HashSet<String>> hm) {
		super();
		this.hm = hm;
	}

	public void tellTheTruth(Flower flower, String quest) {

		if (hm.containsKey(quest)) {

			int k = ((flower.getBud().getLeaves().length) % (hm.get(quest).size()));

			if ((!hm.values().isEmpty())) {
				if ((flower.getBud().getLeaves().length) < hm.get(quest).size()) {
					System.out.println("The answer: " + getByIndex(quest, (flower.getBud().getLeaves().length - 1)));
				} else {

					if (k > 0) {
						System.out.println("The answer: " + getByIndex(quest, (k - 1)));
					}
					if (k == 0) {
						System.out.println("The answer: " + getByIndex(quest, k));
					}
					if ((flower.getBud().getLeaves().length) < hm.get(quest).size()) {
						System.out
								.println("The answer: " + getByIndex(quest, (flower.getBud().getLeaves().length - 1)));
					}
				}

			} else
				System.out.println("No leaves.");

		}

	}

	public String getByIndex(String quest, int index) {

		String str = new String();
		int i = 0;

		for (Iterator<String> it = hm.get(quest).iterator(); it.hasNext();) {
			String f = it.next();
			if (i == index) {
				str = f;
				break;
			} else {
				i++;
			}
		}

		return str;
	}
}
