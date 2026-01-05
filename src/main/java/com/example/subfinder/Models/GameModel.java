package com.example.subfinder.Models;

import com.example.subfinder.Entities.GamesTable;

import java.util.List;


public class GameModel {
    private String gameId;
    private String fieldNumber;
    private String time;
    private int numOfSubs;
    private String shirtColor;
    private List<String> listOfSubs;

    public GameModel() {
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(String fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumOfSubs() {
        return numOfSubs;
    }

    public void setNumOfSubs(int numOfSubs) {
        this.numOfSubs = numOfSubs;
    }

    public String getShirtColor() {
        return shirtColor;
    }

    public void setShirtColor(String shirtColor) {
        this.shirtColor = shirtColor;
    }

    public List<String> getListOfSubs() {
        return listOfSubs;
    }

    public void setListOfSubs(List<String> listOfSubs) {
        this.listOfSubs = listOfSubs;
    }


    public GameModel convertToModel(GamesTable games) {
        GameModel gameModel = new GameModel();
        this.gameId = games.getGameID();
        this.fieldNumber = games.getFieldNumber();
        this.time = games.getTime();
        this.numOfSubs = games.getNumOfSubs();
        this.shirtColor = games.getShirtColor();
        this.listOfSubs = games.getListOfSubs();
        return gameModel;
    }
}
