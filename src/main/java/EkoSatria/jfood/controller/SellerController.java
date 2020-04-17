package EkoSatria.jfood.controller;

import EkoSatria.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/seller")
@RestController
public class SellerController {

    @RequestMapping(value = "/sellers", method = RequestMethod.GET)
    public ArrayList<Seller> getAllSeller(){
        ArrayList<Seller> sellers;
        sellers=DatabaseSeller.getSellerDatabase();
        return sellers;
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public Seller getSellerByid(@PathVariable int id){
        Seller seller;
        try {
            seller =DatabaseSeller.getSellerDatabase();
        }
        catch (SellerNotFoundException e){
            e.getMessage();
            return null;
        }
        return seller;
    }

    @RequestMapping(value = "/seller", method = RequestMethod.POST)
    public Seller addSeller(@RequestParam(value = "name") String name,
                            @RequestParam(value = "email") String email,
                            @RequestParam(value = "phone number") String phoneNumber,
                            @RequestParam(value = "province") String province,
                            @RequestParam(value = "description") String description,
                            @RequestParam(value = "city") String city){
        Seller seller = new Seller(DatabaseSeller.getLastId()+1, name, email, phoneNumber, new Location(city, province, description));
        if (DatabaseSeller.addSeller(seller)){
            return  seller;
        }
        return null;
    }
}
