package design.dunzo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * {
  "machine": {
    "outlets": {
      "count_n": 3
    },
    "total_items_quantity": {
      "hot_water": 500,
      "hot_milk": 500,
      "ginger_syrup": 100,
      "sugar_syrup": 100,
      "tea_leaves_syrup": 100
    },
    "beverages": {
      "hot_tea": {
        "hot_water": 200,
        "hot_milk": 100,
        "ginger_syrup": 10,
        "sugar_syrup": 10,
        "tea_leaves_syrup": 30
      },
      "hot_coffee": {
        "hot_water": 100,
        "ginger_syrup": 30,
        "hot_milk": 400,
        "sugar_syrup": 50,
        "tea_leaves_syrup": 30
      },
      "black_tea": {
        "hot_water": 300,
        "ginger_syrup": 30,
        "sugar_syrup": 50,
        "tea_leaves_syrup": 30
      },
      "green_tea": {
        "hot_water": 100,
        "ginger_syrup": 30,
        "sugar_syrup": 50,
        "green_mixture": 30
      },
    }
  }
}
 */
public class CoffeeMachine {
	private Map<String, Integer> ingredientStock = new HashMap<>();
	private List<Beverages> beveragesList = new LinkedList<>();
	private Map<String, String> mapConvert = new HashMap<>();
	private int outlet = 1;

	private void updateMap() {
		mapConvert.put( "hot_water","HOT_WATER");
		mapConvert.put( "hot_milk","HOT_MILK");
		mapConvert.put( "ginger_syrup","GINGER_SYRUP");
		mapConvert.put( "sugar_syrup","SUGAR_SYRUP");
		mapConvert.put( "tea_leaves_syrup","TEA_LEAVES_SYRUP");
		mapConvert.put( "green_mixture","GREEN_MIXTURE");
	}

	private void initIngredientQuantity(JSONObject itemQuantity) { // total_items_quantity
		Set<String> val = itemQuantity.keySet();
		for(String item: val) {
			ingredientStock.put(item,ingredientStock.get(item));
		}
	}

	public void init(JSONObject input) {
		// parse :TODO
		initRecipies(input);
		initIngredientQuantity(input);
	}

	private void initRecipies(JSONObject recipie) { // beverages
		
	}

	public void showMenu() {
		int i = 0;
		for (Beverages item : beveragesList) {
			System.out.println("Item  " + i + " :" + item.getBeverage_name());
			i++;
		}

	}

	public void showCurrentStock() {
		System.out.println("Current Stock");
		/*for (Ingredients ing : ingredientStock.keySet()) {
			System.out.println(" Ingredient Name " + ing.toString().toLowerCase() + " " + ingredientStock.get(ing));
		}*/
	}

	private boolean checkIngredientStockForBeverage() {
		return false;
	}

	public void serveBeverage(List<Beverages> input) {
		if (input.size() > outlet) {
			System.out.println("Cannot serve more beverages than no. of outlet at the same time");
		}
		for (Beverages beverage : input) {
			if (checkIngredientStockForBeverage()) {

			}
		}
	}

	public static void main(String[] args) throws Exception {
		if (args.length < 1) {
			throw new Exception("No json file provided or argument length can only be 1");
		}

		Map<Ingredients, Integer> ingredientMap = new HashMap<>();
		ingredientMap.put(Ingredients.HOT_WATER, 12);

		Beverages coffee = new Beverages("coffee", ingredientMap);
		String jsonPath = args[0].toString();
		System.out.println(args[0]);
		try (FileReader reader = new FileReader(jsonPath)) {
			JSONObject obj = (JSONObject) new JSONParser().parse(reader);
			JSONObject jo = obj;
			JSONObject machine = (JSONObject) jo.get("machine");

			System.out.println(machine.keySet());
			JSONObject beverages = (JSONObject) machine.get("beverages");
			System.out.println(beverages.keySet());
			JSONObject total_items_quantity = (JSONObject) machine.get("total_items_quantity");
			System.out.println(total_items_quantity.get("hot_milk"));
			System.out.println(total_items_quantity.keySet());
			
			Set<String> val = beverages.keySet();
			for (String item : val) {
				System.out.println(item+" >> ");
				JSONObject beverage = (JSONObject) beverages.get(item);
				Set<String> bev = beverage.keySet();
				for (String i : bev) {
					System.out.println(i +" : "+beverage.get(i));
				}
			}
			for (Object o : machine.entrySet()) {
				Map.Entry<String, Object> entry = (Map.Entry<String, Object>) o;
			}



		} catch (JSONException err) {
			err.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}