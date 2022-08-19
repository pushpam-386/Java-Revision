public class Main {

    public static Laptop getLaptop(String laptopPurpose){
        if(laptopPurpose.equals("gaming")){
            Laptop gamingLaptop=new Laptop();
            GraphicCard graphicCard = new GraphicCard("Radeon","RTX 3050 Ti", "16GB");
            gamingLaptop.setGraphicCard(graphicCard);
            gamingLaptop.setName("Acer");
            gamingLaptop.setColor("Black");
            gamingLaptop.setCompanyName("Radeon");
            gamingLaptop.setPurpose("gaming");
            CPU cpu=new CPU("Radeon","Ryzen 9 5800H",3200.0);
            gamingLaptop.setCpu(cpu);


            return gamingLaptop;
        }
        else {
            return null;
        }
    }

    public static void main(String[] args) {
        Laptop gaming=getLaptop("gaming");

        gaming.displayDetails();

    }
}