package pages;

public class LoginPage extends BasePage{
    private String txtCorreo = "//*[@type='email']";
    private String txtPass = "//*[@name='password']";
    private String btnIngresar = "//*[@value='Ingresar']";
    public LoginPage(){
        super(driver);
    }
    public void goToSicagolfLogin(){
        navigateTo("http://localhost/sicagolf_php/?controller=login");
    }
    /**
     * this method allows users fill their data for login into the application
     * @param email = it's the email which was registred previously
     * @param password = it's the password which was set for that account
     */
    public void fillData(String email, String password){
        write(txtCorreo, email);
        write(txtPass, password);
        clickElement(btnIngresar);
    }
    
}
