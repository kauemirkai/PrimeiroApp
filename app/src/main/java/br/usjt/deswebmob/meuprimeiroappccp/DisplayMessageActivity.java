package br.usjt.deswebmob.meuprimeiroappccp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
/*
@author:Kaue mirkai
RA:81613004
Professor:Bonato
Turma:CCP3AN-MCA
 */

public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String mensagem = intent.getStringExtra(MainActivity.MENSAGEM);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(mensagem);

        ViewGroup layout = findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
}
