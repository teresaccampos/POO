public class FilmeAtor {
  private int idAtor;
  private Ator ator;
  private Filme filme;
  private String personagem;
  private String principal;

  public FilmeAtor(int idAtor, Ator ator, Filme filme, String personagem, String principal) {
    this.idAtor = idAtor;
    this.ator = ator;
    this.filme = filme;
    this.personagem = personagem;
    this.principal = principal;
  }

  public int getIdAtor() {
    return idAtor;
  }

  public Ator getAtor() {
    return ator;
  }

  public Filme getFilme() {
    return filme;
  }

  public String getPersonagem() {
    return personagem;
  }

  public String getPrincipal() {
    return principal;
  }

  public void setIdAtor(int idAtor) {
    this.idAtor = idAtor;
  }

  public void setAtor(Ator ator) {
    this.ator = ator;
  }

  public void setFilme(Filme filme) {
    this.filme = filme;
  }

  public void setPersonagem(String personagem) {
    this.personagem = personagem;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }

  
}


