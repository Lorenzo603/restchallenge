package it.restchallenge.services.impl;

import it.restchallenge.data.StoreData;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Lfurrer on 24/06/2017.
 */
public class StoreServiceImplIntegrationTest {

    private StoreServiceImpl storeServiceImpl = new StoreServiceImpl();

    @Test
    public void shouldGetAllStoresRaw() {
        String storesRaw = storeServiceImpl.getAllStoresRaw();
        Assert.assertNotNull(storesRaw);
        Assert.assertFalse(storesRaw.isEmpty());
    }

    @Test
    public void shouldGetAllStores() {
        List<StoreData> result = storeServiceImpl.getAllStoresList();
        Assert.assertNotNull(result);
        Assert.assertFalse(result.isEmpty());

    }

}
