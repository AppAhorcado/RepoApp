package com.example.alvaro.ahorcado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    public static String[] lista_de_animales =
    {
       "ciervo almizclero", "okapi", "estrella de mar", "ornitorrinco", "rinoceronte", "puercoespin", "salamadra",
        "leopardo", "facoquero", "suricato"
    };

    public static String[] lista_de_frutas =
    {
        "pomelo", "mango", "granada", "banana", "mano de buda", "higo", "chirimoya", "fruta de la pasion",
        "albaricoque", "nispero"
    };

    public static String[] lista_de_peliculas =
    {
        "hijos de los hombres", "mambrechito and friends", "resacon  en las vegas", "star wars el despertar de la fuerza",
        "abierto hasta el amanecer", "matrix reloaded", "el diario de noa", "million dollar baby", "brokeback mountain",
        "cincuenta sombras de grey"
    };

    public static String[] lista_de_lugares =
    {
        "antigua y barbuda", "trinidad y tobago", "turkmenistan", "sri lanka", "san vicente y las granadinas",
        "san cristobal y las nieves", "emiratos arabes unidos", "republica democratica del oongo",
        "papua nueva guinea", "liechtenstein"
    };

    public static String[] lista_de_deportes =
    {
        "baloncesto", "waterpolo", "badminton", "lacrosse", "golf", "futbol", "atletismo", "tenis de mesa", "curling", "sky"
    };

    public static String[] lista_de_palabraseñe =
    {
        "amañado", "contraseña", "señuelo", "musaraña", "migraña", "guadaña", "campaña", "ponzoña", "estaño", "añejo"
    };

    public static String[] lista_de_famosos =
    {
        "justin bieber", "matt damon", "dwayne johnson", "asthon kutcher", "justin timberlake", "george clooney",
        "leonardo dicaprio", "Arnold Schwarzenegger", "russel crowe", "wynona ryder"
    };





    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
