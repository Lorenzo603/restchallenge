package it.restchallenge.facades.impl;

import it.restchallenge.data.StoreData;
import it.restchallenge.options.StoreSortBy;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Lfurrer on 24/06/2017.
 */
public class StoreFacadeImplUnitTest {

    private StoreFacadeImpl storeFacadeImpl = new StoreFacadeImpl();

    @Test
    public void shouldGetStoreById_ExistingStore() {
         storeFacadeImpl.getStoreById("1525eec4-7bed-4597-bf5a-e06fcede5f4f");
    }

    @Test
    public void shouldGetStoreById_NoStoreExists() {
        Assert.assertNull(storeFacadeImpl.getStoreById("DoesNotExist"));
    }

    @Test
    public void shouldGetStoreById_IgnoreHeaderLine() {
        storeFacadeImpl.getStoreById("Store Id");
    }

    @Test
    public void shouldGetAllStoresSorted_ByCity() {

    }

    @Test
    public void shouldGetAllStoresSorted_ByOpenedDate() {

    }

    @Test
    public void shouldCreateStore() {

    }

}
