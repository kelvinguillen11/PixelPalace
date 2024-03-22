package sv.com.pixelpalace.www.managedBeans;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class superBean {
    private String usuario;
    private String password;

    public superBean(){

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
            case "super":
                return "super";
            default:
                return "";
        }
    }
}
