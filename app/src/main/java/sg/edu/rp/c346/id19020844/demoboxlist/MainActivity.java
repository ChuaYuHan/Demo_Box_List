package sg.edu.rp.c346.id19020844.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<Box> alBoxList;
    CustomAdapter caBox;
    ImageView ivColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alBoxList = new ArrayList<>();

        lvBox = findViewById(R.id.listViewColor);
        ivColor = findViewById(R.id.imageViewColor);
        alBoxList.add(new Box("blue"));
        alBoxList.add(new Box("orange"));
        alBoxList.add(new Box("brown"));

        caBox = new CustomAdapter(this, R.layout.row, alBoxList);
        lvBox.setAdapter(caBox);
    }
}
