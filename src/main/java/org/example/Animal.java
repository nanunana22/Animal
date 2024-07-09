package org.example;

//Erstellen Sie einen Java-Datensatz "Tier", der Eigenschaften für ID, Name, Art und Alter haben sollte. Wählen Sie geeignete Feldnamen.
//Erstellen Sie in einer Hauptmethode mehrere Animals.

//Erstellen Sie in einer Hauptmethode mehrere Animals.
//Rufen Sie die automatisch generierten Methoden im Record auf und prüfen Sie,
// ob sie das tun, was Sie erwarten (equals, toString).


public record Animal(
        int id,
        String name,
        String species,
        int age) {
    @Override
    public String toString() {
        return "Animal{" +
                "id: " + id +
                " name: " + name  +
                " species: " + species +
                " age: " + age +
                '}';
    }
}
