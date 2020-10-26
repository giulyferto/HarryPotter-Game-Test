package ar.com.ada.online.second.harrypottergametest;

import java.util.Objects;

public class Wand {
    private String name;
    private Integer power;

    public Wand() {
    }

    public Wand(String name, Integer power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Wand that = (Wand) obj;
        return name.equals(that.name) &&
                power.equals(that.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power);
    }
    
    
    @Override
    public String toString() {
        return String.format(
                "Wand{ name= %s, power= %d}",
                name,
                power
        );
    }
}
