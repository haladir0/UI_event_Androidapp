package com.example.ui_event_app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    public void clickMe (View v)
    {

        TextView textView = (TextView) findViewById(R.id.textViewOutput);
        EditText editText = (EditText) findViewById(R.id.editTextInput);
        textView.setText("");
        editText.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickMe(view);
            }

        });

        ImageButton iBtn = (ImageButton) findViewById(R.id.imageButton);
        iBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayMessage(view);
            }
        });


        Button rBtn = (Button) findViewById(R.id.reset);
        rBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView textView = (TextView) findViewById(R.id.textViewOutput);
                textView.setText("Mobile Technologies");

            }


        });
    };

    public void displayMessage(View View)
   {
       Context context = getApplicationContext();
      TextView textView = (TextView) findViewById(R.id.textViewOutput);
      EditText editText = (EditText) findViewById(R.id.editTextInput);
           //textView.setText(editText.getText());
      //  String Uname = editText.getText().toString();

       if(editText.length()==0)
       {
           textView.setText("Enter a message");
           editText.setError("Enter a message");
           Toast.makeText(context,"Enter a message", Toast.LENGTH_SHORT).show();
       }
       else{
           textView.setText(editText.getText().toString());
        }

    }
}