package com.example.dell.a3_list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    TextView textView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        list = new ArrayList<String>();
        list.add("Vũ Khánh Hà");
        list.add("Nguyễn Viết Cương");
        list.add("Lâm Chấn Huy");
        list.add("Trương Quỳnh Anh");
        //simple_list_item là cái item layout có sẵn
        adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str = list.get(i);
                textView.setText(str);
            }
        });
    }
    private void anhXa(){
        listView = (ListView)findViewById(R.id.lv);
        textView = (TextView)findViewById(R.id.tv);
    }
}
