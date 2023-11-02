package com.example.sjcet.intent;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.content.SharedPreferences;
        import android.view.View;
        import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.editTextName);
        et2 = findViewById(R.id.editTextEmail);
    }
    protected void onStop() {
        super.onStop();
        // savedata inside the Shared preference
        SharedPreferences mypref=getSharedPreferences("myprefsfile",0);
        SharedPreferences.Editor editor=mypref.edit();//only write editor
        editor.putString("name",et1.getText().toString());  //bundle the data
        editor.putString("email",et2.getText().toString());

        editor.apply();   //saving the data
    }
    protected void onResume() {
        super.onResume();
    }
    public void click(View view) {
        Intent i = new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(i);
    }
}

