package org.sid;
import org.sid.ComportementArme;

public class Personnage {
    private ComportementArme arme;
    public void combattre (){
        System.out.println(" fait le combat");
    }


    public void utiliserArme() {
        if (arme.canUseArme()) {
            arme.utiliserArme();
        } else {
            System.out.println("l'arme ne peux plus etre utilisé");
        }
    }

    public void setArme(ComportementArme arme) {
        this.arme = arme;
    }
}
