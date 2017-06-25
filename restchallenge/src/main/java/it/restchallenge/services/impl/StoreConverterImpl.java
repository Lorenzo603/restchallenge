package it.restchallenge.services.impl;

import com.opencsv.CSVReader;
import it.restchallenge.data.StoreData;
import it.restchallenge.services.StoreConverter;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lfurrer on 25/06/2017.
 */
@Service
public class StoreConverterImpl implements StoreConverter {

    @Override
    public List<StoreData> getAllStoresList(String storesRaw) {
        CSVReader csvReader = new CSVReader(new StringReader(storesRaw));
        String [] nextLine;
        List<StoreData> stores = new ArrayList<>();
        try {
            while ((nextLine = csvReader.readNext()) != null) {
                StoreData store = new StoreData();
                store.setId(nextLine[0]);
                store.setPostCode(nextLine[1]);
                store.setCity(nextLine[2]);
                store.setAddress(nextLine[3]);
                store.setOpenedDate(nextLine[4]);
                stores.add(store);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        stores.remove(0); // remove header line
        return stores;
    }
}
