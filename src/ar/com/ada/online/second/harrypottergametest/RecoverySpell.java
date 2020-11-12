package ar.com.ada.online.second.harrypottergametest;

import java.util.Objects;

public class RecoverySpell extends Spell{
    public RecoverySpell() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RecoverySpell that = (RecoverySpell) obj;
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format(
                "Hechizo de recuperación { nombre= %s, energía mágica== %d } \n",
                name,
                magicPower
        );
    }
}
