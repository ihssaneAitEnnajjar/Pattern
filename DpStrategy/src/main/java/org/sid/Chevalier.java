package org.sid;

public class Chevalier implements ComportementArme {
    private boolean used = false;
    @Override
    public void utiliserArme() {
        if (used) {
            throw new IllegalStateException("Le Chevalier est deja utilisé");
        }
        System.out.println("Le Chevalier est utilisé ");
        used = true;

    }

    @Override
    public boolean canUseArme() {
        return !used;
    }
}
