package ru.gb.let;

import ru.gb.Participant;

public abstract class Let {

    int distance;

    public boolean pass(Participant participant){
        if(participant.getCurrentEnergy() >= distance){
            participant.setCurrentEnergy( participant.getCurrentEnergy() - distance );
            return true;
        }else{
            return false;
        }
    }

}
