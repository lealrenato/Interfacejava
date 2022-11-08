package com.guaratecnologia.interfacejava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Cliente cliente;
    Produto produto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cliente = new Cliente();
        produto = new Produto();

        cliente.setNome("Renato");
        cliente.setEmail("renatolealhiss@gmail.com");

        produto.setNome("notebook");
        produto.setFornecedor("dell");

        cliente.incluir();
        produto.incluir();
    }
}