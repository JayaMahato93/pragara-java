package augst_5;

 class Depatment extends Comapany {
    String nameOfTheDepatment;
    public Depatment(String employeeName, int id, String nameOfTheDepatment) {
        super(employeeName, id);
        this.nameOfTheDepatment = nameOfTheDepatment;
    }
    public  void  showDepatment(){
        System.out.println("employeeName: "+employeeName +" :" +"id:"+id+": " +"nameOfTheDepatment :"+nameOfTheDepatment);
    }
}
