package sv.com.pixelpalace.www.managedBeans;


import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class loginBean {
    private String usuario;
    private String password;

    public loginBean(){

    }

    public String getUsuario(){
        return this.usuario;
    }
    public String getPassword(){
        return this.password;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String validateLogin(){
        switch (this.usuario){
            case "empleado":
                return "empleado";
            case "admin":
                return "admin";

                default:
                return "";
        }
    }
}
