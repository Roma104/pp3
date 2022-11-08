public class DrivingLicence{
    //Atrubyty:
    private String lastName;
    private String names;
    private String place;
    private String startDate;
    private String endDate;
    private String organisation;
    private String number;
    private String categoty;

    //Metody
    public static void main(String[] args){
        DrivingLicence d1 = new DrivingLicence();
        d1.lastName = "Sun";
        d1.names = "Wukong";
        d1.place = "Flower Fruit Mountain";
        d1.startDate = "12.10.2018";
        d1.endDate = "13.10.2030";
        d1.organisation = "ABC";
        d1.number = "SW1661";
        d1.categoty = "B1";

        System.out.println("Names: " + d1.names + " Last name: "+ d1.lastName + " Date and place of getting licence: " + d1.startDate + " " + d1.place +
        " Valible till: " + d1.endDate + " Organisation: " + d1.organisation + " Number of licence: " + d1.number + " Category: " + d1.categoty);
    }

    public String getNames(){
        return names;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPlace(){
        return place;
    }
    public String getStartDate(){
        return startDate;
    }
    public String getEndDate(){
        return endDate;
    }
    public String getOrganisation(){
        return organisation;
    }
    public String getNumber(){
        return number;
    }
    public String getCategoty(){
        return categoty;
    }

    public void setNames(String newNames) {
        this.names = newNames;
      }

}