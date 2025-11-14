package SOLID.SRP;

//Traditional (Non-SRP) Approach — Everything in One Clas
// One class is doing validation + OTP + DB save + logging + registration logic

class UserService{

    public void RegisterUser(String username , String email, String password){

        // Validate user
        if(username==null || username.isEmpty()){
            System.out.println("Invalid Username ");
        }
        if (!email.contains("@")){
            System.out.println("Invalid Email");
        }
//        generate otp

        String otp = generateotp();

        // 3. Save User to DB
        System.out.println("Saving user to DB: " + username);

        // 4. Log Activity
        System.out.println("User registered successfully: " + username);

    }
    public String generateotp(){
        return String.valueOf((int) (Math.random() * 9000 + 1000));
    }
}

public class Traditional {
    public static void main(String args[]){
        UserService userService = new UserService();
        userService.RegisterUser("yourname" , "youremail@gmail.com" , "yourpassword");

    }
}


//
//Problems -->
//
//        Hard to test
//
//        One change breaks other logic
//
//        No reuse
//
//        Too much responsibility