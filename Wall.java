import java.util.*;

public class Wall implements Structure {
    private List<Block> blocks;


    @Override
    public List<Block> findBlockByColor(String color) {
        for (Block block : blocks){
            if(block.Collor.equals(color))
                return (List<Block>)blocks;
        }
        return null;
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        for (Block blocks : blocks){
            if(blocks.Material.equals(material))
                return (List<Block>)blocks;
        }
        return null;
    }

    @Override
    public int count() {
        return blocks.size();
    }


    public class Block implements CompositeBlock{
        String Collor, Material;
        @Override
        public String getColor() {
            return Collor;
        }

        @Override
        public String getMaterial() {
            return Material;
        }

        @Override
        public List<Block> getBlocks() {
            List <Block> myList = new ArrayList<>();
            Block bl = new Block();
            bl.Collor=getColor();
            bl.Material=getMaterial();
            myList.add(bl);
            return (List<Block>) bl;
        }
    }
}