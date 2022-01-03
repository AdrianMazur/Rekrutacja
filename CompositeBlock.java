import java.util.List;

interface CompositeBlock extends Block {
    List<Wall.Block> getBlocks();
}