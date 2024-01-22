package org.sid;

public class CAeF implements ComportementArme {
    private boolean used = false;
    @Override
    public void utiliserArme() {
        if (used) {
            throw new IllegalStateException("Le CAeF est deja utilisé");
        }
        System.out.println("Le CAeF est utilisé ");
        used = true;

    }
    @Override
    public boolean canUseArme() {
        return !used;
    }
}



