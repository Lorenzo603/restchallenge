package it.restchallenge.facades.impl;

import it.restchallenge.data.StoreData;
import it.restchallenge.facades.StoreFacade;
import it.restchallenge.options.StoreSortBy;
import it.restchallenge.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lfurrer on 24/06/2017.
 */
@Service
public class StoreFacadeImpl implements StoreFacade {

    @Autowired
    private StoreService storeService;

    public StoreData getStoreById(String id) {
        for (StoreData store : storeService.getAllStoresList()) {
            if (id.equals(store.getId())) {
                return store;
            }
        }
        return null;
    }

    public List<StoreData> getAllStoresSorted(StoreSortBy sortBy) {
        return null;
    }

    public void createStore(StoreData store) {

    }
}
