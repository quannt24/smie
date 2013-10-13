package com.ict.ke;

import java.io.IOException;

import com.ict.ke.engine.Evaluate;
import com.ict.ke.engine.Ingredient;
import com.ict.ke.engine.Parser;
import com.ict.ke.engine.user.User;

public class Dummy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			// TODO parse ingredient
			Parser.parseIngredient("res/data/ingredient.csv");
			for (Ingredient ingredient : Parser.listIngredients)
				ingredient.print();
			
			// TODO user index
			User user = new User();
			user.setName("Lê Quân");
			user.setYear(1991);
			user.setHeight(165);
			user.setWeight(72);
			user.setActivity(User.ACTIVITY_MANY);
			
			// TODO calculate index;
			float BMI = user.getWeight() * 10000 / user.getHeight() / user.getHeight();
			
			System.out.println("BMI = " + BMI);
			System.out.println("Evaluation = " + Evaluate.evaluate(BMI));
		}
		catch (IOException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Done");
		}
	}

}
