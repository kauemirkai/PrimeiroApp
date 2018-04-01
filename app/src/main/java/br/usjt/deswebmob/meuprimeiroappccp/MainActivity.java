package br.usjt.deswebmob.meuprimeiroappccp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.nio.file.Files;

/*
@author:Kaue mirkai
RA:81613004
Professor:Bonato
Turma:CCP3AN-MCA
 */

public class MainActivity extends Activity {
    public static final String MENSAGEM = "br.usjt.deswebmob.meuprimeiroappccp.mensagem";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.edit_text);
        String mensagem = editText.getText().toString();
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        intent.putExtra(MENSAGEM, mensagem);
        startActivity(intent);

    }
}
