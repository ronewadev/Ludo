package com.example.myludo;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
//ronewadev
public class GameOverYellow extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over_yellow);
    }

    public void over(View view){
        Intent in= new Intent(GameOverYellow.this, PlayerSelect.class);
        startActivity(in);
    }

}
