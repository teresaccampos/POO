public class Sala {
  private int idSala;
  private int capacidadeSala;
  private String descricaoSala;
  private String statusSala;

  public Sala(int idSala, int capacidadeSala, String descricaoSala, String statusSala) {
    this.idSala = idSala;
    this.capacidadeSala = capacidadeSala;
    this.descricaoSala = descricaoSala;
    this.statusSala = statusSala;
  }

  public int getIdSala() {
    return idSala;
  }

  public void setIdSala(int idSala) {
    this.idSala = idSala;
  }

  public int getCapacidadeSala() {
    return capacidadeSala;
  }

  public void setCapacidadeSala(int capacidadeSala) {
    this.capacidadeSala = capacidadeSala;
  }

  public String getDescricaoSala() {
    return descricaoSala;
  }

  public void setDescricaoSala(String descricao) {
    this.descricaoSala = descricao;
  }

  public String getStatusSala() {
    return statusSala;
  }

  public void setStatus(String statusSala) {
    this.statusSala = statusSala;
  }
}
