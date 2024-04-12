package br.ufrn.imd;

public class Musician extends Person{
    
    public boolean playClassicalMusic;
    
    public boolean canImprovise;
    
    public boolean canCompose;
    
    public Musician(boolean playClassicalMusic, booelan canImprovise, booelan canCompose){
        this.playClassicalMusic = playClassicalMusic;
        this.canImprovise = canImprovise;
        this.canCompose = canCompose;
    }
    
    public void play(){
        System.out.println("tuts tuts quero ver");
    }
}
