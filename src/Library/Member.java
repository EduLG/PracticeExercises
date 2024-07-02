package Library;

public class Member {

    private String number, name, adress;

    private Member (String number, String name, String adress){
        this.number = number;
        this.name = name;
        this.adress = adress;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString(){
        return "Member: \n" + "Member n.: " + number + "\nName: " + name + "\nAdress: " + adress;
    }
}
