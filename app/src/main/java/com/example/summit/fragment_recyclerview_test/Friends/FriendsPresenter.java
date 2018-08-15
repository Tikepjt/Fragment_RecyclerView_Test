package com.example.summit.fragment_recyclerview_test.Friends;


import android.content.Context;

import java.util.ArrayList;

public class FriendsPresenter implements FriendsContract.Presenter{

    Context mContext;
    FriendsContract.View mView;

    public FriendsPresenter(Context context, FriendsContract.View view){

        mContext = context;
        mView = view;

    }

    @Override
    public void getRequestList(){

        ArrayList<RequestItem> arrRequestList = new ArrayList<>();

        RequestItem item00 = new RequestItem();

        item00.name = "요미";
        item00.phoneNumber = "010-1234-5678";
        item00.thumbnail = "https://naver.com/123";

        RequestItem item01 = new RequestItem();

        item01.name = "꼬미";
        item01.phoneNumber = "010-9876-5432";
        item01.thumbnail = "https://naver.com/123";

        RequestItem item02 = new RequestItem();

        item02.name = "심바";
        item02.phoneNumber = "010-5678-1234";
        item02.thumbnail = "https://naver.com/123";

        arrRequestList.add(item00);
        arrRequestList.add(item01);
        arrRequestList.add(item02);

        mView.printRequestList(arrRequestList);

    }

    @Override
    public void getFriendsList(){

        ArrayList<FriendsItem> arrFriendsList = new ArrayList<>();

        FriendsItem item00 = new FriendsItem();

        item00.name = "가렌";
        item00.phoneNumber = "010-1234-5678";
        item00.thumbnail = "https://naver.com/123";

        FriendsItem item01 = new FriendsItem();

        item01.name = "럭스";
        item01.phoneNumber = "010-9876-5432";
        item01.thumbnail = "https://naver.com/123";

        FriendsItem item02 = new FriendsItem();

        item02.name = "이즈리";
        item02.phoneNumber = "010-5678-1234";
        item02.thumbnail = "https://naver.com/123";

        arrFriendsList.add(item00);
        arrFriendsList.add(item01);
        arrFriendsList.add(item02);

        mView.printFriendsList(arrFriendsList);

    }

    @Override
    public void init(){

    }

}
