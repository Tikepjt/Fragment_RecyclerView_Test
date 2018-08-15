
package com.example.summit.fragment_recyclerview_test.Friends;

import java.util.ArrayList;

public class FriendsContract {

    interface View {

        void printRequestList(ArrayList<RequestItem> arrRequestList);

        void printFriendsList(ArrayList<FriendsItem> arrFriendsList);

    }


    interface Presenter {

        void init();

        void getRequestList();

        void getFriendsList();

    }

}
