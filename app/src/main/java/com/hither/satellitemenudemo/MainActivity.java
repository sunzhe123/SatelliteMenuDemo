package com.hither.satellitemenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ext.SatelliteMenu;
import android.view.ext.SatelliteMenuItem;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SatelliteMenu menu = (SatelliteMenu) findViewById(R.id.menu);
        List<SatelliteMenuItem> items = new ArrayList<SatelliteMenuItem>();
        //顺序是从下网上排列,最后添加的就在第一个
        items.add(new SatelliteMenuItem(Config.INDEX_FIVE, R.drawable.ic_3));
        items.add(new SatelliteMenuItem(Config.INDEX_FOUR, R.drawable.ic_4));
        items.add(new SatelliteMenuItem(Config.INDEX_THREE, R.drawable.ic_5));
        items.add(new SatelliteMenuItem(Config.INDEX_TWO, R.drawable.ic_6));
        items.add(new SatelliteMenuItem(Config.INDEX_ONE, R.drawable.ic_2));
        items.add(new SatelliteMenuItem(Config.INDEX_SIX, R.drawable.ic_1));
        menu.addItems(items);

        menu.setOnItemClickedListener(new SatelliteMenu.SateliteClickedListener() {

            public void eventOccured(int id) {
                switch (id) {
                    case Config.INDEX_ONE:
                        clickIndex(id);
                        break;
                    case Config.INDEX_TWO:
                        clickIndex(id);
                        break;
                    case Config.INDEX_THREE:
                        clickIndex(id);
                        break;
                    case Config.INDEX_FOUR:
                        clickIndex(id);
                        break;
                    case Config.INDEX_FIVE:
                        clickIndex(id);
                        break;
                    case Config.INDEX_SIX:
                        clickIndex(id);
                        break;
                }
            }
        });
    }

    public void clickIndex(int id) {
        ToastUtils.showShort(MainActivity.this, "点击了:" + id);
    }
}
