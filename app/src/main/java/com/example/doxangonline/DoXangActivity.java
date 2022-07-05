package com.example.doxangonline;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class DoXangActivity extends AppCompatActivity {
    TextView textView;
    TextView txtDonvi;
    Button btnXOg;
    int count =0;
    float donvi =0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_xang);
        textView = findViewById(R.id.txtView);
        txtDonvi = findViewById(R.id.txtDonvi);
        btnXOg = findViewById(R.id.btnXong);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        int result = bundle.getInt("money", 0);
        if(result == 20){

               Timer T=new Timer();

               T.scheduleAtFixedRate(new TimerTask() {
                   @Override
                   public void run() {
                       textView.setText(count + "0VND");
                       txtDonvi.setText(String.format("%.03f", donvi)+ " Lít");
                       count++;
                       donvi+=0.00031;

                       if (count == 2001){
                           cancel();
                           txtDonvi.setText("0.608 Lít");
                           textView.setText("20 000VND");
                       }
                   }
               }, 0, 1);

        }else if(result == 30){
            Timer T=new Timer();

            T.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    textView.setText(count+ "0VND");
                    txtDonvi.setText(String.format("%.03f", donvi) + " Lít");
                    count+=2;
                    donvi+=0.00066;
                    if (count == 3002){
                        cancel();
                        txtDonvi.setText("0.913 Lít");
                        textView.setText("30 000VND");
                    }
                }
            }, 1, 1);
        }else if(result == 50){
            Timer T=new Timer();

            T.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    textView.setText(count+ "0VND");
                    txtDonvi.setText(String.format("%.03f", donvi)  + " Lít");
                    count +=4;
                    donvi+=0.00125;
                    if (count == 5004){
                        cancel();
                        txtDonvi.setText("1.522 Lít");
                        textView.setText("50 000VND");

                    }
                }
            }, 1, 2);
        }else if(result == 70){
            Timer T=new Timer();

            T.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    textView.setText(count+ "0VND");
                    txtDonvi.setText(String.format("%.03f", donvi) + " Lít");
                    count+=3;
                    donvi+=0.00088;
                    if (count == 7002){
                        cancel();
                        txtDonvi.setText("2.13 Lít");
                         textView.setText("70 000VND");
                    }
                }
            }, 1, 1);
        }else if(result == 100){
            Timer T=new Timer();

            T.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    textView.setText(count+ "0VND");
                    txtDonvi.setText(String.format("%.03f", donvi) + " Lít");
                    count+=3;
                    donvi+=0.00091;
                    if (count == 10002){
                        cancel();
                        txtDonvi.setText("3.04 Lít");
                        textView.setText("100 000VND");
                    }
                }
            }, 1, 1);
        }else{
            Timer T=new Timer();

            T.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    textView.setText(count + "0VND");
                    txtDonvi.setText(String.format("%.03f", donvi) + " Lít");
                    count+=2;
                    donvi+=0.00061;

                    if (count == 15002){
                        cancel();
                        txtDonvi.setText("4.566 Lít");
                        textView.setText("Đã đầy bình");
                    }
                }
            }, 1, 1);
        }
        btnXOg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}