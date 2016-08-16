package io.gdc.ufo.ufo2;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.SubMenu;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import io.gdc.ufo.ufo2.fragment.CouponShowFragment;
import io.gdc.ufo.ufo2.fragment.DetailFragment;
import io.gdc.ufo.ufo2.fragment.HomeFragment;
import io.gdc.ufo.ufo2.fragment.InformationFragment;
import io.gdc.ufo.ufo2.fragment.NotificationFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.CouponFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.FiveFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.FourFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.OneFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.SevenFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.SixFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.ThreeFragment;
import io.gdc.ufo.ufo2.fragment.SurveyFragments.TwoFragment;
import io.gdc.ufo.ufo2.fragment.VO.Event_VO;
import io.gdc.ufo.ufo2.fragment.VO.Notice_VO;
import io.gdc.ufo.ufo2.fragment.dummy.DummyContent;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, HomeFragment.OnFragmentInteractionListener,
        NotificationFragment.OnListFragmentInteractionListener, InformationFragment.OnFragmentInteractionListener,
        SurveyFragment.OnFragmentInteractionListener, DetailFragment.OnFragmentInteractionListener,
        OneFragment.OnFragmentInteractionListener, TwoFragment.OnFragmentInteractionListener,
        ThreeFragment.OnFragmentInteractionListener, FourFragment.OnFragmentInteractionListener,
        FiveFragment.OnFragmentInteractionListener, SixFragment.OnFragmentInteractionListener,
        SevenFragment.OnFragmentInteractionListener, CouponFragment.OnFragmentInteractionListener{
    public static String mainEvent = "ufo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash);
        //display the logo during 2 seconds,
        new CountDownTimer(2000,1000){
            @Override
            public void onTick(long millisUntilFinished){}

            @Override
            public void onFinish(){
                //set the new Content of your activity
                MainActivity.this.setContentView(R.layout.activity_main);
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
                drawer.setDrawerListener(toggle);

                toggle.syncState();

                NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

                //메인메뉴를 숨기고 이벤트 메뉴를 생성
                Menu menu = navigationView.getMenu();
                MenuItem m1 = menu.getItem(0);
                MenuItem m2 = menu.getItem(1);
                MenuItem m3 = menu.getItem(2);
                MenuItem m4 = menu.getItem(3);
                m1.setVisible(false);
                m2.setVisible(false);
                m3.setVisible(false);
                m4.setVisible(false);
                menu.add("단오제").setIcon(R.drawable.ic_menu_share).setIntent(new Intent("dano"));
                menu.add("2016 제 8회 강릉커피축제").setIcon(R.drawable.ic_menu_share).setIntent(new Intent("coffee"));
                menu.add("삼척 맹방 유채꽃 축제").setIcon(R.drawable.ic_menu_share).setIntent(new Intent("tanger"));
                menu.add("오징어 축제").setIcon(R.drawable.ic_menu_share).setIntent(new Intent("squid"));

                navigationView.setNavigationItemSelectedListener(MainActivity.this);

                HomeFragment hf = new HomeFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.content_main_frameLayout,hf).commit();

            }
        }.start();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void submitSurvey(String para){
        Toast.makeText(this, "설문에 응해 주셔서 감사합니다", Toast.LENGTH_LONG).show();
        CouponShowFragment csf = new CouponShowFragment().newInstance(para, para);
        getSupportFragmentManager().beginTransaction().replace(R.id.content_main_frameLayout, csf).commit();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //    return true;
        //}

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.go_home_tab){
                HomeFragment hf = new HomeFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.content_main_frameLayout,hf).commit();
        } else if(id == R.id.notifications_tab){
            //이벤트가 UFO라면 아직 메인 이벤트를 정하지 않은 상태
            if(!mainEvent.equals("ufo")) {
                NotificationFragment nf = new NotificationFragment().newInstance(1, mainEvent);
                getSupportFragmentManager().beginTransaction().replace(R.id.content_main_frameLayout, nf).commit();
            }else{
                Toast.makeText(this, "축제를 선택해 주세요",Toast.LENGTH_SHORT).show();
            }
        } else if(id == R.id.event_info_tab){
            if(!mainEvent.equals("ufo")) {
                InformationFragment inf = new InformationFragment().newInstance(mainEvent, mainEvent);
                getSupportFragmentManager().beginTransaction().replace(R.id.content_main_frameLayout, inf).commit();
            }else{
                Toast.makeText(this, "축제를 선택해 주세요",Toast.LENGTH_SHORT).show();
            }
        } else if(id == R.id.survey_tab){
            if(!mainEvent.equals("ufo")) {
                SurveyFragment sf = new SurveyFragment().newInstance(mainEvent, mainEvent);
                getSupportFragmentManager().beginTransaction().replace(R.id.content_main_frameLayout, sf).commit();
            }else{
                Toast.makeText(this, "축제를 선택해 주세요",Toast.LENGTH_SHORT).show();
            }
        } else{
            String para = item.getIntent().getAction().toString();
            Log.e("MENU PARA", para);
            setMainEvent(para);


        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onListFragmentInteraction(Notice_VO item) {
        Toast.makeText(this, item.getContent(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onOneTextInput(String one){
        Log.e("CALL BACK ONE : ", one);
    }

    @Override
    public void onTwoTextInput(String one){
        Log.e("CALL BACK Two : ", one);
    }

    @Override
    public void onThreeTextInput(String one){
        Log.e("CALL BACK Three : ", one);
    }

    @Override
    public void onFourTextInput(String one){
        Log.e("CALL BACK Four : ", one);
    }

    @Override
    public void onFiveTextInput(String one){
        Log.e("CALL BACK FIVE : ", one);
    }

    @Override
    public void onSixTextInput(String one){
        Log.e("CALL BACK Six : ", one);
    }

    @Override
    public void onSevenTextInput(String one){
        Log.e("CALL BACK Seven : ", one);
    }

    @Override
    public void goNotiFromDetail(){
        NotificationFragment nf = new NotificationFragment().newInstance(1, mainEvent);
        getSupportFragmentManager().beginTransaction().replace(R.id.content_main_frameLayout, nf).commit();
    };

    @Override
    public void goSurveyFromDetail(){
        SurveyFragment sf = new SurveyFragment().newInstance(mainEvent, mainEvent);
        getSupportFragmentManager().beginTransaction().replace(R.id.content_main_frameLayout, sf).commit();
    };


    public void setMainEvent(String para){
        Event_VO vo = new Event_VO(para);

        mainEvent = para;
        setTitle(vo.getTitle());
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View header = navigationView.getHeaderView(0);
        TextView tv = (TextView)header.findViewById(R.id.logo_title);
        tv.setText(vo.getTitle());
        TextView tv1 = (TextView)header.findViewById(R.id.logo_desc);
        tv1.setText(vo.getEvent_short_description());
        ImageView iv = (ImageView)header.findViewById(R.id.logo);
        Context context = iv.getContext();
        int logo = context.getResources().getIdentifier(vo.getLogo(), "drawable", context.getPackageName());
        iv.setImageResource(logo);
        //navigationView.setNavigationItemSelectedListener(this.getApplicationContext());
        DetailFragment df = new DetailFragment().newInstance(para, "FROM HOME");
        getSupportFragmentManager().beginTransaction().replace(R.id.content_main_frameLayout,df).commit();

        //이벤트 메뉴를 숨기고 메인 메뉴를 만듬
        Menu menu = navigationView.getMenu();
        MenuItem m1 = menu.getItem(0);
        MenuItem m2 = menu.getItem(1);
        MenuItem m3 = menu.getItem(2);
        MenuItem m4 = menu.getItem(3);
        m1.setVisible(true);
        m2.setVisible(true);
        m3.setVisible(true);
        m4.setVisible(true);
        menu.setGroupVisible(0, false);

    }

    //이거 쓰나?
    public void submitForm(ArrayList<String> answer){
        CouponFragment cf = new CouponFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_main_frameLayout, cf).commit();
    }
}
