package vvit.uidesignapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  EditText uid,pwd;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        uid=(EditText)findViewById(R.id.userid);
        pwd=(EditText)findViewById(R.id.pwd);
        tv=(TextView)findViewById(R.id.error);

    }
    public void clearFields(View v)
    {
       uid.setText("");
        pwd.setText("");
    }
    public void loginHandler(View v)
    {
        if(uid.getText().toString().equalsIgnoreCase("vvit")&&pwd.getText().toString().equalsIgnoreCase("vvit123"))
        {
           Intent intent =new Intent(this,LoginActivity.class);
            startActivity(intent);
        }
        else
            tv.setText("Invalid UserName or Password");
    }
}
