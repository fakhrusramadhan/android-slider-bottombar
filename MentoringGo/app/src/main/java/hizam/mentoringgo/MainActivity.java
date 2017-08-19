package hizam.mentoringgo;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import hizam.mentoringgo.Fragment.BroadcastFragment;
import hizam.mentoringgo.Fragment.ChatFragment;
import hizam.mentoringgo.Fragment.EventFragment;
import hizam.mentoringgo.Fragment.HomeFragment;
import hizam.mentoringgo.Fragment.PresenceFragment;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bottomBarMain)
    BottomBar bottomBarMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ButterKnife.bind(this);

        bottomBarMain.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {

                if (tabId == R.id.tab_home){

                    Toast.makeText(MainActivity.this, "BERANDA", Toast.LENGTH_SHORT).show();
                    HomeFragment homeFragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentContainerMain, homeFragment).commit();
                    getSupportActionBar().setTitle("\t Beranda");
                    toolbar.setTitleTextColor(getResources().getColor(R.color.hijau));

                }else if (tabId == R.id.tab_broadcast){

                    Toast.makeText(MainActivity.this, "BROADCAST", Toast.LENGTH_SHORT).show();
                    BroadcastFragment broadcastFragment = new BroadcastFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentContainerMain, broadcastFragment).commit();
                    getSupportActionBar().setTitle("\t Broadcast");
                    toolbar.setTitleTextColor(getResources().getColor(R.color.hijau));

                }else if (tabId == R.id.tab_chat){

                    Toast.makeText(MainActivity.this, "CHAT", Toast.LENGTH_SHORT).show();
                    ChatFragment chatFragment = new ChatFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentContainerMain, chatFragment).commit();
                    getSupportActionBar().setTitle("\t Chat");
                    toolbar.setTitleTextColor(getResources().getColor(R.color.hijau));

                }else if (tabId == R.id.tab_presence){

                    Toast.makeText(MainActivity.this, "PRESENCE", Toast.LENGTH_SHORT).show();
                    PresenceFragment presenceFragment = new PresenceFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentContainerMain, presenceFragment).commit();
                    getSupportActionBar().setTitle("\t Presence");
                    toolbar.setTitleTextColor(getResources().getColor(R.color.hijau));

                }else {

                    Toast.makeText(MainActivity.this, "EVENT", Toast.LENGTH_SHORT).show();
                    EventFragment eventFragment = new EventFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.contentContainerMain, eventFragment).commit();
                    getSupportActionBar().setTitle("\t Event");
                    toolbar.setTitleTextColor(getResources().getColor(R.color.hijau));

                }

            }

        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
