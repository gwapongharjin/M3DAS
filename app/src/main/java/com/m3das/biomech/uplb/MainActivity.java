package com.m3das.biomech.uplb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

private TabItem tabPrelim, tabMach, tabLand, tabPlant, tabFert, tabIrri, tabCult, tabRat, tabHarvest, tabHaulOthers;
private ViewPager viewPager;
private TabLayout tabPart1;
public PageAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qpart1);

        initViews();
        pagerAdapter = new PageAdapter(getSupportFragmentManager(), tabPart1.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabPart1.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabPart1));

    }

    private void initViews(){

        tabPrelim = findViewById(R.id.tabProfile);
        tabMach = findViewById(R.id.tabMach);
        tabLand = findViewById(R.id.tabLand);
        tabPlant = findViewById(R.id.tabPlant);
        tabFert = findViewById(R.id.tabFert);
        tabIrri = findViewById(R.id.tabIrri);
        tabCult = findViewById(R.id.tabCult);
        tabRat = findViewById(R.id.tabRat);
        tabHarvest = findViewById(R.id.tabHarvest);
        tabHaulOthers = findViewById(R.id.tabHaulOthers);
        tabPart1 = findViewById(R.id.tablPart1);
        viewPager = findViewById(R.id.viewpager);
    }
}