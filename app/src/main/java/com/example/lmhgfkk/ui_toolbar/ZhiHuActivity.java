package com.example.lmhgfkk.ui_toolbar;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class ZhiHuActivity extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_zhihu);

        Toolbar toolbar_zhihu = (Toolbar) findViewById(R.id.toolbar_zhihu);

        toolbar_zhihu.setNavigationIcon(R.drawable.ic_menu_white_18dp);
        toolbar_zhihu.setTitle("首页");
        toolbar_zhihu.setTitleTextColor(getResources().getColor(R.color.colortitle));
        toolbar_zhihu.inflateMenu(R.menu.toolbar_zhihu);

        toolbar_zhihu.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.zhihu_search:
                        Toast.makeText(ZhiHuActivity.this,"搜索",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.zhihu_notifycation:
                        Toast.makeText(ZhiHuActivity.this,"通知",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.zhihu_setting:
                        Toast.makeText(ZhiHuActivity.this,"设置",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.zhihu_about:
                        Toast.makeText(ZhiHuActivity.this,"关于",Toast.LENGTH_SHORT).show();
                        return true;

                }
                return true;
            }
        });

        toolbar_zhihu.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ZhiHuActivity.this,"导航",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
