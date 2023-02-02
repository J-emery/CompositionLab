package parts;

import products.IProduct;

public class Radio extends Part{
    private int frequency;
    private String identifier;

    public Radio(String manufacturer, long partNumber, IProduct baseProduct, int frequency, String identifier){
        super(manufacturer,partNumber,baseProduct);
        this.frequency = frequency;
        this.identifier = identifier;
    }

    public void sendSOS(){
        System.out.println("SOS");
    }

    public int getFrequency(){
        return this.frequency;
    }

    public void setFrequency(int frequency){
        this.frequency = frequency;
    }

    public String getIdentifier(){
        return identifier;
    }
}
