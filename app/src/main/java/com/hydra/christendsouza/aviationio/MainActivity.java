package com.hydra.christendsouza.aviationio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.InetAddress;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(isInternetAvailable()) {
            setContentView(R.layout.activity_login);
        }
        else{
            setContentView(R.layout.guest_profile);
        }
    }
    public boolean isInternetAvailable() {
        try {
            InetAddress ipAddr = InetAddress.getByName("google.com"); //You can replace it with your name
            return !ipAddr.equals("");
        } catch (Exception e) {
            return false;
        }

    }

}
