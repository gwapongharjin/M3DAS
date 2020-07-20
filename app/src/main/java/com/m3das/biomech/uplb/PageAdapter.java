package com.m3das.biomech.uplb;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private int numtabs;

    public PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numtabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ProfileFragment();
            case 1:
                return new MachinesFragment();
            case 2:
                return new LandFragment();
            case 3:
                return new PlantFragment();
            case 4:
                return new FertFragment();
            case 5:
                return new IrriFragment();
            case 6:
                return new CultFragment();
            case 7:
                return new RatFragment();
            case 8:
                return new HarvestFragment();
            case 9:
                return new HaulOthersFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numtabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
