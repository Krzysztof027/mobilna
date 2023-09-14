package com.example.aplikacjam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
String napisyPowitalne[];//tablica
int licznik;//Nowy licznik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        napisyPowitalne = new String[] {"dzień dobry", "good morning", "buenos dias"};

        //Znajdujmy button i TextView2, TextVIew, SeeBar  z activity_main
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView2);
        TextView textView1 = findViewById(R.id.textView);
        SeekBar seeBar = findViewById(R.id.seekBar);
        seeBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        /*Toast.makeText(MainActivity.this,
                                Integer.toString(progress),
                                Toast.LENGTH_SHORT).show();*/
                        textView.setTextSize(progress);
                        textView1.setText("Rozmiar: "+String.valueOf(progress));

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );


        //Wykonujemy metodę setOnClickListener
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        licznik++;
                        if(licznik == napisyPowitalne.length){
                            licznik = 0;
                        }
                        textView.setText(napisyPowitalne[licznik]);//kominikat wyświetlajacy napisy
                    }
                }
        );
    }
}