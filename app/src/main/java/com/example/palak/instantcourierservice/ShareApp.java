package com.example.palak.instantcourierservice;


import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ShareActionProvider;


public class ShareApp {

    private ShareActionProvider mShareActionProvider;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate menu resource file.

//        MenuInflater inflater = getMenuInflater();
//
//        inflater.inflate(R.menu.activity_main_drawer, menu);

        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);

        // Locate MenuItem with ShareActionProvider
        MenuItem item = menu.findItem(R.id.nav_share);

        // Fetch and store ShareActionProvider
        mShareActionProvider = (ShareActionProvider) item.getActionProvider();


        if (mShareActionProvider != null) {
//            try {
//                Intent intent = new Intent(android.content.Intent.ACTION_SEND);
//            } catch (Exception e) {
//            }
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            mShareActionProvider.setShareIntent(shareIntent);
        }


        // Return true to display menu
        return true;
    }

    // Call to update the share intent
//    private void setShareIntent() {
//        if (mShareActionProvider != null) {
////            try {
////                Intent intent = new Intent(android.content.Intent.ACTION_SEND);
////            } catch (Exception e) {
////            }
//            Intent shareIntent = new Intent(Intent.ACTION_SEND);
//            mShareActionProvider.setShareIntent(shareIntent);
//        }
//
//    }
}
