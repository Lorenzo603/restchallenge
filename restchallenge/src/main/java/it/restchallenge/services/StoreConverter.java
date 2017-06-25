package it.restchallenge.services;

import it.restchallenge.data.StoreData;

import java.util.List;

/**
 * Created by Lfurrer on 25/06/2017.
 */
public interface StoreConverter {

    List<StoreData> getAllStoresList(String storesRaw);

}
