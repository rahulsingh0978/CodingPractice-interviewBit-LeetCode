package interview.prep.latest;

import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.Math;



/*/**
 * 
 FAT - FATOil =0 , 
FATOil FIBERSpinach CARBRice FATCheese FIBERBeans FATEgg FIBERBroccoli CARBPotato CARBCorn FATOlive FIBERCarrot CARBBeetroot


6
3
FIBERSpinach CARBRice FIBERBeans FATOil FATCheese FATEgg 
 */

public class onlineAssement {
	static String FAT = "FAT", CARB = "CARB", FIBER = "FIBER";

	public static void main(String[] args) {
		int n = 5;
		ArrayList<String> inputList = new ArrayList<String>();
		;
		Collections.addAll(inputList,
				"FIBERBroccoli FATEgg FIBERPumpkin FATOil CARBPotato FATSalmon CARBWheat FATCheese FIBERSpinach CARBQuinoa CARBOat FATOlive CARBCorn FIBERCarrot CARBRice FATCoconut FIBERBeans FIBERBarley"
						.split(" "));
		printRecipy(n, inputList);

	}

	private static void printRecipy(int n, ArrayList<String> inputList) {
		int length = inputList.size();
		int cutoff = (int) Math.ceil(0.6 * n);
		ArrayList<String> remainList = (ArrayList<String>) inputList.clone();
		ArrayList<String> FATList = new ArrayList<String>();
		ArrayList<String> FIBERList = new ArrayList<String>();
		ArrayList<String> CARBList = new ArrayList<String>();

		ArrayList<String> currentList = new ArrayList<String>();

		String element = null;
		for (int day = 0; day < inputList.size(); day++) {
			String currentDayItem = inputList.get(day);

			// add item to its catagory
			if (currentDayItem.contains(FAT)) {
				FATList.add(currentDayItem);
			} else if (currentDayItem.contains(FIBER)) {
				FIBERList.add(currentDayItem);
			} else {
				CARBList.add(currentDayItem);
			}

			// if recipy condition statisfing?
			if (FATList.size() == cutoff)
				element = FAT;
			else if (FIBERList.size() == cutoff)
				element = FIBER;
			else if (CARBList.size() == cutoff)
				element = CARB;
			if (element == null) {
				// nothing this day
				System.out.print("-");

			} else {
				// can cook so lets cook
				currentList = createRecipyForElement(remainList, element, n, cutoff);
				for (int j = 0; j < currentList.size(); j++) {
					if (j > 0)
						System.out.print(":");
					System.out.print(currentList.get(j));
				}
				// remove items used
				for (String re : currentList) {
					remainList.remove(re);
					FATList.remove(re);
					FIBERList.remove(re);
					CARBList.remove(re);
				}
				currentList.clear();
				element = null;
			}
		}

	}

	private static ArrayList<String> createRecipyForElement(ArrayList<String> possibleItemsForRecipy,
			String mainElement, int recipySize, int cutoff) {
		ArrayList<String> answer = new ArrayList<String>();
		int maxJunk = recipySize - cutoff;
		for (String item : possibleItemsForRecipy) {
			if (item.contains(mainElement)) {
				answer.add(item);
			} else {
				if (maxJunk > 0) {
					answer.add(item);
					maxJunk--;
				}
			}
			if(answer.size()==recipySize) {
				break;
			}
		}
		return answer;
	}

}
