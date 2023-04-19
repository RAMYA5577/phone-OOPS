public class LandLine implements Phone {

    private String myPhoneNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
        isRinging=false;
        isPowerOn=true;
    }

    public String getMyPhoneNumber() {
        return myPhoneNumber;
    }

    public void setMyPhoneNumber(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public boolean powerOn() {
        isPowerOn=true;
        return true;
    }

    @Override
    public void callNumber(String phoneNo) {
     if(isPowerOn==true){
         System.out.println("you r dialing he number");
     }
     else{
         System.out.println("your landline is off");
     }
     return;
    }

    @Override
    public void receiveCall(String phoneNo) {
         if(isPowerOn && myPhoneNumber.equals(phoneNo)){
             this.isRinging=true;
             System.out.println("hey, " +myPhoneNumber+"you are receiving a call");
         }
         else{
             System.out.println("power off");
         }
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("call answered");
            this.isRinging=false;}
            return true;

    }

    @Override
    public boolean isRinging() {
        if(isRinging==true){
            return true;}
            else{
                return false;
        }
            //return isRinging--->smartway
    }
}
