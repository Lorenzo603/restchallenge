package it.restchallenge.services.impl;

import com.opencsv.CSVReader;
import it.restchallenge.data.StoreData;
import it.restchallenge.services.StoreService;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lfurrer on 24/06/2017.
 */
@Service
public class StoreServiceImpl implements StoreService {

    private static final String STORES_URL = "https://raw.githubusercontent.com/pearsonpmcuk/codingchallenge/master/stores.csv";

    public String getAllStoresRaw() {
        try {
            return IOUtils.toString(new URL(STORES_URL), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<StoreData> getAllStoresList() {
        String storesRaw = getAllStoresRaw();
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
        return stores;
    }

}
