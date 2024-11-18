public class TipoAssento {
  private int idTipoAssento;
  private String descricaoAssento;
  private String statusAssento;

  //Método construtor 

  public TipoAssento(int idTipoAssento, String descricaoAssento, String statusAssento) {
    this.idTipoAssento = idTipoAssento;
    this.descricaoAssento = descricaoAssento;
    this.statusAssento = statusAssento;
  }

  //Getters & Setters

  public int getIdTipoAssento() {
    return idTipoAssento;
  }

  public String getDescricaoAssento() {
    return descricaoAssento;
  }

  public String getStatusAssento() {
    return statusAssento;
  }

  public void setDescricaoAssento(String descricaoAssento) {
    this.descricaoAssento = descricaoAssento;
  }

  public void setStatusAssento(String statusAssento) {
    this.statusAssento = statusAssento;
  }

  public void setIdTipoAssento(int idTipoAssento) {
    this.idTipoAssento = idTipoAssento;
  }  
}
