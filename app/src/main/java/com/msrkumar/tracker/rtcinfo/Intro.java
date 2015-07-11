package com.msrkumar.tracker.rtcinfo;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.github.paolorotolo.appintro.AppIntro;
import com.msrkumar.tracker.rtcinfo.Slides.Slide1;
import com.msrkumar.tracker.rtcinfo.Slides.Slide3;
import com.msrkumar.tracker.rtcinfo.Slides.Slide2;


/**
 * Created by msrkumar on 7/10/2015.
 */
public class Intro extends AppIntro implements Slide3.OnFragmentInteractionListener{

    public void init(Bundle savedInstanceState){
            addSlide(Slide1.newInstance("",""), getApplicationContext());
            addSlide(Slide2.newInstance("",""), getApplicationContext());
            addSlide(Slide3.newInstance("",""), getApplicationContext());
    }

        private void loadMainActivity(){
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
    }

    public void onSkipPressed(){
        loadMainActivity();
        Toast.makeText(getApplicationContext(),"Introduction Skipped",Toast.LENGTH_SHORT).show();
    }

    public void onDonePressed() {
        loadMainActivity();
    }

    public void getStated(View v){
        loadMainActivity();
    }

    public void onFragmentInteraction(Uri uri) {

    }
}
