package com.rankend.barankaraboa.bottombarpopup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deneme);

        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pop ornegi olusturma
                PopupMenu popup = new PopupMenu(MainActivity.this, btn1);
                //xml kullanarak inflate etme
                popup.getMenuInflater()
                        .inflate(R.menu.popup_menu, popup.getMenu());

                //pop up listener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(
                                MainActivity.this,
                                "Týklandý : " + item.getTitle(),
                                Toast.LENGTH_SHORT
                        ).show();
                        return true;
                    }
                });

                popup.show(); //pop up gosterme
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pop ornegi olusturma
                PopupMenu popup = new PopupMenu(MainActivity.this, btn2);
                //xml kullanarak inflate etme
                popup.getMenuInflater()
                        .inflate(R.menu.popup_menu, popup.getMenu());

                //pop up listener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(
                                MainActivity.this,
                                " Týklandý : " + item.getTitle(),
                                Toast.LENGTH_SHORT
                        ).show();
                        return true;
                    }
                });

                popup.show(); //pop up gosterme
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pop ornegi oluþturma
                PopupMenu popup = new PopupMenu(MainActivity.this, btn3);
                //xml kullanarak inflate etme
                popup.getMenuInflater()
                        .inflate(R.menu.popup_menu, popup.getMenu());

                //pop up listener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(
                                MainActivity.this,
                                "Týklandý : " + item.getTitle(),
                                Toast.LENGTH_SHORT
                        ).show();
                        return true;
                    }
                });

                popup.show(); //pop up gösterme
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pop örneði oluþturma
                PopupMenu popup = new PopupMenu(MainActivity.this, btn4);
                //xml kullanarak inflat etme
                popup.getMenuInflater()
                        .inflate(R.menu.popup_menu, popup.getMenu());

                //pop up listener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(
                                MainActivity.this,
                                "Týklandý : " + item.getTitle(),
                                Toast.LENGTH_SHORT
                        ).show();
                        return true;
                    }
                });

                popup.show(); //pop up gösterme
            }
        });

    }
}
