package modelo;

public class Cadastro {
    Long id;
    String nome_anuncio;
    String cliente;
    String dtInicio;
    String dtTermino;
    double valor;
    int visualizacao;
    int cliques;
    int compartilhamentos;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    } 
    public String getNome_anuncio() { 
        return nome_anuncio;
    } 
    public void setNome_anuncio(String nome_anuncio) { 
        this.nome_anuncio = nome_anuncio;
    } 
    public String getCliente() { 
        return cliente;
    } 
    public void setCliente(String cliente) { 
        this.cliente = cliente;
    } 
    public String getDtInicio() { 
        return dtInicio;
    } 
    public void setDtInicio(String dtInicio) { 
        this.dtInicio = dtInicio;
    } 

    public String getDtTermino() { 
        return dtTermino;
    } 
    public void setDtTermino(String dtTermino) { 
        this.dtTermino = dtTermino;
    } 
    public double getValor() { 
        return valor;
    } 
    public void setValor(double valor) { 
        this.valor = valor;
    } 
    public int getVisualizacao() { 
        return visualizacao;
    } 
    public void setVisualizacao(int visualizacao) { 
        this.visualizacao = visualizacao;
    }
    public int getCliques() { 
        return cliques;
    } 
    public void setCliques(int cliques) { 
        this.cliques = cliques;
    } 
    public int getCompartilhamentos() { 
        return compartilhamentos;
    } 
    public void setCompartilhamentos(int compartilhamentos) { 
        this.compartilhamentos = compartilhamentos;
    } 
}