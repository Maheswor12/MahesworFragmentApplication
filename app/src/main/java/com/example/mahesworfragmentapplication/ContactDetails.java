package com.example.mahesworfragmentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactDetails extends AppCompatActivity {
private CircleImageView img;
private TextView name,nu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        img=findViewById(R.id.imageView2);
        name=findViewById(R.id.contactName);
        nu=findViewById(R.id.contactPhone);

        Bundle bundle=getIntent().getExtras();
        if(bundle != null){
            img.setImageResource(bundle.getInt("image"));
            name.setText(bundle.getString("name"));
            nu.setText(bundle.getString("Phone"));
        }
    }
}
