package android.example.com.hungryadmin;

/**
 * Created by Aakash on 11-09-2017.
 */

public class UserStructure {

public String userdetails;

    public UserStructure(){

    }

    public UserStructure(String userdetails) {
        this.userdetails = userdetails;
    }

    public String getUserdetails() {
        return userdetails;
    }

    public void setUserdetails(String userdetails) {
        this.userdetails = userdetails;
    }
}
