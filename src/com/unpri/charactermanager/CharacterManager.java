package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import java.util.ArrayList;

public class CharacterManager {

    private ArrayList<Character> characters = new ArrayList<>();
    private static int totalCharacterCreated = 0;

    // Menambahkan karakter jika namanya belum terdaftar
    public boolean addCharacter(Character character) {
        if (character == null || findByName(character.getName()) != null) {
            System.out.println("Karakter gagal ditambahkan: nama duplikat atau data kosong.");
            return false;
        }

        characters.add(character);
        totalCharacterCreated++;
        System.out.println("Karakter berhasil ditambahkan: " + character.getName());
        return true;
    }

    // Mencari karakter berdasarkan nama
    public Character findByName(String name) {
        for (Character character : characters) {
            if (character.getName() != null
                    && character.getName().equals(name)) {
                return character;
            }
        }
        return null;
    }

    // Menghapus karakter berdasarkan nama
    public boolean removeCharacter(String name) {
        Character character = findByName(name);

        if (character != null) {
            characters.remove(character);
            System.out.println("Karakter berhasil dihapus: " + name);
            return true;
        }

        System.out.println("Karakter tidak ditemukan: " + name);
        return false;
    }

    // Menghitung jumlah karakter yang sedang tersimpan
    public int getTotalCharacters() {
        return characters.size();
    }

    // Mengembalikan salinan daftar, bukan ArrayList asli
    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    // Menghitung rata-rata level karakter
    public double getAverageLevel() {
        if (characters.isEmpty()) {
            return 0;
        }

        int totalLevel = 0;
        for (Character character : characters) {
            totalLevel += character.getLevel();
        }

        return (double) totalLevel / characters.size();
    }

    // Mencari semua karakter berdasarkan tipe
    public ArrayList<Character> findByType(CharacterType type) {
        ArrayList<Character> result = new ArrayList<>();

        for (Character character : characters) {
            if (character.getType() == type) {
                result.add(character);
            }
        }

        return result;
    }

    /**
     * Mencari karakter dengan nilai attack tertinggi.
     * @return salinan karakter terkuat, atau null jika daftar kosong
     */
    public Character findStrongest() {
        if (characters.isEmpty()) {
            return null;
        }

        Character strongest = characters.get(0);

        for (Character character : characters) {
            if (character.getAttack() > strongest.getAttack()) {
                strongest = character;
            }
        }

        
        Character copy = new Character(
            strongest.getName(),
            strongest.getType(),
            strongest.getLevel(),
            strongest.getHitPoints(),
            strongest.getAttack()
        );

        copy.setMana(strongest.getMana());
        return copy;

    }

    // Mengambil jumlah karakter yang pernah berhasil ditambahkan
    public static int getTotalCharacterCreated() {
        return totalCharacterCreated;
    }
}
