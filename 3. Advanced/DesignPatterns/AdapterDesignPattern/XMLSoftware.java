package AdapterDesignPattern;

public class XMLSoftware implements XMLData{

    @Override
    public void readXMLData(){
        System.out.println("Understand only XML Data");
    }
}
