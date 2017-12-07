package com.root123.fcm;


import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyIntentService extends FirebaseMessagingService {

        String TAB="FBMessageService";
        @Override
        public void onMessageReceived(RemoteMessage remoteMessage) {
            super.onMessageReceived( remoteMessage );
            Log.d( TAB, "Title:" + remoteMessage.getNotification().getTitle() );
            Log.d( TAB, "message:" + remoteMessage.getNotification().getBody() );
        }

}

