package EkoSatria.jfood.controller;

import EkoSatria.jfood.*;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/food")
@RestController
public class FoodController {

    @RequestMapping(value = "/food", method = RequestMethod.GET)
    public ArrayList<Food> getAllFood()
    {
        ArrayList<Food> foods;
        foods = DatabaseFood.getFoodDatabase();
        return foods;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Food getFoodById(@PathVariable int id)
    {
        Food food = null;
        try {
            food = DatabaseFood.getFoodById(id);
        }
        catch (FoodNotFoundException e)
        {
            e.getMessage();
            return null;
        }
        return food;
    }

    @RequestMapping(value = "{sellerId}", method = RequestMethod.GET)
    public  Food getFoodBySeller(@PathVariable int id){
        ArrayList<Food> food;
        try {
            food = DatabaseFood.getFoodBySeller(id);
        }
        catch (SellerNotFoundException e){
            e.getMessage();
            return null;
        }
        return food;
    }

    @RequestMapping(value = "{sellerId}", method = RequestMethod.GET)
    public Food getFoodByCategory(@PathVariable FoodCategory category)
    {
        Food food;
        try {
            food = DatabaseFood.getFoodByCategory(category);
        }
        catch (SellerNotFoundException e){
            e.getMessage();
            return null;
        }
        return food;
    }

    @RequestMapping(value = "/food/", method = RequestMethod.POST)
    public Food addFood(@RequestParam(value = "name") String name,
                        @RequestParam(value = "price") int  price,
                        @RequestParam(value = "category") FoodCategory category,
                        @RequestParam(value = "sellerId") Seller seller){
        Food food = new Food(DatabaseFood.getLastId()+1, name,seller, price,category);
        if(DatabaseFood.addFood(food)){
        return food;}
        return null;
    }
    }
