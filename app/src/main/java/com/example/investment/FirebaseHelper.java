package com.example.investment;

import com.google.firebase.database.DatabaseReference;

public class FirebaseHelper {
    static public String generateKey(DatabaseReference ref){
        return ref.push().getKey();
    }
}
