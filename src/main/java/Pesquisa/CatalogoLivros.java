package main.java.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIterlavoAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <=anoFinal) {
                    livrosPorIterlavoAnos.add(l);
                }
            }
        }
        return livrosPorIterlavoAnos;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("Use a cabeça", "Bert Bates", 2007);
        catalogoLivros.adicionarLivros("Padrões de projetos", "Eric Freeman", 2007);
        catalogoLivros.adicionarLivros("Código limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivros("Head First Servlets and JSP", "Bert Bates", 2012);
        catalogoLivros.adicionarLivros("Java Para Leigos", " Barry Burd", 2013);

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2007, 2007));

    }
}
