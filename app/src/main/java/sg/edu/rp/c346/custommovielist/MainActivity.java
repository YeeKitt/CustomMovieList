package sg.edu.rp.c346.custommovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    //Step 1b: Create a ListView variable
    ListView lvMovie;
    //Step 2a: Create an ArrayList variable using class
    ArrayList<MovieItem> alMovieList;

    //Step 3a: Create an CustomAdapter variable
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 1c: Bind the ListVIew UI element to the java variable
        lvMovie = findViewById(R.id.listViewMovie);

        //Step 2b: Initialize the ArrayList
        alMovieList = new ArrayList<>();

        //Step 2c: Create data using class, Add data into ArrayList
        MovieItem movie1 = new MovieItem("Avengers Infinity War", "Release Date: 2018.04");
        MovieItem movie2 = new MovieItem("Justice League", "Release Date: 2017.11");

        alMovieList.add(movie1);
        alMovieList.add(movie2);

        //Step 3b: Initialize the CustomAdapter and bind it to the ArrayList
        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);

        //Step 4: Bind ListView to the CustomAdapter
        lvMovie.setAdapter(caMovie);
    }
}
