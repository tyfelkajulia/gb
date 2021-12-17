package ru.gb;

import java.util.Arrays;

public class Team {

    String name;
    Participant[] participants;

    public Team(String name, Participant[] participants) {
        this.name = name;
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                "," + Arrays.toString(participants) +
                '}';
    }

    public void showResults(){
        for (int i=0; i < participants.length; i++){
            participants[i].showResult();
        }
    }
}
