package br.com.screenmatch;

import br.com.screenmatch.model.entities.DadosSeries;
import br.com.screenmatch.model.service.ConsumirApi;
import br.com.screenmatch.model.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var consumoApi = new ConsumirApi();
        var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
        ConverterDados conversor = new ConverterDados();
        DadosSeries series = conversor.obterDados(json,DadosSeries.class);
        System.out.println(series);
    }
}
