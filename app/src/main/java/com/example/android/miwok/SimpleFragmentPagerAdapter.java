package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Numbers", "Family", "Colors", "Phrases" };
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
            return new NumbersFragment();
        else if(position == 1)
            return new FamilyMembersFragment();
        else if(position == 2)
            return new ColorsFragment();
        else if(position == 3)
            return new PhrasesFragment();
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public String getPageTitle(int position) {
        return tabTitles[position];
    }
}
