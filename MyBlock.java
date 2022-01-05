import java.util.List;

public class MyBlock implements Block{
    private String Color;
    private String Material;
    public MyBlock(){}
    public MyBlock(String color,String material){
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

}