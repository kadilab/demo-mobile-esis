package org.esissalama.mobile.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView dice = (ImageView) findViewById(R.id.dice);
        View jouer = (Button) findViewById(R.id.btn_jouer);
        jouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rand =  new Random().nextInt(6)+1;
                int imageListe[] = {
                        R.drawable.dice_1,
                        R.drawable.dice_2,
                        R.drawable.dice_3,
                        R.drawable.dice_4,
                        R.drawable.dice_5,
                        R.drawable.dice_6
                };
                int image ;
                switch (rand)
                {
                    case 1:
                        image =  imageListe[0];
                        break;
                    case 2:
                        image =  imageListe[1];
                        break;
                    case 3:
                        image =  imageListe[2];
                        break;
                    case 4:
                        image =  imageListe[3];
                        break;
                    case 5:
                        image =  imageListe[4];
                        break;
                    case 6:
                        image =  imageListe[5];
                        break;
                    default:
                        image= imageListe[1];;
                        break;
                }

                dice.setImageResource(image);

            }
        });
    }
}