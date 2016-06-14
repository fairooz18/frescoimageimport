package com.fairoozzafar.fresco_new;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private SimpleDraweeView sdvImage;

    private void findViews() {
        button = (Button) findViewById(R.id.button);
        sdvImage = (SimpleDraweeView) findViewById(R.id.sdv_image);
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        findViews();

        final Uri imageUri = Uri.parse("http://www.mohanitea.com/wp-content/uploads/2015/01/UmuUr.jpg");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sdvImage.setImageURI(imageUri);
            }
        });
    }
}