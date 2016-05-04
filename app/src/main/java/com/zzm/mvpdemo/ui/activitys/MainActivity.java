package com.zzm.mvpdemo.ui.activitys;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.SparseArray;
import com.luseen.luseenbottomnavigation.BottomNavigation.BottomNavigationView;
import com.zzm.mvpdemo.R;
import com.zzm.mvpdemo.ui.fragments.BaseFragment;
import com.zzm.mvpdemo.ui.fragments.CollectionFragment;
import com.zzm.mvpdemo.ui.fragments.FollowFragment;
import com.zzm.mvpdemo.ui.fragments.MineFragment;
import com.zzm.mvpdemo.ui.fragments.RecreationFragment;
import com.zzm.mvpdemo.utils.LogUtils;

import butterknife.BindView;


public class MainActivity extends BaseActivity {


    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.bottomNavigationView)
    BottomNavigationView bottomNavigationView;
    private SparseArray<BaseFragment> mFragments = new SparseArray<BaseFragment>();
    private int[] colorResources = {Color.RED,Color.BLUE,Color.GRAY,Color.GREEN};
    private int[] imageResources = {R.drawable.main_icon1,R.drawable.main_icon2,R.drawable.main_icon3,R.drawable.main_icon4};

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);
        viewPager.setAdapter(new MyFragmentAdapter(getSupportFragmentManager()));
        bottomNavigationView.setUpWithViewPager(viewPager , colorResources , imageResources);
        viewPager.setCurrentItem(0);
    }


    private class MyFragmentAdapter extends FragmentPagerAdapter {

        private int page = 4;
        private String[] tabtitle = new String[]{"休闲", "关注", "收藏", "我的"};

        public MyFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int postion) {
            return createFragment(postion);
        }

        @Override
        public int getCount() {
            return page;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabtitle[position];
        }
    }


    public BaseFragment createFragment(int postion) {
        BaseFragment fragment = mFragments.get(postion);
        if (fragment == null) {
            switch (postion) {
                case 0:
                    fragment = new RecreationFragment();
                    break;
                case 1:
                    fragment = new FollowFragment();
                    break;
                case 2:
                    fragment = new CollectionFragment();
                    break;
                case 3:
                    fragment = new MineFragment();
                    break;
            }
            mFragments.put(postion, fragment);
        }
        return fragment;
    }


}
