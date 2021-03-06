package ghozti.pokemon.game.codes;

import java.util.ArrayList;

public class Codes {

    public Codes(){
        setCodes();
    }//sets the codes automatically

    private ArrayList<String> codes = new ArrayList<>(23);
    private ArrayList<String> usedCodes = new ArrayList<>(23);

    private void setCodes(){
        codes.add("92319");
        codes.add("max");
        codes.add("animal crossings");
        codes.add("3080");
        codes.add("3070");
        codes.add("java");
        codes.add("333");
        codes.add("8bit");
        codes.add("16 months");
        codes.add("64bit");
        codes.add("linux");
        codes.add("raspberrypi");
        codes.add("windows");
        codes.add("samsung");
        codes.add("gtaV");
        codes.add("5900x");
        codes.add("amd");
        codes.add("nvidia");
        codes.add("clones");
        codes.add("order66");
        codes.add("code");
        codes.add("homer simpson");
    }

    public void getCode(String code){
        for (String i : codes) {
            if (code.equals(i)) {
                isAlreadyUsed(i);
                System.out.println("Valid code!");
                return;
            }
        }
        System.out.println("***This code does not exist!***");
    }

    public boolean isAlreadyUsed(String code){

        return false;
    }
}
