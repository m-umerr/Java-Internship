package FactoryDesignPattern;

public class MobileFactory {
    public static Mobile getMobile(String companyName){
        if("iphone".equals(companyName)){
            return new Iphone();
        }
        else if("samsung".equals(companyName)){
            return new Samsung();
        }
        else if("huawei".equals(companyName)){
            return new Huawei();
        }
        else{
            System.out.println("Invalid Input");
            return null;
        }
    }
}
