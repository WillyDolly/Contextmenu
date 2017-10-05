package com.thanhtam.contextmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMenu = (TextView)findViewById(R.id.TextMenu);
        //LongClick txtMenu to show
        registerForContextMenu(txtMenu);        // Đăng ký Context bên dưới
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            getMenuInflater().inflate(R.menu.context_menu,menu);
        menu.setHeaderTitle("Chọn môn học:...");
        menu.setHeaderIcon(R.mipmap.ic_launcher);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.MenuAndroid : txtMenu.setText(item.getTitle().toString());
                break;
            case R.id.MenuIOS : txtMenu.setText(item.getTitle().toString());
                break;
            case R.id.MenuUnity : txtMenu.append(item.getTitle().toString());
                break;
            case R.id.MenuPHP : txtMenu.append(item.getTitle().toString());
                break;
// append Thêm vào bên phải textview:
        }
        return super.onContextItemSelected(item);
    }
}
