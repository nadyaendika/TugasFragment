package com.example.tugasfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    Button btnHome,btnAbout,btnHelp,btnExit;
    Home home;
    About about;
    Help help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome=(Button)findViewById(R.id.home);
        btnAbout=(Button)findViewById(R.id.about);
        btnHelp=(Button)findViewById(R.id.help);
        btnExit=(Button)findViewById(R.id.exit);

        btnHome.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnHelp.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    void mHome(){
        FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
        home=new Home();
        fTrans.replace(R.id.container,home);
        fTrans.commit();
    }
    void mAbout(){
        FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
        about=new About();
        fTrans.replace(R.id.container,about);
        fTrans.commit();
    }
    void mHelp(){
        FragmentTransaction fTrans=getSupportFragmentManager().beginTransaction();
        help=new Help();
        fTrans.replace(R.id.container,help);
        fTrans.commit();
    }

    @Override
    public void onClick(View v) {
        if (v==btnHome)
            mHome();
        if (v==btnAbout)
            mAbout();
        if (v==btnHelp)
            mHelp();
        if (v==btnExit)
            finish();
    }
}