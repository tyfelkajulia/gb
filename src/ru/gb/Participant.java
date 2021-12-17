package ru.gb;

public class Participant {

    String name;
    int age;
    int maxDistance;
    int currentEnergy;
    boolean success;

    public Participant(String name, int age, int maxDistance){
        this.name = name;
        this.age = age;
        this.maxDistance = maxDistance;
        currentEnergy = maxDistance;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    public void setCurrentEnergy(int currentEnergy) {
        this.currentEnergy = currentEnergy;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void showResult(){
        System.out.println("name: " + name + ", result: "+ success);
    }
}
