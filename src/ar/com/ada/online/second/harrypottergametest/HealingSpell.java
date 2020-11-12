package ar.com.ada.online.second.harrypottergametest;

import java.util.Objects;

public class HealingSpell extends Spell{
    public HealingSpell() {
        super();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        HealingSpell that = (HealingSpell) obj;
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format(
                "Hechizo de sanación { nombre= %s, recuperación= $d, energía mágica== %d } \n",
                name,
                recovery,
                magicPower
        );
    }
}
