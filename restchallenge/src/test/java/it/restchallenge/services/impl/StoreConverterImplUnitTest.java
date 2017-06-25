package it.restchallenge.services.impl;

import it.restchallenge.data.StoreData;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Lfurrer on 25/06/2017.
 */
public class StoreConverterImplUnitTest {

    private StoreConverterImpl storeConverterImpl = new StoreConverterImpl();

    @Test
    public void shouldGetAllStores() {
        String raw = "Store Id,Post Code,City,Address,Opened Date\n" +
                "1525eec4-7bed-4597-bf5a-e06fcede5f4f,AB11 5PS,Aberdeen,\"LSU 1A Union Square, Guild Street\",21/02/1965\n" +
                "15773203-9ce4-4ee1-9373-543b940fa293,AB25 1HZ,Aberdeen,\"1 Bon Accord Centre, George Street\",20/01/1982\n" +
                "f202ea77-6237-4caf-8d97-03c10d41a53c,AB42 1 ZP,Peterhead,\"Unit B1, Drummers Corner\",12/03/1994";
        List<StoreData> result = storeConverterImpl.getAllStoresList(raw);
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.size()); //ignores headline
    }

}
