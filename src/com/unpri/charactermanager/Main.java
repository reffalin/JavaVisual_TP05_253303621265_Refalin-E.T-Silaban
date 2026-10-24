
package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        
        System.out.println("=== UJI RATA-RATA LIST KOSONG ===");
        CharacterManager managerKosong = new CharacterManager();
        System.out.println("Rata-rata saat kosong: "
                + managerKosong.getAverageLevel());

        System.out.println();

        Character arthur = new Character("Arthur", CharacterType.WARRIOR, 1, 100, 10);
        Character merlin = new Character("Merlin", CharacterType.MAGE, 3, 300, 30);
        Character robin = new Character("Robin", CharacterType.ARCHER, 2, 200, 20);
        Character luna = new Character("Luna", CharacterType.MAGE, 4, 400, 40);

        System.out.println("=== TAMBAH KARAKTER ===");
        manager.addCharacter(arthur);
        manager.addCharacter(merlin);
        manager.addCharacter(robin);
        manager.addCharacter(luna);

        System.out.println("\n=== UJI NAMA DUPLIKAT ===");
        Character arthurDuplicate = new Character("Arthur", CharacterType.HEALER, 5, 500, 50);
        System.out.println("Hasil tambah duplikat: " +
                manager.addCharacter(arthurDuplicate));
        System.out.println("Total karakter: " + manager.getTotalCharacters());

        System.out.println("\n=== CARI KARAKTER ===");
        System.out.println("Cari Merlin: " + manager.findByName("Merlin"));

        System.out.println("\n=== DAFTAR KARAKTER ===");
        for (Character character : manager.getAllCharacters()) {
            System.out.println(character);
        }

        System.out.println("\n=== RATA-RATA LEVEL ===");
        System.out.println("Rata-rata level: " + manager.getAverageLevel());

        System.out.println("\n=== CARI BERDASARKAN TIPE MAGE ===");
        for (Character character : manager.findByType(CharacterType.MAGE)) {
            System.out.println(character);
        }

        System.out.println("\n=== KARAKTER TERKUAT ===");
        System.out.println(manager.findStrongest());

        System.out.println("\n=== UJI SALINAN ARRAYLIST ===");
        ArrayList<Character> salinan = manager.getAllCharacters();
        salinan.clear();
        System.out.println("Jumlah di salinan setelah clear: " + salinan.size());
        System.out.println("Jumlah di manager tetap: " + manager.getTotalCharacters());

        System.out.println("\n=== UJI REFERENCE ===");
        Character a = new Character("Bima", CharacterType.WARRIOR, 2, 200, 20);
        Character b = a;
        b.setLevel(8);
        System.out.println("Level a: " + a.getLevel());
        System.out.println("a == b: " + (a == b));

        System.out.println("\n=== UJI EQUALS ===");
        Character c1 = new Character("Sinta", CharacterType.MAGE, 1, 100, 10);
        Character c2 = new Character("Sinta", CharacterType.ARCHER, 5, 500, 50);
        System.out.println("Nama sama, objek berbeda: " + c1.equals(c2));

        System.out.println("\n=== HAPUS KARAKTER ===");
        manager.removeCharacter("Robin");
        System.out.println("Total setelah hapus: " + manager.getTotalCharacters());

        System.out.println("\nTotal karakter yang pernah ditambahkan: " +
                CharacterManager.getTotalCharacterCreated());
    }
}
