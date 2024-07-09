package org.example;

//Erstellen Sie einen Java-Datensatz "Tier", der Eigenschaften für ID, Name, Art und Alter haben sollte. Wählen Sie geeignete Feldnamen.
//
//Machen Sie einen Commit.

public record Animal(
        int id,
        String name,
        String species,
        int age) {

}
