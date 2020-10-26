package edu.wofford.machiwoco;

import java.util.ArrayList;
import java.util.List;

public class DiceSubject {

    private List<Observer> observers = new ArrayList<Observer>();
    private Player activePlayer;
    private Player[] players;
    private int dice;

    public DiceSubject(Player activePlayer, Player[] players, int dice) {
        this.activePlayer = activePlayer;
        this.players = players;
        this.dice = dice;
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public void setActivePlayer(Player activePlayer) {
        this.activePlayer = activePlayer;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getDice() {
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}