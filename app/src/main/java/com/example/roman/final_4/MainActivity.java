package com.example.roman.final_4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Button Btn_Email;
    //Button Btn_Maps;
    //Button Btn_Call;
    Button Btn_menu;
    ImageButton img_Btn_maps;
    ImageButton img_Btn_call;
    ImageButton img_Btn_email;


    String Email = "Romanyaremenko95@gmail.com";
    String subjeck = "TEST";
    String text = "Blabla";
    String phoneNub = "tel:0937768619";
    String geoUriString = "geo:49.4528714,32.0431065";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // Btn_Email = (Button) findViewById(R.id.Btn_Emeil);
        //Btn_Maps = (Button) findViewById(R.id.Btn_maps);
        //Btn_Call = (Button) findViewById(R.id.Btn_call);
        Btn_menu = (Button) findViewById(R.id.Btn_menu);
        img_Btn_maps = (ImageButton) findViewById(R.id.img_Btn_maps);
        img_Btn_call = (ImageButton) findViewById(R.id.img_Btn_call) ;
        img_Btn_email = (ImageButton) findViewById(R.id.img_Btn_email);

        //Btn_Email.setOnClickListener(this);
        //Btn_Maps.setOnClickListener(this);
        //Btn_Call.setOnClickListener(this);
        Btn_menu.setOnClickListener(this);
        img_Btn_maps.setOnClickListener(this);
        img_Btn_call.setOnClickListener(this);
        img_Btn_email.setOnClickListener(this);

    }



    public void onClick (View v){
        switch (v.getId()){
            /*case (R.id.Btn_Emeil):
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{Email});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT,subjeck);
                emailIntent.putExtra(Intent.EXTRA_TEXT,text);

                emailIntent.setType ("massage/rfc882");
                startActivity(emailIntent.createChooser(emailIntent,"выберите способ "));
                break;*/
            /*case (R.id.Btn_maps):
                Uri geoUri = Uri.parse(geoUriString);
                Intent geoIntent = new Intent(Intent.ACTION_VIEW,geoUri);
                startActivity(geoIntent);
                break;
            case (R.id.Btn_call):
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL,Uri.parse(phoneNub));
                startActivity(phoneIntent);
                break;*/
            case  (R.id.Btn_menu):
                Intent browseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lacosanostra.ck.ua/"));
                startActivity(browseIntent);
                break;
            case (R.id.img_Btn_maps):
                Uri geoUri = Uri.parse(geoUriString);
                Intent geoIntent = new Intent(Intent.ACTION_VIEW, geoUri);
                startActivity(geoIntent);
                break;
            case (R.id.img_Btn_call):
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse(phoneNub));
                startActivity(phoneIntent);
                break;
            case (R.id.img_Btn_email):
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{Email});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT,subjeck);
                emailIntent.putExtra(Intent.EXTRA_TEXT,text);

                emailIntent.setType ("massage/rfc882");
                startActivity(emailIntent.createChooser(emailIntent,"выберите способ "));
                break;

        }



    }
}
