package ru.mirea.pashchenkoem.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickCount(View view) {

        EditText editText = findViewById(R.id.editText);

        Toast toast = Toast.makeText(getApplicationContext(),
                String.format("СТУДЕНТ № 21 ГРУППА БСБО-03-20 Количество символов - %s", editText.getText().toString().length()),
                Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}