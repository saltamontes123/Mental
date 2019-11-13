package bo.com.innovatingworld.mental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import bo.com.innovatingworld.mental.ui.preguntas.PreguntasFragment;

public class Preguntas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preguntas_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, PreguntasFragment.newInstance())
                    .commitNow();
        }
    }
}
