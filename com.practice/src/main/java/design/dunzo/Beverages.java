package design.dunzo;

import java.util.Map;

public class Beverages {
    
    String beverageName;
    Map<Ingredients,Integer> ingredientMap ;
    public Beverages(String beverageName,Map<Ingredients,Integer> ingredientMap){
    	this.beverageName = beverageName;
        this.ingredientMap =  ingredientMap;
    }
    
    public String getBeverage_name() 
    { 
        return beverageName; 
    } 
    public Map<Ingredients,Integer> getIngredients(){
    	return this.ingredientMap;
    }
    //public abstract void setIngredientQuantity(Map<Ingredients,Integer> ingredientMap); 
}

