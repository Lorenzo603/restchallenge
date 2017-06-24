package it.restchallenge.facades.impl;

import it.restchallenge.constants.StoresConstants;
import it.restchallenge.data.StoreData;
import it.restchallenge.facades.StoreFacade;
import it.restchallenge.options.StoreSortBy;
import it.restchallenge.services.StoreService;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
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
        List<StoreData> stores = storeService.getAllStoresList();
        switch (sortBy) {
            case CITY: Collections.sort(stores, Comparator.comparing(o -> o.getCity().toLowerCase()));
            break;
            case OPENED_DATE: Collections.sort(stores, (o1, o2) -> {
                DateTime o1Date = DateTime.parse(o1.getOpenedDate(), DateTimeFormat.forPattern(StoresConstants.DATE_FORMAT));
                DateTime o2Date = DateTime.parse(o2.getOpenedDate(), DateTimeFormat.forPattern(StoresConstants.DATE_FORMAT));
                return  o1Date.compareTo(o2Date);
            }); break;
        }
        return stores;
    }

    public void createStore(StoreData store) {

    }
}
