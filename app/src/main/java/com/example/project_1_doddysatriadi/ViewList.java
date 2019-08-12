package com.example.project_1_doddysatriadi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ViewList extends AppCompatActivity {
    private String[] provinsiDiJawa;
    ListView viewList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list);
        setTitle("List View");

        viewList = findViewById(R.id.viewList);
        provinsiDiJawa = getResources().getStringArray(R.array.kabupatenDiJawaBarat);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                ViewList.this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, provinsiDiJawa);

        viewList.setAdapter(adapter);

        viewList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                        Toast.makeText(ViewList.this, "Memilih : " + provinsiDiJawa[position], Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}

