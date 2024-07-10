package AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        XMLSoftware xmlDataSoftware = new XMLSoftware();
        JSONData xmlAdapter = new XMLToJSONDataAdapter(xmlDataSoftware);
        xmlAdapter.readJSONData();
    }
}
