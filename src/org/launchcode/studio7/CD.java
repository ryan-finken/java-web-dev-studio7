package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, String contents) {
        super(name, contents);
        setCapacity(650);
        setDiscType("Compact Disc");
    }

    @Override
    public void spinDisc() {
        System.out.println("Disc is spinning at 500 rpm");
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

    // methods specific to CD

    public void playMusic() {
        System.out.println("Playing all tracks from " + getName());
    }
}
