public class Assento {
  private int idAssento;
  private TipoAssento tipoAssento;


  //Método construtor

  public Assento(int idAssento, TipoAssento tipoAssento) {
    this.idAssento = idAssento;
    this.tipoAssento = tipoAssento;
  }

  //Getters & Setters

  public int getIdAssento() {
    return idAssento;
  }

  public TipoAssento getTipoAssento() {
    return tipoAssento;
  }

  public void setIdAssento(int idAssento) {
    this.idAssento = idAssento;
  }

  public void setTipoAssento(TipoAssento tipoAssento) {
    this.tipoAssento = tipoAssento;
  }
}
