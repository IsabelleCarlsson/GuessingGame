package au.edu.jcu.cp3406.guessinggame;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkGuess(View view) {
        EditText userGuess = findViewById(R.id.userGuess);
        String guessString = userGuess.getText().toString();
        if (guessString.isEmpty()) {
            userGuess.setError("This field can not be blank");
            return;
        }
        int guessInt = Integer.parseInt(guessString);
        Context context = getApplicationContext();
        CharSequence text;
        int duration = Toast.LENGTH_SHORT;
        Toast toast;

        if (game.check(guessInt)) {
            text = "Correct!";
            game.newRand();
        } else if (game.getRandInt() > guessInt){
            text = "Higher!";
        } else {
            text ="Lower!";
        }
        toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}

