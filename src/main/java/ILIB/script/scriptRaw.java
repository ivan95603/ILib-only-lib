package ILIB.script;


import ILIB.ILibComponent;

public class scriptRaw implements ILibComponent, ILib_IScript
{
    String text;

    public scriptRaw(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return  text;
    }
}
