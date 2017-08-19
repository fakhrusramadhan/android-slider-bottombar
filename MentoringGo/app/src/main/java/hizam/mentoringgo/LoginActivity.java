package hizam.mentoringgo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hizam.mentoringgo.Utility.BlurBuilder;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.bgLogin)
    ImageView bgBlur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bg);
        Bitmap blurredBitmap = BlurBuilder.blur(this, bitmap);
        bgBlur.setImageBitmap(blurredBitmap);
    }

    @OnClick(R.id.BT_login)
    public void login () {
        Intent keWelcome = new Intent(LoginActivity.this, PetunjukAwalActivity.class);
        startActivity(keWelcome);
    }
}
