import java.util.List;

public class MyBlock implements Block{
    private String Collor;
    private String Material;
    public MyBlock(String collor,String material){
        this.Collor = collor;
        this.Material = material;
    }
    @Override
    public String getColor() {
        return Collor;
    }

    @Override
    public String getMaterial() {
        return Material;
    }

}