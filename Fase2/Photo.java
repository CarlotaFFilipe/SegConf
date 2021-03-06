import java.io.*;
import java.util.*;

public class Photo {
    //Mensagem
    public File foto;
    //Utilizadores que viram mensagem
    public List<String> vistoPor;
    //identificador da chave que cifrou esta foto
    public int indentificador;

    public Photo(String fotoName, String user){
        this.foto= new File(fotoName);
        vistoPor = new ArrayList<String>();
        vistoPor.add(user);
    }

    public void setIdentificador(int id){
        this.indentificador=id;
    }

    public int getIdentificador(){
        return this.indentificador;
    }

    //User viu a foto
    public void addVisto(String userName){
        vistoPor.add(userName);
    }

    //Ve se o user ja viu a foto
    public boolean userViu(String userName){
        return vistoPor.contains(userName);
    }

    /*
    public void addVisto(String userName){
        vistoPor.add(userName);
    }
    */

}