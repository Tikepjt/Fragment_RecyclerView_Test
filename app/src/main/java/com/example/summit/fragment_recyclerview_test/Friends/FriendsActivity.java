
package com.example.summit.fragment_recyclerview_test.Friends;

import android.app.Fragment;
import android.app.FragmentManager;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.example.summit.fragment_recyclerview_test.R;
import com.example.summit.fragment_recyclerview_test.databinding.ActivityFriendsBinding;

import java.util.ArrayList;

public class FriendsActivity extends AppCompatActivity {

    FriendsPresenter mPresenter;
    RequestFragment mRequestFragment;
    FriendsFragment mFriendsFragment;
    ActivityFriendsBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_friends);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_friends);

        mPresenter = new FriendsPresenter(this, this);

        mBinding.friendsViewPager.setAdapter(new FriendsAdapter(getFragmentManager()));

    }

    @Override
    public void printRequestList(ArrayList<RequestItem> arrRequestList) {

        mRequestFragment.printRequestList(arrRequestList);

    }

    @Override
    public void printFriendsList(ArrayList<FriendsItem> arrFriendsList) {

        mFriendsFragment.printFriendsList(arrFriendsList);

    }

    class FriendsAdapter extends FragmentPagerAdapter {

        public FriendsAdapter(FragmentManager fm) {

            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    mRequestFragment = new RequestFragment();
                    mRequestFragment.setPresenter(mPresenter);
                    return mRequestFragment;

                case 1:
                    mFriendsFragment = new FriendsFragment();
                    mFriendsFragment.setPresenter(mPresenter);
                    return mFriendsFragment;
            }

            return null;

        }

        @Override
        public int getCount() {

            return 2;

        }


    }

}
