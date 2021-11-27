package com.example.shareappanil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      TextView txt;
      Button btn_share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        txt = findViewById ( R.id.txt );
        btn_share = findViewById ( R.id.btn_share );


        btn_share.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent anil = new Intent (Intent.ACTION_SEND);
                anil.setType ( "text/plain" );
                anil.putExtra ( Intent.EXTRA_SUBJECT,"Insert Subject Here" );
                String app_uri ="https://play.google.com/store/apps/details?";
                anil.putExtra ( Intent.EXTRA_DONT_KILL_APP,app_uri );
                startActivity ( Intent.createChooser ( anil,"Share via" ) );





            }
        } );
    }
}