package SOLID.SRP;

//only one work to validate user
class UserValidator{

    public boolean isValid(String username , String email){
        if(username==null || username.isEmpty()){
            return false;
        }
        if(!email.contains("@")){
            return false;
        }
        // other validation logic
        return true;
    }

}
// Handle all OTP services
class OTPService{
    public String generateOtp() {
        return String.valueOf((int) (Math.random() * 9000 + 1000));
    }

    public void sendOtp(String email, String otp) {
        System.out.println("Sending OTP to " + email + ": " + otp);
    }
}

// Handling all db related services
class UserRepository {

    public void save(String username, String email) {
        System.out.println("Saving user to database: " + username);
    }
}
// Handle all Activity
class ActivityLogger {

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}


public class SRPPrinciple {
    private UserValidator validator = new UserValidator();
    private OTPService otpService = new OTPService();
    private UserRepository repository = new UserRepository();
    private ActivityLogger logger = new ActivityLogger();

    public void register(String username, String email) {

        if (!validator.isValid(username, email)) {
            System.out.println("User validation failed!");
            return;
        }

        // Generate and send OTP
        String otp = otpService.generateOtp();
        otpService.sendOtp(email, otp);

        // Save user
        repository.save(username, email);

        // Log
        logger.log("User registered: " + username);
    }
}
