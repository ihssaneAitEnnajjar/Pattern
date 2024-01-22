package org.sid;

public class CP implements ComportementArme {
    private boolean used = false;
    @Override
    public void utiliserArme() {
        if (used) {
            throw new IllegalStateException("Le CP est deja utilisé");
        }
        System.out.println("Le CP est utilisé ");
        used = true;

    }

    @Override
    public boolean canUseArme() {
        return !used;
    }
}
