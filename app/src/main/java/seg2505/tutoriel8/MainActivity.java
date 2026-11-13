package seg2505.tutoriel8;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText lastname;
    private EditText EmailID;
    private EditText password;
    private EditText message;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupVariables();
    }
    public void authenticateLogin(View view) {
        if (username.getText().toString().equals("user"))
            if (lastname.getText().toString().equals("test"))
                if (EmailID.getText().toString().equals("email@gmail.com"))
                    if (password.getText().toString().equals("admin"))
                        message.setText("Login Successful");
                    else
                        message.setText("Invalid Password");
                else
                    message.setText("Invalid Email");
            else
                message.setText("Invalid Last Name");
        else
            message.setText("Invalid First Name");
    }
    private void setupVariables() {
        username = (EditText) findViewById(R.id.username);
        lastname = (EditText)findViewById(R.id.Lastname) ;
        EmailID = (EditText)findViewById(R.id.email) ;
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.loginBtn);
        message = (EditText) findViewById(R.id.message);

    }
}