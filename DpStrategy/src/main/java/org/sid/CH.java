package org.sid;

public class CH implements ComportementArme {
    private boolean used = false;
    @Override
    public void utiliserArme() {
        if (used) {
            throw new IllegalStateException("Le CH est deja utilisé");
        }
        System.out.println("Le CH est utilisé ");
        used = true;

    }

    @Override
    public boolean canUseArme() {
        return !used;
    }
}

