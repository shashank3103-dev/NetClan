package com.example.netclan;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPageAdapter extends FragmentStateAdapter {
    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
       switch (position){
           case 0: return new TabOne();
           case 1: return new TabTwo();
           case 2: return new TapThree();
           default: return new TabOne();
       }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
