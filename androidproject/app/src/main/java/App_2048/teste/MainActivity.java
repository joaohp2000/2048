package App_2048.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_cima;
    private Button button_esquerda;
    private Button button_direita;
    private Button button_baixo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_cima = (Button)findViewById(R.id.cima);
        button_esquerda = (Button)findViewById(R.id.esquerda);
        button_direita = (Button)findViewById(R.id.direita);
        button_baixo = (Button)findViewById(R.id.baixo);

        button_cima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_esquerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_direita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button_baixo.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }));

    }
}
