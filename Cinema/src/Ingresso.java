public class Ingresso {
  private int id;
  private double valorPago;
  private SalaAssento salaAssento;
  private Sessao sessao;  

  //Método construtor

  public Ingresso(int id, double valorPago, SalaAssento salaAssento, Sessao sessao) {
    this.id = id;
    this.valorPago = valorPago;
    this.salaAssento = salaAssento;
    this.sessao = sessao;
  }

  //Getters & Setters

  public int getId() {
    return id;
  }

  public double getValorPago() {
    return valorPago;
  }

  public SalaAssento getSalaAssento() {
    return salaAssento;
  }

  public Sessao getSessao() {
    return sessao;
  }

  public void setValorPago(double valorPago) {
    this.valorPago = valorPago;
  }

  public void setSalaAssento(SalaAssento salaAssento) {
    this.salaAssento = salaAssento;
  }

  public void setSessao(Sessao sessao) {
    this.sessao = sessao;
  }
}
