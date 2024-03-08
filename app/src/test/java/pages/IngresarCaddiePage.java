package pages;

public class IngresarCaddiePage extends BasePage{
    private String txtIngresoCaddies = "//*[text()='Ingreso de caddies']";
    private String txtIngresarCaddie = " //*[@name='n_documento']";
    private String btnIngresar = "//button[contains(text(),'Ingresar')]";
    private String caddieIngresado = "//h2[@class='swal2-title']";
    public IngresarCaddiePage(){
        super(driver);
    }
    
    public String getTextIngresoCaddies(){
        return textFromElement(txtIngresoCaddies);
    }
    /**
     * This method allows the golf caddy entrance to the club.
     * @param numeroCaddie This is the document number already set in the system.
     */
    public void ingresarCaddie(String numeroCaddie){
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
        write(txtIngresarCaddie, numeroCaddie);
        clickElement(btnIngresar);
    }
    public String getTextCaddieIngresado(){
        return textFromElement(caddieIngresado);

    }
}
