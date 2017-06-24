package it.restchallenge.facades.impl;

import it.restchallenge.data.StoreData;
import it.restchallenge.options.StoreSortBy;
import it.restchallenge.services.StoreService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Lfurrer on 24/06/2017.
 */
public class StoreFacadeImplUnitTest {

    @InjectMocks
    private StoreFacadeImpl storeFacadeImpl = new StoreFacadeImpl();

    @Mock
    private StoreService storeService;

    private List<StoreData> mockStores = Arrays.asList(createMockStore("b city", "20/06/1980"), createMockStore("A city", "20/06/2017"), createMockStore("Z city", "20/06/1960"));


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        Mockito.when(storeService.getAllStoresList()).thenReturn(mockStores);
    }

    private StoreData createMockStore(String city, String openedDate) {
        StoreData mock = new StoreData();
        mock.setCity(city);
        mock.setOpenedDate(openedDate);
        return mock;
    }
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
        List<StoreData> result = storeFacadeImpl.getAllStoresSorted(StoreSortBy.CITY);
        Assert.assertEquals("A city", result.get(0).getCity());
        Assert.assertEquals("b city", result.get(1).getCity());
        Assert.assertEquals("Z city", result.get(2).getCity());
    }

    @Test
    public void shouldGetAllStoresSorted_ByOpenedDate() {
        List<StoreData> result = storeFacadeImpl.getAllStoresSorted(StoreSortBy.OPENED_DATE);
        Assert.assertEquals("Z city", result.get(0).getCity());
        Assert.assertEquals("b city", result.get(1).getCity());
        Assert.assertEquals("A city", result.get(2).getCity());
    }

    @Test
    public void shouldCreateStore() {

    }

}
