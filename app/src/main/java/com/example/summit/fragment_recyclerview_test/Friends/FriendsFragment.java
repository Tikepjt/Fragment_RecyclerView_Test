package com.example.summit.fragment_recyclerview_test.Friends;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.summit.fragment_recyclerview_test.R;
import com.example.summit.fragment_recyclerview_test.databinding.FragmentFriendsBinding;

import java.util.ArrayList;

public class FriendsFragment {



    FriendsContract.Presenter mPresenter;

    FragmentFriendsBinding mBinding;

    ArrayList<RequestItem> mArrRequestList = new ArrayList<>();

    MyAdapter mAdapter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        mBinding = DataBindingUtil.inflate(inflater R.layout.fragment_friends, container, true);

        getActivity();

        mAdapter = new MyAdapter();

        mBinding.friendsRv.setAdapter(mAdapter);

        mBinding.friendsRv.setLayoutManager(new LinearLayoutManager(getActivity()));

        mPresenter.getRequestList();

        return mBinding.getRoot();
    }



    public void setPresenter(FriendsContract.Presenter presenter) {

        mPresenter = presenter;

    }




    @Override
    public void onStart()
    {
        super.onStart();
    }

    @Override
    public void onResume()
    {
        super.onResume();
    }


    @Override
    public void onPause()
    {
        super.onPause();
    }

    @Override
    public void onStop()
    {
        super.onStop();
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }



    public void printFriendsList( ArrayList<FriendsItem> arrFriendList )
    {
        mArrRequestList.clear();
        mArrRequestList.addAll( arrFriendList );
        mAdapter.notifyDataSetChanged();
    }

    public Context getActivity() {
        return activity;
    }


//    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>{
//
//        @Override
//        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//
//            RowFriendsItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(getActivity()), R.layout.row_friends_item, parent, true);
//
//            return new MyHolder(binding);
//
//        }
//
//        @Override
//        public void onBindViewHolder(MyHolder holder, int position) {
//
//            holder.mBinding.name.setText(mArrFriendsList.get(position).name);
//
//        }
//
//        @Override
//        public int getItemCount() {
//
//            return mArrFriendsList.size();
//
//        }
//
//        class MyHolder extends RecyclerView.ViewHolder {
//
//            RowFriendsItemBinding mBinding;
//
//            public MyHolder (RowFriendsItemBinding binding) {
//
//                super(binding.getRoot());
//
//                mBinding = binding;
//
//            }
//
//        }
//    }
}
