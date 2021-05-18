package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public DVD(String name, String contents) {
        super(name, contents);
        setCapacity(4700);
        setDiscType("Digital Video Disc");
    }


    @Override
    public void spinDisc() {
        System.out.println("The disc is spinning between 570 and 1600 rpm");
    }

    @Override
    public void writeData(String contents) {
        setContents(contents);
    }

    @Override
    public String readData() {
        return getContents();
    }

    @Override
    public String toString() {
        return "Title: " + getName() + " Contents: " + readData();
    }

    // methods specific to DVD

    public void playMovie() {
        System.out.println("Playing " + getName() + ", get the popcorn ready!");
    }
}
