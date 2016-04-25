package io.github.leibnik.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    ListView listView;
    String[] texts = new String[]{"Hello World!", "I'm leibnik", "nice to meet you"};
    int[] images = new int[]{R.mipmap.avatar_small, R.mipmap.girl, R.mipmap.robot, R.mipmap.android};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        List<ChatBean> datas = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ChatBean data = new ChatBean();
            data.type = (int) (Math.random() * 4);
            data.text = texts[(int) (Math.random() * texts.length)];
            data.imgId = images[(int) (Math.random() * images.length)];
            datas.add(data);
        }
        listView.setAdapter(new ChatAdapter(this, datas));
    }

}
