package hizam.mentoringgo.Fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import hizam.mentoringgo.R;
import hizam.mentoringgo.Utility.BlurBuilder;

/**
 * Created by Fakhrus on 1/30/17.
 */

public class ChatFragment extends Fragment {

    @BindView(R.id.bgChat)
    ImageView bgBlur;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View viewChat = inflater.inflate(R.layout.fragment_chat, container, false);

        ButterKnife.bind(this, viewChat);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.chat);
        Bitmap blurredBitmap = BlurBuilder.blur(getActivity(), bitmap);
        bgBlur.setImageBitmap(blurredBitmap);

        return viewChat;
    }
}
