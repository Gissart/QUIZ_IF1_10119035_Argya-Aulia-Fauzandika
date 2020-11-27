public class ServicePrice implements ServiceItem {

    private float priceService, discount;

    @Override
    public void displayService() {
        System.out.println("#*************************#\n" +
                "#***Rock n Roll Haircut***#\n" +
                "#*******Service List******#\n" +
                "1. Haircut : IDR 45K\n" +
                "2. Haircut + Hairwash: IDR 55K\n" +
                "3. Hairwash Only : IDR 15K\n" +
                "#*************************#\n");
        System.out.print("Choose (1/2/3):");
    }

    @Override
    public float getPrice(int serviceItem) {
        float priceService = 0;
        switch (serviceItem){
            case 1 : priceService = 45000;
                    break;
            case 2 : priceService = 55000;
                    break;
            case 3 : priceService = 15000;
                    break;
                            
        }
        return priceService;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        if(statusMember.equals("yes")){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if(isMember == true){
            discount = (float) (parServicePrice * 0.10);
        }else{
            discount =  0;
        }
        return discount;
    }

    public float getPriceService(){
        return priceService;
    }

    public void setPriceService(float priceService){
        this.priceService = priceService;
    }

    public float getTotalPay(float priceService, float discount){
        float total =  priceService - discount;
        return total;
    }


}
