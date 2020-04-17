package EkoSatria.jfood.controller;

import EkoSatria.jfood.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/promo")
@RestController
public class PromoController {

    @RequestMapping(value = "/promo", method = RequestMethod.GET)
    public ArrayList<Promo> getAllPromo(){
        ArrayList<Promo> promo;
        promo=DatabasePromo.getPromoDatabase();
        return promo;
    }

    @RequestMapping(value = "/{code}", method = RequestMethod.POST)
    public Promo getPromoByCode(@PathVariable String code)
    {
        Promo promo=null;
        try {
            promo =DatabasePromo.getPromoByCode(code);
        }
        catch (PromoNotFoundException e){
            e.getMessage();
            return null;
        }
        return promo;
    }

    @RequestMapping(value = "/promo", method = RequestMethod.POST)
    public Promo addPromo(@RequestParam(value = "code") String code,
                          @RequestParam(value = "discount") int discount,
                          @RequestParam(value = "minPrice") int minPrice,
                          @RequestParam(value = "active")boolean active){
        Promo promo = new Promo(DatabasePromo.getLastId()+1, code, discount, minPrice,active);
        if (DatabasePromo.addPromo(promo)){
            return promo;
        }
        return null;
    }
}
