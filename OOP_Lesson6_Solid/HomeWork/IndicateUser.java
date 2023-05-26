public class IndicateUser implements Indicateable{

    private User user;

    public IndicateUser(User user){
        this.user = user;
    }

    public void indicate(){
        System.out.println("Report for user: "+ user.getName());
    }
}
