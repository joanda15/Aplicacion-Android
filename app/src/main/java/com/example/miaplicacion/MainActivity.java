package com.example.miaplicacion;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    TextView mensajeTextView;
    EditText mensajeEditText;

    public void buttonPress(View view){

        Log.i("Info", "Botón presionado");
        mensajeEditText = findViewById(R.id.mensajeEditText);
        String mensajeString = mensajeEditText.getText().toString();
        mensajeTextView.setText(mensajeString);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        mensajeTextView = findViewById(R.id.mensajeTextView);
        mensajeTextView.setText("Soy SENA");
    }
}