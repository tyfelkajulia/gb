package ru.gb;

import ru.gb.let.Let;

public class Course {

    String name;
    Let[] lets;

    public Course(String name, Let[] lets) {
        this.name = name;
        this.lets = lets;
    }

    public void doIt(Team team){
        for(int i=0; i < lets.length; i++){
            for(int j=0; j < team.participants.length; j++) {
                Participant participant = team.participants[j];
                participant.setSuccess(lets[0].pass(participant));
            }
        }
    }


}
