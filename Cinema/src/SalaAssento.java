public class SalaAssento {
  private int idSalasAssento;
  private Assento assento;
  private Sala sala;

  //Método construtor

  public SalaAssento(int idSalasAssento, Assento assento, Sala sala) {
    this.idSalasAssento = idSalasAssento;
    this.assento = assento;
    this.sala = sala;
  }

  //Getters & Setters

  public int getIdSalasAssento() {
    return idSalasAssento;
  }

  public Assento getAssento() {
    return assento;
  }

  public Sala getSala() {
    return sala;
  }

  public void setIdSalasAssento(int idSalasAssento) {
    this.idSalasAssento = idSalasAssento;
  }

  public void setAssento(Assento assento) {
    this.assento = assento;
  }

  public void setSala(Sala sala) {
    this.sala = sala;
  }
}
