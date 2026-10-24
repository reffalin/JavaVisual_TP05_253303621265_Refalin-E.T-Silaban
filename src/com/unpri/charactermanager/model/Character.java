package com.unpri.charactermanager.model;

public class Character {

    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attack;
    private int mana;

    // Constructor tanpa parameter
    public Character() {
        this.name = "Unknown";
        this.type = CharacterType.WARRIOR;
        this.level = 1;
        this.hitPoints = 100;
        this.attack = 10;
        this.mana = 0;
    }

    // Constructor dengan parameter
    public Character(String name, CharacterType type,
                     int level, int hitPoints, int attack) {
        this.name = name;
        this.type = type;
        setLevel(level);
        this.mana = 0;

        if (hitPoints < 0 || attack < 0) {
            throw new IllegalArgumentException(
                "HP dan attack tidak boleh negatif."
            );
        }

        this.hitPoints = hitPoints;
        this.attack = attack;
    }

    // Getter dan setter name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan setter type
    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    // Getter dan setter level
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                "Level minimal adalah 1."
            );
        }

        this.level = level;
        this.hitPoints = level * 100;
        this.attack = level * 10;
    }

    // Getter dan setter hitPoints
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        if (hitPoints < 0) {
            throw new IllegalArgumentException(
                "Hit points tidak boleh negatif."
            );
        }

        this.hitPoints = hitPoints;
    }

    // Getter dan setter attack
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack < 0) {
            throw new IllegalArgumentException(
                "Attack tidak boleh negatif."
            );
        }

        this.attack = attack;
    }

    // Getter dan setter mana
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                "Mana tidak boleh negatif."
            );
        }

        this.mana = mana;
    }

    // Memeriksa apakah karakter masih hidup
    public boolean isAlive() {
        return hitPoints > 0;
    }

    // Membandingkan karakter berdasarkan nama
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
        return true;
        }

        if (!(obj instanceof Character)) {
        return false;
        }

        Character other = (Character) obj;
        return name != null && name.equals(other.name);
        }

    // Menampilkan informasi karakter
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", attack=" + attack +
                ", mana=" + mana +
                '}';
    }
}