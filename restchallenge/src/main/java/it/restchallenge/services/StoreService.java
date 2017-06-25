package it.restchallenge.services;

import it.restchallenge.data.StoreData;

import java.util.List;

/**
 * Created by Lfurrer on 24/06/2017.
 */
public interface StoreService {

    String getAllStoresRaw();

    List<StoreData> getAllStores();

}
