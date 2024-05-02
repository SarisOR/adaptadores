package com.example.pruebarecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.pruebarecyclerview.adaptadores.UsuarioAdaptador;
import com.example.pruebarecyclerview.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_usuarios;
    List<Usuario> usuarioList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv_usuarios = findViewById(R.id.rcv_usuarios);

        Usuario usu1 = new Usuario("https://img.freepik.com/fotos-premium/lindo-gatito-gris-amarillo-ve-juega-negocios-copyspace_89381-2435.jpg?w=740", "Gatito gris", "Adiestramiento Básico");
        Usuario usu2 = new Usuario("https://img.freepik.com/fotos-premium/retrato-perro-border-collie-gato-escondido-detras_748076-74.jpg?w=360", "Gato y perro", "Modelaje");
        Usuario usu3 = new Usuario("https://img.freepik.com/foto-gratis/ancianos-alto-angulo-gato_23-2150139686.jpg?t=st=1714677989~exp=1714681589~hmac=cf20606907259343882aee01908a079b71bbe552f5a4c9ce3ade881ae2f26c2f&w=740", "Gato con ancianos", "Terapia y Asistencia");
        Usuario usu4 = new Usuario("https://img.freepik.com/fotos-premium/anciana-sosteniendo-jengibre-gato-silla-ruedas-patio-trasero_176124-1911.jpg?w=740", "Gato ayudante", "Terapia y Asistencia");
        Usuario usu5 = new Usuario("https://img.freepik.com/foto-gratis/retrato-gato-hermoso-cerca_23-2149214419.jpg?w=740&t=st=1714606218~exp=1714606818~hmac=9d89fdc39ae711fa92a7f01f3b85ab0267be23cc2615f50cca1530158efbbb8f", "Gato con gafas", "Modelaje");

        usuarioList.add(usu1);
        usuarioList.add(usu2);
        usuarioList.add(usu3);
        usuarioList.add(usu4);
        usuarioList.add(usu5);

        rcv_usuarios.setLayoutManager(new LinearLayoutManager(this));
        rcv_usuarios.setAdapter(new UsuarioAdaptador(usuarioList));
    }
}