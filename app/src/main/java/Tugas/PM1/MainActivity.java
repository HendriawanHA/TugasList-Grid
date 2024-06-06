package Tugas.PM1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Itemlist> itemList = new ArrayList<>();
        itemList.add(new Itemlist("Konosuba 3","Kono Subarashi Sekai ni Shukufuku wo! 3","https://cdn.myanimelist.net/images/anime/1758/141268.webp"));
        itemList.add(new Itemlist("Jissan Baasan Wakagaeru","Grandpa and Grandma Turn Young Again","https://cdn.myanimelist.net/images/anime/1676/141714.webp"));
        itemList.add(new Itemlist("Mahouka Koukou no Rettousei 3rd Season","The Irregular At Magic High School 3","https://cdn.myanimelist.net/images/anime/1100/142255.webp"));

        AdapterList myAdapter = new AdapterList(itemList);
        recyclerView.setAdapter(myAdapter);
    }
}
