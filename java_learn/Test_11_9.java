import java.util.ArrayList;
import java.util.Map;

import javax.management.Descriptor;

import java.util.HashMap;

public class Test_11_9 {
    public static void main(String[] args) {
        //可以自行在Main方法中进行调试
    }
}
class ProductManager{

    private static Map<String,Product> productCache = null;
    public ProductManager(){
    }
    public static void addProduct(String deString,String id,String name,double price){
        if(productCache == null){
            productCache = new HashMap<String,Product>();
        }
        if(!productCache.containsKey(id)){
            Product newProduct = new Product();
            newProduct.setId(id);
            newProduct.setName(name);
            newProduct.setPrice(price);
            newProduct.setDescription(description);
            productCache.put(newProduct.getId(), newProduct);
        }
    }
    public static Product getProductById(String id){
        for(String key : productCache.keySet()){
            Product itemProduct = productCache.get(key);
            if(itemProduct.getId().equals(id))
                return itemProduct;
        }
        return null;
    }

    public static void printList(){
        if(productCache == null) {
            System.out.println("当前商店没有可用商品！");
        }else{
            System.out.println("商品编号\t商品名称\t\t商品价格\t商品介绍");
            for(String key : productCache.keySet()){
                Product itemProduct = productCache.get(key);
                System.out.println(String.format("%s\t%s\t\t%s\t%s",
                        itemProduct.getId(),
                        itemProduct.getName(),
                        itemProduct.getPrice(),
                        itemProduct.getDescription()));
            }
        }
    }
}


class Product{
    private String id;
    private String name;
    private String description;
    private double price;

    public Product(){

    }
    public Product(String id,String name,String description,double price){
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
    }

    public String getId(){
        return id;
    }    
    public void setId(String id){
        this.id=id;
    }

    public String getName(){
        return name;
    }    
    public void setName(String name){
        this.name=name;
    }
    public String getDescription(){
        return description;
    }    
    public void setDescription(String description){
        this.description=description;
    }
    public Double getPrice(){
        return price;
    }    
    public void setPrice(Double price){
        this.price=price;
    }
}


class OrderItem{

    private Product product;
    private int qualitity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQualitity() {
        return qualitity;
    }

    public void setQualitity(int qualitity) {
        this.qualitity = qualitity;
    }
    public OrderItem(Product product,int qualitity){
        this.product=product;
        this.qualitity=qualitity;
    }
    public double computerPrice(){
        return product.getPrice()*qualitity;
    }
}


class Order{

    public Order(){
        items = new ArrayList<OrderItem>();  
    }
    private String id;
    private ArrayList<OrderItem> items;
    private String address;
    private String phone;
    private String status;


    public void add(OrderItem item){
        if(item!=null){
            this.items.add(item);
        }
    }
    public double computerTotalPrice(){
        double totalprice =0;
        if(items!=null){
            for(OrderItem item : items){
                totalprice+=item.computerPrice();
            }
        }
        return totalprice;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<OrderItem> items) {
        this.items = items;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}