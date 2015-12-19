package arun.com.chromer.intro;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

import arun.com.chromer.R;

/**
 * Created by Arun on 17/12/2015.
 */
public class AppIntroMy extends AppIntro {

    // Please DO NOT override onCreate. Use init
    @Override
    public void init(Bundle savedInstanceState) {

        // OPTIONAL METHODS
        // Override bar/separator color
        addSlide(AppIntroFragment.newInstance("Chromer",
                "Chomer allows you to use custom tabs feature everywhere in your phone independant of whether the app supports custom tabs.",
                R.drawable.web_hi_res_512,
                ContextCompat.getColor(this, R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("How to use?",
                "Just set chromer as your default browser, chromer will display the link in a non intrusive way.",
                R.drawable.chromer_default_image,
                ContextCompat.getColor(this, R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("Advantages?",
                "Shared login info from Chrome, faster loading, non intrusive, save data, auto complete forms and secure with latest updates!",
                R.drawable.advantages,
                ContextCompat.getColor(this, R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("That's it!",
                "Configure Chromer to your liking by launching the main app. Enjoy and share your thoughts!",
                R.drawable.smile,
                ContextCompat.getColor(this, R.color.colorPrimary)));
        // Hide Skip/Done button
        showSkipButton(false);
        showDoneButton(true);
        showStatusBar(false);
    }

    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        finish();
    }

    @Override
    public void onNextPressed() {

    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public void onSlideChanged() {

    }
}