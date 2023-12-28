package mx.edu.isc.tesoem.agcp.p1p2_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImagenActivity extends AppCompatActivity {

    ImageView ivimagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen);
        ivimagen = findViewById(R.id.ivfoto);

        Glide.with(this).load("https://fastly.picsum.photos/id/237/200/300.jpg?hmac=TmmQSbShHz9CdQm0NkEjx1Dyh_Y984R9LpNrpvH2D_U").into(ivimagen);
    }
}