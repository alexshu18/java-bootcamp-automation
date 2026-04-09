package com.bootcampexcercise.module7.activity;

public class CustomExceptionActivityTest {

        public static void main(String[] args) {
            try {
                validateUser("John");
            } catch (CustomExceptionActivity c){
                System.out.println(c.getMessage());
            }
    }

    static void validateUser(String name) throws CustomExceptionActivity{
            String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

            int flag = 0;
            for (int i = 0; i < validUsers.length; i++){
                if (name.equals(validUsers[i])){
                    flag = 1;
                }
            }

            if (flag == 0){
                throw new CustomExceptionActivity();
            } else {
                System.out.println("Welcome to Payroll program");
            }
    }

}
