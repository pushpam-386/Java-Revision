import java.io.Serializable;

public class Laptop implements Serializable {
    private String color;
    private String companyName;
    private String name;
    private String purpose;
    private CPU cpu;
    private GraphicCard graphicCard;



    public void displayDetails(){
        System.out.println("Laptop Name => "+name+
        "   Company name =>"+companyName+
        "   Laptop Color =>"+color+
        "   Laptop Purpose =>"+purpose+
        "   Cpu's Manufacturer =>"+cpu.getManufacturer()+
        "   Cpu's Processor =>"+ cpu.getProcessor()+
        "   Cpu's ClockSpeed =>"+ cpu.getClockSpeed()+
        "   Graphic card's Manufacturer =>"+graphicCard.getManufacturer()+
        "   Graphic card's Series =>"+graphicCard.getSeries()+
        "   Graphic card's Capacity =>"+graphicCard.getCapacity()
);
    }

    public Laptop() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }


}
