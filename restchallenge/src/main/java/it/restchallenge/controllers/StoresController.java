package it.restchallenge.controllers;

import it.restchallenge.data.StoreData;
import it.restchallenge.facades.StoreFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lfurrer on 24/06/2017.
 */
@RestController
public class StoresController {

    @Autowired
    private StoreFacade storeFacade;

    @RequestMapping("/stores")
    public StoreData getStore() {
        return storeFacade.getStoreById("");
    }

}
