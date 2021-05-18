package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD nevermind = new CD("Nevermind", "90's angst");
        DVD thor = new DVD("Thor", "A pretty solid superhero flick");


        nevermind.spinDisc();
        nevermind.playMusic();

        thor.spinDisc();
        thor.playMovie();

    }
}
