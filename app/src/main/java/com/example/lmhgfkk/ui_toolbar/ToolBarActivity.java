package com.example.lmhgfkk.ui_toolbar;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class ToolBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationIcon(R.drawable.ic_menu_white_18dp);
        toolbar.setLogo(R.drawable.ic_pets_white_36dp);

        toolbar.setTitle("大标题");
        toolbar.setSubtitle("小标题");
        toolbar.inflateMenu(R.menu.appbar);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_collect:
                        Toast.makeText(ToolBarActivity.this,"收藏",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.action_search:
                        Toast.makeText(ToolBarActivity.this,"搜索",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.action_setting:
                        Toast.makeText(ToolBarActivity.this,"设置",Toast.LENGTH_SHORT).show();
                        return true;

                }
                return true;
            }
        });

    }


}
