package com.bkacad.nnt.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvAnimals;
    private List<Animal> dataAnimals;

    private MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind id
        lvAnimals = findViewById(R.id.lvAnimals);

        // Du lieu
        dataAnimals = new ArrayList<>();
        dataAnimals.add(new Animal("Lion", "https://cdn.wallpapersafari.com/22/41/HjTMF8.jpg"));
        dataAnimals.add(new Animal("Tiger", "https://i.pinimg.com/564x/e6/59/91/e659911c1c420310b6da11e4e0b690f2.jpg"));
        dataAnimals.add(new Animal("Camel","https://pinkpetunias.com.au/image/cache/catalog/products/toys/animals/camel/camel-500x500.jpg"));

        // Tao Adapter
        myAdapter = new MyAdapter(MainActivity.this, dataAnimals);

        // Set adapter cho listview
        lvAnimals.setAdapter(myAdapter);
    }
}