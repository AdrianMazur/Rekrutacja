import java.util.*;

public class Wall implements Structure {
    private List<MyBlock> blocks;


    @Override
    public List<Block> findBlockByColor(String color) {

        return null;
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {

        return null;
    }

    @Override
    public int count() {
        return blocks.size();
    }


    public static void main(String args[]){
        Wall wall = new Wall();
        MyBlock bl1 = new MyBlock("beton", "szary");
        MyBlock bl2 = new MyBlock("beton","szary");
        MyBlock bl3 = new MyBlock("beton","grafit");
        System.out.println(bl2);
        wall.blocks = new ArrayList<>();
        wall.blocks.add(bl1);
        wall.blocks.add(bl2);
        wall.blocks.add(bl3);
        int counter = wall.count();
        System.out.println("Liczba elementów: " + counter);
       /* wall.findBlockByColor("Grafit");
        wall.findBlocksByMaterial("beton");*/

    }
}