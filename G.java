class V {
    private int id;
    private String rotulo; //rotulação
    private int valor; //ponderação

    public V(){
        id = 0;
        valor = 0;
        rotulo = "";
    }

    public void setId(int id){
        this.id = id;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setRotulo(String rotulo){
        this.rotulo = rotulo;
    }

    public int getId(){
        return id;
    }

    public int getValor(){
        return valor; 
    }

    public String getRotulo(){
        return rotulo; 
    }
}


class E {
    private int id;
    private String rotulo; //rotulação
    private int valor;

    public E(){
    id = 0;
    valor = 0;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public void setRotulo(String rotulo){
        this.rotulo = rotulo;
    }

    public int getId(){
        return id;
    }

    public int getValor(){
        return valor; 
    }

    public String getRotulo(){
        return rotulo;
    }

}

public class G {
    public static void main(String[] args){

    }
    
}
