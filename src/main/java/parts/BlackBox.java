package parts;

import products.IProduct;

import java.util.ArrayList;

public class BlackBox extends Part {
    private String identifier;
    private ArrayList<String> log;

    public BlackBox(String manufacturer, long partNumber, IProduct baseProduct, String identifier) {
    super(manufacturer, partNumber, baseProduct);
    this.identifier = identifier;
    this.log = new ArrayList<>();
    }

    public String getIdentifier() {return identifier;}

    public void addtolog(String message) {log.add(message);}

    public ArrayList<String> getLog() {return log;}

}
