import java.util.*;

public class Wall implements Structure {
    private List<myCompBlo> blocks;


    @Override
    public Optional<myCompBlo> findBlockByColor(String color) {
        for( myCompBlo blo : blocks){
            if(blo.getColor().equals(color)){
                return Optional.of(blo);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<myCompBlo> findBlocksByMaterial(String material) {
        List <myCompBlo> additional = new ArrayList<>();
        for( myCompBlo blo : blocks){
            if(blo.getMaterial().equals(material)){
                additional.add(blo);
            }
        }
        return additional;

    }

    @Override
    public int count() {
        return blocks.size();
    }


    public static void main(String[] args){
        Wall wall = new Wall();

        myCompBlo bl1 = new myCompBlo("szary", "beton");
        myCompBlo bl2 = new myCompBlo("szary","beton");
        myCompBlo bl3 = new myCompBlo("grafit","gips");
        System.out.println("kolor:"+bl1.getColor()+ " Materiał:"+bl1.getMaterial());
        wall.blocks = new ArrayList<>();
        wall.blocks.add(bl1);
        wall.blocks.add(bl2);
        wall.blocks.add(bl3);
        int counter = wall.count();
        System.out.println("Liczba elementów: " + counter);
        List<myCompBlo> newlist = new ArrayList<>(wall.findBlocksByMaterial("beton"));
        /*wall2.blocks = new ArrayList<>(wall.findBlocksByMaterial("beton"));*/
        System.out.println("Liczba elementów: " + newlist.size());
        for(int i=0; i<newlist.size();i++){
            System.out.println(i+1+". Kolor:"+newlist.get(i).getColor()+", materiał:"+newlist.get(i).getColor());
        }
        List<Optional<myCompBlo>> newlist2 = new ArrayList<>();
        newlist2.add(wall.findBlockByColor("szary"));
        System.out.println("Liczba elementów: " + newlist2.size());


        /*getBlocks()
        myCompBlo bl4 = new myCompBlo("biały","gips");
        myCompBlo bl5 = new myCompBlo("beż","gips");
        myCompBlo bl6 = new myCompBlo("szary","gips");
        List <myCompBlo> tr= new ArrayList<>();*/




    }
}