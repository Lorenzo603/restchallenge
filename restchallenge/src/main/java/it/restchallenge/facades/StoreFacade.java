package it.restchallenge.facades;

import it.restchallenge.data.StoreData;
import it.restchallenge.options.StoreSortBy;

import java.util.List;

/**
 * Created by Lfurrer on 24/06/2017.
 */
public interface StoreFacade {

    StoreData getStoreById(String id);

    List<StoreData> getAllStoresSorted(StoreSortBy sortBy);

    void createStore(StoreData store);

}
