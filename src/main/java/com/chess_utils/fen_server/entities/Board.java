package com.chess_utils.fen_server.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Board {

    List<Casilla> casillas = new ArrayList<>();

    private boolean whitesTurn;
    private boolean whiteCanRoque;
    private boolean blackCanRoque;


    public Board( String fenCode ){

       
        casillas.add(new Casilla("a1"));
        casillas.add(new Casilla("a2"));
        casillas.add(new Casilla("a3"));
        casillas.add(new Casilla("a4"));
        casillas.add(new Casilla("a5"));
        casillas.add(new Casilla("a6"));
        casillas.add(new Casilla("a7"));
        casillas.add(new Casilla("a8"));

        casillas.add(new Casilla("b1"));
        casillas.add(new Casilla("b2"));
        casillas.add(new Casilla("b3"));
        casillas.add(new Casilla("b4"));
        casillas.add(new Casilla("b5"));
        casillas.add(new Casilla("b6"));
        casillas.add(new Casilla("b7"));
        casillas.add(new Casilla("b8"));
        
        casillas.add(new Casilla("c1"));
        casillas.add(new Casilla("c2"));
        casillas.add(new Casilla("c3"));
        casillas.add(new Casilla("c4"));
        casillas.add(new Casilla("c5"));
        casillas.add(new Casilla("c6"));
        casillas.add(new Casilla("c7"));
        casillas.add(new Casilla("c8"));

        casillas.add(new Casilla("d1"));
        casillas.add(new Casilla("d2"));
        casillas.add(new Casilla("d3"));
        casillas.add(new Casilla("d4"));
        casillas.add(new Casilla("d5"));
        casillas.add(new Casilla("d6"));
        casillas.add(new Casilla("d7"));
        casillas.add(new Casilla("d8"));

        casillas.add(new Casilla("e1"));
        casillas.add(new Casilla("e2"));
        casillas.add(new Casilla("e3"));
        casillas.add(new Casilla("e4"));
        casillas.add(new Casilla("e5"));
        casillas.add(new Casilla("e6"));
        casillas.add(new Casilla("e7"));
        casillas.add(new Casilla("e8"));

        casillas.add(new Casilla("f1"));
        casillas.add(new Casilla("f2"));
        casillas.add(new Casilla("f3"));
        casillas.add(new Casilla("f4"));
        casillas.add(new Casilla("f5"));
        casillas.add(new Casilla("f6"));
        casillas.add(new Casilla("f7"));
        casillas.add(new Casilla("f8"));

        casillas.add(new Casilla("g1"));
        casillas.add(new Casilla("g2"));
        casillas.add(new Casilla("g3"));
        casillas.add(new Casilla("g4"));
        casillas.add(new Casilla("g5"));
        casillas.add(new Casilla("g6"));
        casillas.add(new Casilla("g7"));
        casillas.add(new Casilla("g8"));

        casillas.add(new Casilla("h1"));
        casillas.add(new Casilla("h2"));
        casillas.add(new Casilla("h3"));
        casillas.add(new Casilla("h4"));
        casillas.add(new Casilla("h5"));
        casillas.add(new Casilla("h6"));
        casillas.add(new Casilla("h7"));
        casillas.add(new Casilla("h8"));

        configureBoard(fenCode);

    }

    public void configureBoard(String fenCode){

        
        String[] parts = fenCode.split(" ", 0);

        String boardPart = parts[0];
        String activeColor = parts[1];
        String castling = parts[3];
        String enPassant = parts[4];
        String halfmove = parts[5];
        String fullmove = parts[6];

        

        casillas.stream()
            .forEach(casilla -> System.out.println(casilla.getName()));

        
    }

}