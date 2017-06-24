package it.restchallenge.controllers;

import it.restchallenge.data.StoreData;
import it.restchallenge.facades.StoreFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Lfurrer on 24/06/2017.
 */
@RestController
public class StoresController {

    @Autowired
    private StoreFacade storeFacade;

    @RequestMapping(value = "/stores", method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public StoreData getStore(@RequestParam String id) {
        return storeFacade.getStoreById(id);
    }

}
