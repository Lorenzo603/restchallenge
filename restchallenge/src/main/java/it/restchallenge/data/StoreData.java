package it.restchallenge.data;

/**
 * Created by Lfurrer on 24/06/2017.
 */
public class StoreData {

    private String id;
    private String postCode;
    private String city;
    private String address;
    private String openedDate;
    private int openedDayCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(String openedDate) {
        this.openedDate = openedDate;
    }

    public int getOpenedDayCount() {
        return openedDayCount;
    }

    public void setOpenedDayCount(int openedDayCount) {
        this.openedDayCount = openedDayCount;
    }
}
