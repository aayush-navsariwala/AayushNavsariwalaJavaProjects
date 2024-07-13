package javaocp.buildingblocks;

public class BuildingBlocksWaterBottleExample {
    
    private String brand;
    private boolean empty;
    public static float code;

    public static void main(String[] args) {
        BuildingBlocksWaterBottleExample wb = new BuildingBlocksWaterBottleExample();
        System.out.println("Empty = " + wb.empty);
        System.out.println("Brand = " + wb.brand);
        System.out.println("Code = " + code);
    }
}