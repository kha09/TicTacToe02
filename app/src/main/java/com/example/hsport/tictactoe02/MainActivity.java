package com.example.hsport.tictactoe02;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BuClick(View view) {
        Button buSelected = (Button) view;
        int CellID =0;
        switch((buSelected.getId())){
            case R.id.bu1:
                CellID=1;
                break;
            case R.id.bu2:
                CellID=2;
                break;
            case R.id.bu3:
                CellID=3;
                break;
            case R.id.bu4:
                CellID=4;
                break;
            case R.id.bu5:
                CellID=5;
                break;
            case R.id.bu6:
                CellID=6;
                break;
            case R.id.bu7:
                CellID=7;
                break;
            case R.id.bu8:
                CellID=8;
                break;
            case R.id.bu9:
                CellID=9;
                break;
        }
        playGame(CellID,buSelected);
    }
    int activePlayer = 1;
    ArrayList<Integer>player1 = new ArrayList<Integer>();
    ArrayList<Integer>player2 = new ArrayList<Integer>();
    private void playGame(int CellID, Button buSelected){
        Log.d("player: ", String.valueOf(CellID));

        if (activePlayer ==1){
            buSelected.setText("X");
            buSelected.setBackgroundColor(Color.GREEN);
            player1.add(CellID);
            activePlayer = 2;
        }
        else if (activePlayer ==2){
            buSelected.setText("O");
            buSelected.setBackgroundColor(Color.YELLOW);
            player2.add(CellID);
            activePlayer = 1;
        }
    }
    void CheckWiner(){
        int winner=1;
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)){
            winner=1;
        }

    }
}
