package src;

public class Hospital{
    public static void main(String[] args) {
        PatientenService cs = new PatientenService();
        MedikamenteService ps = new MedikamenteService();
        Controller cont = new Controller(cs,ps);
        UI ui = new UI(cont);
        try {
            ui.RUN();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
