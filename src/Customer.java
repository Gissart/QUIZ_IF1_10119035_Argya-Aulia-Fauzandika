public class Customer extends ServicePrice implements CustomerInvoice{
    private String name,email;
    private boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public boolean isMember(){
        return member;
    }

    public void setMember(boolean Member){
        this.member = member;

    }


    @Override
    public String currentTime() {
        return null;
    }
}
