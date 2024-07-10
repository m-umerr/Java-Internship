package AdapterDesignPattern;

public class XMLToJSONDataAdapter implements JSONData{

    XMLData xmlData;

    XMLToJSONDataAdapter(XMLData xmlData){
        this.xmlData = xmlData;
    }

    @Override
    public void readJSONData(){
        xmlData.readXMLData();
        System.out.println("Converting XML Data to JSON Data");
    }
}