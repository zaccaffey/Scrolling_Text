package com.example.scrollingtext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Toast;

import java.io.DataOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScrollView scrollView = findViewById(R.id.scrollView);
        registerForContextMenu(scrollView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.equals("Edit")) {
            Toast.makeText(this, "You selected edit", Toast.LENGTH_SHORT).show();
        } else if (item.equals("Share")) {
            Toast.makeText(this, "You selected share", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You selected delete", Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }
}