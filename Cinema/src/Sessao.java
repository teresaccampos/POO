import java.time.format.DateTimeFormatter;

public class Sessao {
  private int idSessao;
  private DateTimeFormatter dataHoraSessao;
  private Filme filme;
  private Sala sala;
  private Funcionario funcionario;
  private String status;

  public Sessao(int idSessao, DateTimeFormatter dataHoraSessao, Filme filme, Sala sala, Funcionario funcionario, String status) {
    this.idSessao = idSessao;
    this.dataHoraSessao = dataHoraSessao;
    this.filme = filme;
    this.sala = sala;
    this.funcionario = funcionario;
    this.status = status;
  }

  public int getIdSessao() {
    return idSessao;
  }

  public void setIdSessao(int idSessao) {
    this.idSessao = idSessao;
  }

  public DateTimeFormatter getDataHoraSessao() {
    return dataHoraSessao;
  }

  public void setDataHoraSessao(DateTimeFormatter dataHoraSessao) {
    this.dataHoraSessao = dataHoraSessao;
  }

  public Filme getFilme() {
    return filme;
  }

  public void setFilme(Filme filme) {
    this.filme = filme;
  }

  public Sala getSala() {
    return sala;
  }

  public void setSala(Sala sala) {
    this.sala = sala;
  }

  public Funcionario getFuncionario() {
    return funcionario;
  }

  public void setFuncionario(Funcionario funcionario) {
    this.funcionario = funcionario;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
