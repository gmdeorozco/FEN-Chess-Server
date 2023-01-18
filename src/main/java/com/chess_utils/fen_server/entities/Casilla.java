package com.chess_utils.fen_server.entities;


import lombok.Data;


@Data
public class Casilla {
   

    private String name;
    private Piece pieza = Piece.NONE;
    private String color;

    public Casilla( String name ){
        this.name = name;
        
    }

 

}