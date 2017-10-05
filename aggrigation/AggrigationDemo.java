package aggrigation;

public class AggrigationDemo {
    int id;
    String name;
    AggrigationDemo(int id,String name){
        this.id=id;
        this.name=name;
    }
    void showData(){
        System.out.println(id);
        System.out.println(name);
    }
}
class AggrigationSecondDemo{
    String state;
    String country;
    AggrigationSecondDemo aggrigationSecondDemo;
    AggrigationSecondDemo(String state,String country){
        this.state=state;
        this.country=country;

    }
}
class AggrigatinThirdDemo{
    String address;
    AggrigatinThirdDemo aggrigatinThirdDemo;
    AggrigatinThirdDemo(String address){
        this.address=address;
    }
}
class Student{
    String city;
    int zipcode;
    AggrigationDemo aggrigationDemo;
    AggrigationSecondDemo aggrigationSecondDemo;
    AggrigatinThirdDemo aggrigatinThirdDemo;

    Student(String city,int zipcode,AggrigationDemo aggrigationDemo,AggrigationSecondDemo aggrigationSecondDemo,
            AggrigatinThirdDemo aggrigatinThirdDemo){
        this.city=city;
        this.zipcode=zipcode;
        this.aggrigationDemo=aggrigationDemo;
       this.aggrigationSecondDemo=aggrigationSecondDemo;
       this.aggrigatinThirdDemo=aggrigatinThirdDemo;

    }
    void display(){
        System.out.println("id :"+aggrigationDemo.id+"\t"+"name :"
                +aggrigationDemo.name+"\t"+"city :"+city+"\t"+"zipcode :"+zipcode);
        System.out.println("state :"+aggrigationSecondDemo.state+"\t"+"country: "+aggrigationSecondDemo.country);
        System.out.println("address :"+aggrigatinThirdDemo.address);
    }

    public static void main(String[] args) {
        AggrigationDemo aggrigationDemo=new AggrigationDemo(1,"pooja");
        AggrigationSecondDemo a=new AggrigationSecondDemo("maharashtra","india");
        AggrigatinThirdDemo ac=new AggrigatinThirdDemo("pune");
       Student student=new Student("navi mumbai",400705,aggrigationDemo,a,ac);
       student.display();
    }
}
