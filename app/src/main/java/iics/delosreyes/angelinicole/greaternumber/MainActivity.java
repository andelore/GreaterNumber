package iics.delosreyes.angelinicole.greaternumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button show = findViewById(R.id.show);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText first = findViewById(R.id.first);
                EditText second = findViewById(R.id.second);
                TextView answer = findViewById(R.id.answer);

                int one = Integer.parseInt(first.getText().toString());
                int two = Integer.parseInt(second.getText().toString());

                if (one > two) {
                    answer.setText(Integer.toString(one) + "is the greater number");
                } else if (two > one) {
                    answer.setText(Integer.toString(two) + "is the greater number");
                } else {
                    answer.setText("The two numbers are equal!");
                }

            }
        });
    }
}