package it.restchallenge.services.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Lfurrer on 24/06/2017.
 */
public class StoreServiceImplIntegrationTest {

    private StoreServiceImpl storeServiceImpl = new StoreServiceImpl();

    @Test
    public void shouldGetAllStores() {
        String storesRaw = storeServiceImpl.getAllStoresRaw();
        Assert.assertNotNull(storesRaw);
        Assert.assertFalse(storesRaw.isEmpty());
        System.out.println(storesRaw);
    }

}
