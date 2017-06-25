package it.restchallenge.controllers;

import it.restchallenge.data.CreateStoreForm;
import it.restchallenge.data.StoreData;
import it.restchallenge.exceptions.ItemNotFoundException;
import it.restchallenge.facades.StoreFacade;
import it.restchallenge.options.StoreSortBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lfurrer on 24/06/2017.
 */
@RestController
public class StoresController {

    @Autowired
    private StoreFacade storeFacade;

    @RequestMapping(value = "/stores/{id}", method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public StoreData getStore(@PathVariable final String id) {
        StoreData store = storeFacade.getStoreById(id);
        if (store == null) {
            throw new ItemNotFoundException();
        }
        return store;
    }

    @RequestMapping(value = "/stores", method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public List<StoreData> getStoresSorted(@RequestParam String order) {
        return storeFacade.getAllStoresSorted(StoreSortBy.valueOf(order.toUpperCase()));
    }

    @RequestMapping(value = "/stores", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createStore(@Valid CreateStoreForm createStoreForm) {
        return;
        // return storeFacade.createStore(createStoreForm);
    }

}
