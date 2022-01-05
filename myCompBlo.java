import java.util.ArrayList;
import java.util.List;


public class myCompBlo implements CompositeBlock{
    private String Color;
    private String Material;
    private List<myCompBlo> CompBlocks;


    public myCompBlo(String color,String material){
        this.Color = color;
        this.Material = material;
    }
    @Override
    public String getColor() {
        return Color;
    }

    @Override
    public String getMaterial() {
        return Material;
    }

    @Override
    public List<myCompBlo> getBlocks() {
        List <myCompBlo> additional = new ArrayList<>();
        for( myCompBlo blo : CompBlocks){
            additional.add(blo);
        }
        return additional;
    }
}
