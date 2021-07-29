package com.example.recyclerview6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> modelList;
    Cycleview cycleview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        modelList = new ArrayList<>();

        modelList.add( new Model( R.drawable.williamson,"he plays" ) );
        modelList.add( new Model( R.drawable.williamson,"he plays" ) );
        modelList.add( new Model( R.drawable.williamson,"he plays" ) );
        modelList.add( new Model( R.drawable.williamson,"he plays" ) );
        modelList.add( new Model( R.drawable.williamson,"he plays" ) );
        modelList.add( new Model( R.drawable.williamson,"he plays" ) );

        recyclerView = findViewById( R.id.recycler );
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ));
        Cycleview cycleview = new Cycleview( this,modelList );
        recyclerView.setAdapter( cycleview );

    }
}