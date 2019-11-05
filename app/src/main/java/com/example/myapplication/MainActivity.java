package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private EditText user;
    private EditText em;
    private EditText pass;
    private Button butt;
    private ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.username);
        em = findViewById(R.id.email);
        pass = findViewById(R.id.password);
        butt = findViewById(R.id.signin);
        im = findViewById(R.id.imageView);
    }

    DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            user.setText("");
            em.setText("");
            pass.setText("");
            im.setVisibility(View.INVISIBLE);
        }
    };

    public void signin(View view) {
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Fuck you")
                .setMessage(user.getText() + "\n" +em.getText())
                .setPositiveButton("OK", listener)
                .show();
//                Integer.parseInt(pass.getText().toString());
                im.setVisibility(View.VISIBLE);
    }
}

