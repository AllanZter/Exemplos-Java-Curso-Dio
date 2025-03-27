package Sistema;

public enum EstadosBR {
    ACRE ("AC", "Acre"),
    ALAGOAS ("AL", "Alagoas"),
    AMAPA ("AP", "Amapá"),
    AMAZONAS ("AM", "Amazonas"),
    BAHIA ("BA", "Bahia"),
    CEARA ("CE", "Ceará"),
    ESPIRITO_SANTO ("ES", "Espírito Santo"),
    GOIAS ("GO", "Goiás"),
    MARANHAO ("MA", "Maranhão"),
    MATO_GOSSO ("MT", "Mato Grosso"),
    MATO_GROSSO_SUL ("MS", "Mato Grosso o Sul"),
    MINAS_GERAIS ("MG", "Minas Gerais"),
    PARA ("PA", "Pará"),
    PARAIBA ("PB", "Paraíba"),
    PERNAMBUCO ("PE", "Pernambuco"),
    PIAUI ("PI", "Piauí"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    RIO_GRANDE_NORTE ("RN", "Rio Grande do Norte"),
    RIO_GRANDE_SUL ("RS", "Rio Grande do Sul"),
    RONDONIA ("RO", "Rondônia"),
    RORAIMA ("RR", "Roraima"),
    SANTA_CATARINA ("SC", "Santa Catarina"),
    SAO_PAULO ("SP","São Paulo"),
    SERGIPE ("SE", "Sergipe"),
    TOCANTINS ("TO", "Tocantins"),
    DISTRITO_FEDERAL ("DF", "Distrito Federal"),                  
    ;
    
    private String nome;
    private String sigla;
    
    private EstadosBR (String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }
    
    public String getSigla(){
        return sigla;
    }
    public String getNome(){
        return nome;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
        
    }
