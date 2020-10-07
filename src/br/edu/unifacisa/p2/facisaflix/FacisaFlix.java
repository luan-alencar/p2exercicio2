package br.edu.unifacisa.p2.facisaflix;

import java.util.ArrayList;
import java.util.List;

public class FacisaFlix {
	private List<Serie> series;
	private List<Usuario> usuarios;

	public FacisaFlix() {
		series = new ArrayList<>();
		usuarios = new ArrayList<>();
	}

	public void adicionaSerie(Serie serie) {
		series.add(serie);
	}

	public void adicionaUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public void registraVisualizacao(Usuario usuario, Episodio episodio, int nota) {
		Visualizacao v = new Visualizacao(episodio, nota);
		usuario.adicionaVisualizacao(v);
	}

	public List<Serie> getTodasAsSeries() {
		return series;
	}

	public List<Serie> getSeriesPorEstilo(int estilo) {
		List<Serie> estilos = new ArrayList<>();
		for (Serie s : series) {
			if (s.getClassificacao() == estilo) {

			}
		}
		return estilos;
	}

	public List<Serie> getSeriesPorClassificacao(int classificacao) {
		List<Serie> serieClassificacao = new ArrayList<>();
		for (Serie s : series) {
			if (series.contains(s.getClassificacao())) {
				serieClassificacao.add(s);
			}
		}
		return serieClassificacao;
	}

	public List<Serie> getSeriesQueViu(Usuario usuario) {
		// primeiro pensei no seguinte: criei um array para armazenar as series q o
		// usuario viu
		List<Serie> serieQueViu = new ArrayList<Serie>();
		// dps para cada serie em series
		for (Serie serie : series) {
			// se tal serie contiver a serie especifica
			if (series.contains(serie)) {
				// adicione ao meu array
				serieQueViu.add(serie);
			}
		}
		return serieQueViu;
	}

	public List<Serie> getSeriesEmComum(Usuario u1, Usuario u2) {
		List<Serie> serieEmComum = new ArrayList<>();

		return serieEmComum;
	}

	public int getQuantidadeDeSeries() {
		int quantidadeDeSeries = 0;
		for (int i = 0; i < series.size(); i++) {
			quantidadeDeSeries++;
		}
		return quantidadeDeSeries;
	}

	public int getQuantidadeTotalDeEpisodios() {
		int numEpisodios = 0;
		// para cada serie
		for (Serie s : series) {
			// eu vou percorrer cada temporada
			for (Temporada t : s.getTemporadas()) {
				for (Episodio e : t.getEpisodios()) {
					numEpisodios++;
				}
			}
		}
		return numEpisodios;
	}

	public int getQuantidadeTotalDeMinutos() {
		int totalDeMInutos = 0;
		for (Serie serie : series) {
			for (Temporada t : serie.getTemporadas()) {
				for (Episodio e : t.getEpisodios()) {
					totalDeMInutos += e.getDuracao();
				}
			}
		}
		return totalDeMInutos;
	}
}
