import java.util.*;

public class Mensagem {
    //Mensagem
    public String msg;
    //Utilizadores que viram mensagem
    public List<String> vistoPor;
    //identificador da chave que cifrou esta mensagem
    public int indentificador;

    //Construtor so com msg para fazer load de mensagens
    public Mensagem(String msg){
        this.msg = msg;
        vistoPor = new ArrayList<String>();
    }

    //Construtor com msg e user que enviou mensagem
    public Mensagem(String msg, String user){
        this.msg = msg;
        vistoPor = new ArrayList<String>();
        vistoPor.add(user);
    }
   

    //User viu a mensagem
    public void addVisto(String userName){
        vistoPor.add(userName);
    }

    
/////////////fase2
    public int getIdentificador(){
        return this.indentificador;
    } 
    public void setIdentificador(int id){
        this.indentificador=id;
    }
/////////////

    //Ve se o user ja viu a mensagem
    public boolean userViu(String userName){
        return vistoPor.contains(userName);
    }

    public String getStringMsg(){
        return this.msg;
    }
}