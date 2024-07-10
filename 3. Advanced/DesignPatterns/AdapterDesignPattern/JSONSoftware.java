package AdapterDesignPattern;

public class JSONSoftware implements JSONData{

    @Override
    public void readJSONData(){
        System.out.println("Understand only JSON Data");
    }
}