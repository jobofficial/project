package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
CardView servicecard,bookingcard,currencycard,passportcard,visacard,cabcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        servicecard=(CardView)findViewById(R.id.services);
        bookingcard=(CardView)findViewById(R.id.booking);
        currencycard=(CardView)findViewById(R.id.currency);
        passportcard=(CardView)findViewById(R.id.passport);
        visacard=(CardView)findViewById(R.id.visa);
        cabcard=(CardView)findViewById(R.id.cab);
        servicecard.setOnClickListener(this);
        bookingcard.setOnClickListener(this);
        currencycard.setOnClickListener(this);
        passportcard.setOnClickListener(this);
        visacard.setOnClickListener(this);
        cabcard.setOnClickListener(this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
         Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show(); // Handle the camera action
        } else if (id == R.id.nav_gallery) {
          Toast.makeText(this,"Past Booking",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_slideshow) {
         Toast.makeText(this,"Future Booking",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_tools) {
            Toast.makeText(this,"Upcoming",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_share) {
            Toast.makeText(this,"Share",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_send) {
            Toast.makeText(this,"Send",Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.services :
                intent=new Intent(this,Service_activity.class);
                startActivity(intent);break;
            case R.id.booking:
                intent=new Intent(this,Booking_activity.class);
                startActivity(intent);break;
            case R.id.currency:
                intent=new Intent(this,Currency_activity.class);
                startActivity(intent);break;
            case R.id.passport:
                intent=new Intent(this,Passport_activity.class);
                startActivity(intent);break;
            case R.id.visa:
                intent=new Intent(this,Visa_activity.class);
                startActivity(intent);break;
            case R.id.cab:
                intent=new Intent(this,Cab_activity.class);
                startActivity(intent);break;
        }
    }
}
