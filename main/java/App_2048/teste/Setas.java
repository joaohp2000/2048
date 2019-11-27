package App_2048.teste;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.concurrent.ExecutionException;

public class Setas extends AppCompatActivity {


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
                mov("cima");
                Toast.makeText(getApplicationContext(), "Apertou botao cima", Toast.LENGTH_SHORT).show();
            }
        });

        button_esquerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mov("esquerda");
                Toast.makeText(getApplicationContext(), "Apertou botao esquerda", Toast.LENGTH_SHORT).show();
            }
        });

        button_direita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mov("direita");
                Toast.makeText(getApplicationContext(), "Apertou botao direita", Toast.LENGTH_SHORT).show();

            }
        });

        button_baixo.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mov("baixo");
                Toast.makeText(getApplicationContext(), "Apertou botao baixo", Toast.LENGTH_SHORT).show();
            }
        }));

    }

    private void mov(String movimento) {
        Http_setas movi=new Http_setas(movimento);
        try {
            movi.execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }



}
