package com.guaratecnologia.interfacejava;

import android.util.Log;

public class Produto implements ICrud {


    private static final String TAG = "Icrude";

    private String nome;
    private String fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public void incluir() {
        Log.i(TAG, "incluir: Produto");
    }

    @Override
    public void alterar() {
        Log.i(TAG, "auterar: Produto");
    }

    @Override
    public void deletar() {
        Log.i(TAG, "deletar: Produto");
    }

    @Override
    public void listar() {
        Log.i(TAG, "listar: Produto");
    }
}
