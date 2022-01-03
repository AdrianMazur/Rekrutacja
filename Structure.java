import java.util.List;
interface Structure {
    // zwraca dowolny element o podanym kolorze
    List<Wall.Block> findBlockByColor(String color);

    // zwraca wszystkie elementy z danego materiału
    List<Wall.Block> findBlocksByMaterial(String material);

    //zwraca liczbę wszystkich elementów tworzących strukturę
    int count();
}