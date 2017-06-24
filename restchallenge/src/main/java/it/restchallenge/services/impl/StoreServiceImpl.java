package it.restchallenge.services.impl;

import it.restchallenge.services.StoreService;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URL;

/**
 * Created by Lfurrer on 24/06/2017.
 */
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

}
